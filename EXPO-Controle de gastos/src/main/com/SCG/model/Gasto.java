package main.com.SCG.model;

public class Gasto {
    private String nomegasto;
    private double valor;

    public Gasto(String nome, double valor) {
        this.nomegasto = nome;
        this.valor = valor;
    }

    public String getNomegasto() {
        return nomegasto;
    }

    public double getValor() {
        return valor;
    }
}