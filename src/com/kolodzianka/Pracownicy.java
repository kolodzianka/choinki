package com.kolodzianka;

public class Pracownicy {

    private String imie;
    private String nazwisko;

    public Pracownicy(){};

    public Pracownicy (String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
