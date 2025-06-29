package br.com.dio.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3,-9,-78);
        System.out.println("**Listando todos os numeros**");
        numeros.stream().sorted().toList();
        System.out.println(numeros);


        System.out.println("**Listando todos os numeros **");

        boolean negativo=numeros.stream().anyMatch(n-> n<0);
                if (!negativo){
                    System.out.println("Não possui numeros negativos");
                }else {
                    System.out.println("Possui numeros negativos");
                }
    }




}
