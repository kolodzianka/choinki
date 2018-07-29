package com.kolodzianka;

import java.util.HashMap;
import java.util.Map;

public class KolekcjeZadania2 {

    public static void main(String[] args) {

        Map <String, String> listaPracowników = new HashMap<>();

        listaPracowników.put("a1231", "Lucjan Baran");
        listaPracowników.put("a1232", "Agata Kuna");
        listaPracowników.put("a1233", "Beata Sowa");
        listaPracowników.put("a1234", "Karolina Pryk");
        listaPracowników.put("a1235", "Andrzej Zupa");

        System.out.println(listaPracowników.get(pracownik("A1233")));



    }

    public static String pracownik ( String id){

        return         id.toLowerCase();




    }

}
