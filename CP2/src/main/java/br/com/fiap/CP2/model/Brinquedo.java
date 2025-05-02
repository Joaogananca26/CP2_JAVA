package br.com.fiap.CP2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tds_tb_brinquedos")
@SequenceGenerator(name = "brinquedo_seq",allocationSize = 1,sequenceName = "tb_brinquedos_seq")
public class Brinquedo {
    public Brinquedo(){

    }

    public Brinquedo(String nome, String tipo, int classificacao, Tamanho tamanho, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Id
    @Column(name="id_brinquedo")
    @GeneratedValue(generator ="brinquedo_seq",strategy=GenerationType.SEQUENCE)
    private int idBrinquedo;

    @Column(name = "Nome",nullable = false,length = 200)
    private String nome;

    @Column(name = "Tipo",nullable = false,length = 200)
    private String tipo;

    @Column(name = "Classificacao",nullable = false)
    private int classificacao;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "Tamanho",nullable = false)
    private Tamanho tamanho;

    @Column(name = "Preco",nullable = false)
    private double preco;

    public int getIdBrinquedo() {
        return idBrinquedo;
    }

    public void setIdbrinquedo(int idBrinquedo) {
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
}
