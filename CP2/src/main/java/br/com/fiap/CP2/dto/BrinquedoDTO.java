package br.com.fiap.CP2.dto;


import br.com.fiap.CP2.model.Tamanho;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BrinquedoDTO {

    private int idBrinquedo;

    @NotBlank(message = "O nome do brinquedo é obrigatório!")
    @Size(min=3,max=200,message = "O nome deve ter entre 3 e 200 caracteres")
    private String nome;


    private String tipo;


    private int classificacao;


    private Tamanho tamanho;


    private double preco;

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

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getIdBrinquedo() {
        return idBrinquedo;
    }

    public void setIdBrinquedo(int id) {
        this.idBrinquedo = id;
    }
}
