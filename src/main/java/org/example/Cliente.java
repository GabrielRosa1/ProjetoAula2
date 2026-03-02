package org.example;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private double totalGasto;
    private int quantidadeCompras;

    public void registraCliente(String nome) {
        this.nome = nome;
    }

    public static Cliente clienteMaisGastou(ArrayList<Venda> vendas) {
        int total = 0;
        for (Venda venda : vendas) {

        }
    }
}


