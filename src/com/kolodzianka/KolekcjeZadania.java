package com.kolodzianka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class KolekcjeZadania {

    public static void main(String[] args) {

        List<Float> liczby = new ArrayList<>();
        Random rand = new Random(100);


        while (Math.random() >0.01) {

            liczby.add((float) Math.random() * 100.00f);
        }

        System.out.println(liczby);

        List<Float> liczbyPI =new ArrayList();

        liczbyPI = liczby.stream()
                .map(f -> f*(float)Math.PI)
                .collect(Collectors.toList());

        System.out.println(liczbyPI);
    }


}
