package com.kolodzianka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrzypomnienieZadania {


    public static void main(String[] args) {

        //////////// Zad 3
        List<String> listaSlow = Arrays.asList("Dziś", "może ", "padać ", "albo", "i", "nie .");


        System.out.println(przygotujTekst(listaSlow));

    }

    public static String przygotujTekst(List<String> l) {

        String nowalista = new String();
        nowalista = l.stream()
                .map(s -> s.trim())
                .map(s -> s.toUpperCase())
                .reduce((s, s2) -> s + " " +s2 )
                .orElse("Nie ma nic");

        return nowalista;



    }

}
