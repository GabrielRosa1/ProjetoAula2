package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
    private String nome;
    private double totalGasto;
    private int quantidadeCompras;

    public void registraCliente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public static Cliente clienteMaisGastou(ArrayList<Venda> vendas) {
        HashMap<Cliente, Integer> totalporCliente = new HashMap<>();

        for (Venda v : vendas) {
            Cliente c = v.getCliente();
            int gasto = v.getQuantidade() * v.getPrecoUnitario();

            totalporCliente.put(c, totalporCliente.getOrDefault(c, 0) + gasto);
        }
    return null;
    }
}


