package main.com.SCG.model;

public class Usuario {
    private String nome;
    private double receita;

    public Usuario(String nome, double receita) {
        this.nome = nome;
        this.receita = receita;
    }

    public String getNome() {
        return nome;
    }

    public double getReceita() {
        return receita;
    }
}