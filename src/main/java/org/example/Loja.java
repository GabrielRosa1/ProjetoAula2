package org.example;
import java.util.ArrayList;


public class Loja {
    static void main() {

        ArrayList<Venda> vendas = Arquivo.abrirArquivo("vendas.csv");

        System.out.printf("%n");
        System.out.println("===============Cálculos  Gerais===============");
        System.out.printf("%n");
        System.out.printf("Faturamento total da loja: %.2f$%n", Venda.faturamentoTotal(vendas));
        System.out.printf("Quantidade total de itens vendidos: %s%n", Venda.quantidadeVendas(vendas));
        System.out.printf("Valor médio por item vendido: %.2f$%n", Venda.valorMedioVenda(vendas));
        System.out.printf("%n");
        System.out.println("===========Estatísticas por Cliente===========");
        System.out.printf("%n");
        System.out.println("=======Melhor  Cliente=======");
        System.out.printf("Melhor Cliente (mais gastou) %n Nome: %s %n Total Gasto: %.2f$ %n Quantidade de itens Comprados: %s %n",
                Cliente.clienteMaisGastou(vendas).getNome(), Cliente.clienteMaisGastou(vendas).getTotalGasto(), Cliente.clienteMaisGastou(vendas).getQuantidadeCompras());
        System.out.println("=============================");
        System.out.printf("%n");
        System.out.println("======Total por Cliente======");
        Cliente.totalPorCliente(vendas);
        System.out.printf("%n");
        System.out.println("===========Estatísticas por Produto===========");
        System.out.printf("%n");
        System.out.println("=========Produto Mais Vendido==========");
        System.out.printf("Nome: %s %n Total de Itens Vendidos: %s %n Faturamento Total: %.2f$ %n",
            Produto.maisVendido(vendas).getNome(), Produto.maisVendido(vendas).getTotalVendido(), Produto.maisVendido(vendas).getFaturamento());
        System.out.println("=======================================");
        System.out.printf("%n");
        System.out.println("=======Produto Maior Faturamento=======");
        System.out.printf("Nome: %s %n Total de Itens Vendidos: %s %n Faturamento Total: %.2f$ %n",
                Produto.maiorFaturamento(vendas).getNome(), Produto.maiorFaturamento(vendas).getTotalVendido(), Produto.maiorFaturamento(vendas).getFaturamento());
        System.out.println("=======================================");
        System.out.printf("%n");
        System.out.println("===========Total por Produto===========");
        Produto.totalPorProduto(vendas);
        System.out.printf("%n");
        System.out.println("==============================================");

    }
}
