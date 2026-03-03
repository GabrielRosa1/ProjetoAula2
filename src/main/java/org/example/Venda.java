package org.example;

import java.util.ArrayList;

public class Venda {
    private String codigo;
    private Cliente cliente = new Cliente();
    private Produto produto = new Produto();
    private int quantidade;
    private double precoUnitario;
    private String data;

    void registraVenda(String[] dados) {
        this.codigo = dados[0];
        this.cliente.registraCliente(dados[1]);
        this.produto.registraProduto(dados[2]);
        this.quantidade = Integer.parseInt(dados[3]);
        this.precoUnitario = Double.parseDouble(dados[4]);
        this.data = dados[5];
    }

    public static double faturamentoTotal(ArrayList<Venda> vendas) {
        double faturamentoTotal = 0;
        for (Venda venda : vendas) {
            faturamentoTotal += venda.precoUnitario * venda.quantidade;
        }

        return faturamentoTotal;
    }

    public static int quantidadeVendas(ArrayList<Venda> vendas) {
        int totalVendas = 0;
        for (Venda venda : vendas) {
            totalVendas += venda.quantidade;
        }
        return totalVendas;
    }

    public static double valorMedioVenda(ArrayList<Venda> vendas) {
        int totalVendas = quantidadeVendas(vendas);
        double faturamentoTotal = faturamentoTotal(vendas);
        return faturamentoTotal / totalVendas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
