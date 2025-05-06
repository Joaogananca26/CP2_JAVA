package br.com.fiap.CP2.dto;

import br.com.fiap.CP2.model.Tamanho;
import jakarta.validation.constraints.*;

public class BrinquedoDTO {

    private Integer idBrinquedo;

    @NotBlank(message = "O nome do brinquedo é obrigatório!")
    @Size(min = 3, max = 200, message = "O nome deve ter entre 3 e 200 caracteres")
    private String nome;

    @NotBlank(message = "O tipo do brinquedo é obrigatório!")
    @Size(min = 3, max = 100, message = "O tipo deve ter entre 3 e 100 caracteres")
    private String tipo;

    @NotNull(message = "A classificação é obrigatória")
    @Min(value = 0, message = "Classificação mínima é 0")
    @Max(value = 18, message = "Classificação máxima é 18")
    private Integer classificacao;

    private Tamanho tamanho;

    @NotNull(message = "O preço é obrigatório")
    @DecimalMin(value = "0.01", message = "O preço deve ser maior que zero")
    private Double preco;

    // getters e setters
    public Integer getIdBrinquedo() {
        return idBrinquedo;
    }
    public void setIdBrinquedo(Integer idBrinquedo) {
        this.idBrinquedo = idBrinquedo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
