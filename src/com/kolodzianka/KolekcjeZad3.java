package com.kolodzianka;

import java.util.HashMap;
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

}
