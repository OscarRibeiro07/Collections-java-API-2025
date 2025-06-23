package br.com.dio.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){

            for (Livro l : livroList){

                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }

            }
        }

        return  livrosPorAutor;
    }

    public List<Livro>  pesquisaPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){

            for (Livro l : livroList){
                if (l.getAnoPublicacao()>= anoInicial&& l.getAnoPublicacao()<=anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroTitulo = null;

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equals(titulo)){
                   livroTitulo=l;
                    break;
                }
            }
        }

        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("LIVRO 1", "AUTOR 1", 1992);
        catalogo.adicionarLivro("LIVRO 2", "AUTOR 2", 1995);
        catalogo.adicionarLivro("LIVRO 3", "AUTOR 3", 2000);
        catalogo.adicionarLivro("LIVRO 4", "AUTOR 4", 2004);
        catalogo.adicionarLivro("LIVRO 5", "AUTOR 2", 2012);

        System.out.println("CATALOGO POR ANO: "+catalogo.pesquisaPorAno(2004,2012));
        System.out.println("CATALOGO POR AUTOR: "+catalogo.pesquisarPorAutor("AUTOR 2"));
        System.out.println("CATALOGO POR TITULO: "+catalogo.pesquisaPorTitulo("LIVRO 1"));


    }

}
