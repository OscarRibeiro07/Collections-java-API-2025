package br.com.dio.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        System.out.println("***Numeros Pares ***");
       numeros.stream().filter(n-> n%2==0)
               .forEach(n-> System.out.println("Numero: " + n));


        System.out.println("***Numeros Pares Com Ordenação***");
        numeros.stream().filter(n-> n%2==0)
                .sorted()
                .forEach(n-> System.out.println("Numero: " + n));
    }




}
