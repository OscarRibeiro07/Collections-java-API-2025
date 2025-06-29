package br.com.dio.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        System.out.println("***Todos os Numeros***");
        List<Integer> listaNumeros = numeros.stream().sorted().toList();
        System.out.println(listaNumeros);

        System.out.println("***Numeros sem impares***");
        Predicate<Integer> numerosImpares = n-> (n % 2) != 0;
        numeros.removeIf(numerosImpares);
        System.out.println(numeros);


    }




}
