package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Produto {
    private String nome;
    private int totalVendido;
    private double faturamento;

    public void registraProduto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public static HashMap<String, Produto> hashmapProdutos(ArrayList<Venda> vendas) {

        HashMap<String, Produto> porNome = new HashMap<>();

        for (Venda v : vendas) {
            String nome = v.getProduto().getNome();

            Produto p = porNome.computeIfAbsent(nome, n -> {
                Produto novo = new Produto();
                novo.registraProduto(n);
                return novo;
            });

            p.totalVendido += v.getQuantidade();
            p.faturamento += v.getPrecoUnitario() * v.getQuantidade();

        }
        return porNome;
    }

    public static Produto maisVendido(ArrayList<Venda> vendas) {

        HashMap<String, Produto> porNome = hashmapProdutos(vendas);

        Produto melhor = null;
        int maisVendido = -1;

        for (Produto p : porNome.values()) {

            if (p.totalVendido > maisVendido) {
                maisVendido = p.totalVendido;
                melhor = p;
            }

        }

        return melhor;
    }

    public static Produto maiorFaturamento(ArrayList<Venda> vendas) {

        HashMap<String, Produto> porNome = hashmapProdutos(vendas);

        Produto melhor = null;
        double maiorFaturamento = -1;

        for (Produto p : porNome.values()) {
            if (p.faturamento > maiorFaturamento) {
                maiorFaturamento = p.faturamento;
                melhor = p;
            }
        }

        return melhor;

    }

    public static void totalPorProduto(ArrayList<Venda> vendas) {

        HashMap<String, Produto> porNome = hashmapProdutos(vendas);

        for (Produto p : porNome.values()) {
            System.out.printf("Nome: %s %n Total Vendido: %s %n Faturamento Total: %.2f$ %n", p.getNome(), p.getTotalVendido(), p.getFaturamento());
            System.out.println("=======================================");
        }
    }

}
