package br.com.dio.streamAPI.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
  public static void main(String[] args) {
    System.out.println("*****EXEMPLO DA AULA*****");
    // Criar uma lista de palavras
    List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

    // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
    // imprimir cada palavra que passou no filtro
    palavras.stream()
            .filter(maisDeCincoCaracteres)
            .forEach(System.out::println);




    List<String> comparaPalavra = Arrays.asList("Jabuticaba", "Jacaranda", "Jujuba", "Gelo", "Agua");
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o caracter ou o conjunto decaracter  que deseja comparar");
    String nome = sc.next();
    System.out.println("*****teste de pradicate*****");
    Predicate<String> quantidadeDeCaracters = letra ->letra.length()>4;
    Predicate<String> listaPorLetra = letra ->letra.contains(nome);

    System.out.println("Stream por quantidade de letras");
    comparaPalavra.stream()
            .filter(quantidadeDeCaracters)
            .forEach(System.out::println);


    System.out.println("Stream por letra especifica");
    comparaPalavra.stream()
            .filter(listaPorLetra)
            .forEach(System.out::println);




  }

}
