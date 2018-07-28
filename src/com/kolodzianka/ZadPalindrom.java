package com.kolodzianka;

import java.util.Stack;

public class ZadPalindrom {

    public static void main(String[] args) {


        Stack<Character> stos = new Stack<>();
        String slowo = "Ala";

        stos.push(slowo.charAt(0));
        stos.push(slowo.charAt(1));
        stos.push(slowo.charAt(2));

        String noweSlowo;

        noweSlowo = stos.pop().toString() + stos.pop().toString() + stos.pop().toString();

        System.out.println(noweSlowo);

        if (slowo.equalsIgnoreCase(noweSlowo)){
            System.out.println("Jest palindromem");;
        }else {
            System.out.println("Nie jest palindromrm");
        }

    }


}
