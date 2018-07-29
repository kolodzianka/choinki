package com.kolodzianka;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KolekcjeZad3 {
    public static void main(String[] args) {


        HashMap<String, String> slownik = new HashMap();

        slownik.put("dom", "hause");
        slownik.put("pies", "dog");
        slownik.put("kot", "cat");
        slownik.put("lubi", "like");
        slownik.put("siedzi", "sit");

        tlumacz("Kot lubi  swoj dom",slownik);

        System.out.println("");
        System.out.println("/////// Zad 4");

        ileULiter("krakowianka");





    }

    public static void tlumacz (String zdanie, Map slownik){

        String [] tab = zdanie.split(" ");

        for (String s: tab){

            if(slownik.containsKey(s.toLowerCase())){
                System.out.print(slownik.get(s.toLowerCase()) + " ");
            } else {
                System.out.print((s) + " ");
            }
        }

    }

    public static void ileULiter (String wyraz){

        HashSet<Character> set = new HashSet<>();
        for (char l: wyraz.toCharArray()){
            set.add(l);
        }

        System.out.println(set.size());

    }

}
