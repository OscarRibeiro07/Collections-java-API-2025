package br.com.dio.collection.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adiconaProduto(Long cod, String nome, double valor, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, valor, quantidade));

    }

    public void exibeProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double valorTotalCalculado() {
        double valorTotal = -0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += p.getQuantidade() * p.getValor();
            }
        }
        return valorTotal;
    }

    public Produto produtoMaisCaro() {

        Produto maisCaro = null;
        double maiorPreco  = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                    if (p.getValor()>maiorPreco){
                        maisCaro=p;
                        maiorPreco=p.getValor();


                    }
            }
        }
        return maisCaro;

    }

    public static void main(String[] args) {
    EstoqueProdutos produtos = new EstoqueProdutos();
    produtos.adiconaProduto(1L, "A",15.5d,1);
    produtos.adiconaProduto(3L, "D",52.30d,2);
    produtos.adiconaProduto(4L, "E",12.8d,5);
    produtos.adiconaProduto(2L, "B",11.20d,7);


        System.out.println(produtos.valorTotalCalculado());
        System.out.println(produtos.produtoMaisCaro());
        produtos.exibeProdutos();
    }
}
