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

    public double getTotalGasto() {
        return totalGasto;
    }

    public int getQuantidadeCompras() {
        return quantidadeCompras;
    }

    public static HashMap<String, Cliente> hashmapClientes(ArrayList<Venda> vendas) {

        HashMap<String, Cliente> porNome = new HashMap<>();

        for (Venda v : vendas) {
            String nome = v.getCliente().getNome();
            double gasto = v.getQuantidade() * v.getPrecoUnitario();

            Cliente c = porNome.computeIfAbsent(nome, n -> { // computIfAbsent foi um metodo pesquisado
                Cliente novo = new Cliente();
                novo.registraCliente(n);
                return novo;
            });

            c.totalGasto += gasto;
            c.quantidadeCompras += v.getQuantidade();
        }

        return porNome;

    }

    public static Cliente clienteMaisGastou(ArrayList<Venda> vendas) {

        HashMap<String, Cliente> porNome = hashmapClientes(vendas);

        Cliente melhor = null;
        double maior = -1.0;

        for (Cliente c : porNome.values()) {
            if (c.totalGasto > maior) {
                maior = c.totalGasto;
                melhor = c;
            }
        }

        return melhor;
    }

    public static void totalPorCliente(ArrayList<Venda> vendas) {

        HashMap<String, Cliente> porNome = hashmapClientes(vendas);

        for (Cliente c : porNome.values()) {
            System.out.printf("Nome: %s %n Total Gasto: %.2f$ %n Quantidade de Compras: %s %n", c.getNome(), c.getTotalGasto(), c.getQuantidadeCompras());
            System.out.println("=============================");
        }
    }

}

