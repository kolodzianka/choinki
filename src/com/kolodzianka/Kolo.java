package com.kolodzianka;

public class Kolo {

    public static void main(String[] args) {

        for (int i = 0; i<11; i++){
            for (int j=0; j< 11-i*4; j++){

                System.out.print(" ");


            }
            for (int k=0; k<1+2*i*4; k++) {

                System.out.print("*");

            }

            System.out.println("");
        }
    }
}
