package org.example;
import java.util.ArrayList;


public class Loja {
    static void main() {
        ArrayList<Venda> vendas = Arquivo.abrirArquivo("vendas.csv");
        double faturamentoTotal = Venda.faturamentoTotal(vendas);
        int quantidadeVendas = Venda.quantidadeVendas(vendas);
        double valorMedioVenda = Venda.valorMedioVenda(vendas);
        System.out.println(faturamentoTotal);
        System.out.println(quantidadeVendas);
        System.out.println(valorMedioVenda);
    }
}
