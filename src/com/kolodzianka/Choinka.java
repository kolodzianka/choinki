package com.kolodzianka;

public class Choinka {
    public static void main(String[] args) {

        for (int i = 0; i<11; i++){
            for (int j=0; j< 11-i; j++){

                    System.out.print(" ");

            }
            for (int k=0; k<1+2*i; k++) {

                System.out.print("*");
            }

            System.out.println("");
        }
        for (int l=0;l<3;l++){
            for (int m=0;m<9 ;m++){
                System.out.print(" ");
            }
            for (int n=0; n<5; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
