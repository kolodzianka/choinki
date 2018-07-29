package com.kolodzianka;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tance {

    public static void main(String[] args) {

        LinkedList<String> kobiety = new LinkedList<>();
        LinkedList<String> mezczyzni = new LinkedList<>();

        kobiety.add("Beata");
        mezczyzni.add("Łukasz");
        mezczyzni.add("Franciszek");
        mezczyzni.add("Władyslaw");
        kobiety.add("Zofia");
        kobiety.add("Jagoda");
        kobiety.add("Michalina");
        kobiety.add("Kasia");
        mezczyzni.add("Tomasz");
        mezczyzni.add("Tomasz");





        while (!kobiety.isEmpty()) {
            System.out.println(((LinkedList) kobiety).poll() + " + " + ((LinkedList) mezczyzni).poll());
            if (mezczyzni.isEmpty()) {
                System.out.println( " Nikt nie oczekuje");
            } else {}
            if (kobiety.isEmpty()){
                System.out.println("Nie ma kobiet oczekujacyhc");
            }else{}
        }
    }


}

