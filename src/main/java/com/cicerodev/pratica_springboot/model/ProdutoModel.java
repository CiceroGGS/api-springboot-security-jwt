package com.cicerodev.pratica_springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class ProdutoModel {
    /*====================================================*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    /*====================================================*/
    public ProdutoModel(){}

    public ProdutoModel(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    /*====================================================*/
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    /*====================================================*/
}
