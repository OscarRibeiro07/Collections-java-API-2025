package br.com.dio.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio01 {
    public static void main(String[] args) {
        //LISTANDO NUMEROS EM ORDEM CRESCENTE
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        System.out.println("\n***ORDENAÇÃO COM COMPARE***");
        numeros.sort(Integer::compareTo);
        System.out.println(numeros);
        System.out.println("\n");
        System.out.println("***ORDENAÇÃO COM PREDICATE***");
//        Integer quantidade = numeros.size();
        Predicate<Integer> ordenacao = n-> n> numeros.size() ;
        numeros.stream()
                .filter(ordenacao)
                .sorted()
                .toList();

        System.out.println(numeros);
    }
}
