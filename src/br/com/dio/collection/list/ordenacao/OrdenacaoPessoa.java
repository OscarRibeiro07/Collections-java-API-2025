package br.com.dio.collection.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenaPorIdade(){
        List<Pessoa> pessoaPorIdade=new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public  List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura=new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        System.out.println("***********CADASTRO DE PESSOAS***********");
        ordenacaoPessoa.adicionarPessoa("Nome 1", 15,1.86);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30,1.87);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 20,1.88);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 25,2.00);
        System.out.println("***********ORDENAÇÃO POR IDADE***********");
        System.out.println(ordenacaoPessoa.ordenaPorIdade());
        System.out.println("***********ORDENAÇÃO POR ALTURA***********");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
