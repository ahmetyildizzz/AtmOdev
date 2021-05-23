package com.testinium.atm;

public class BireyselMusteri extends Musteri{


    private String evAdres;


    public BireyselMusteri() {
        super();
    }

    public BireyselMusteri(String tcNo, String ad, String soyad, double hesapBakiye, String evAdres) {
        super(tcNo, ad, soyad, hesapBakiye);
        this.evAdres = evAdres;
    }

    public String getEvAdres() {
        return evAdres;
    }

    public void setEvAdres(String evAdres) {
        this.evAdres = evAdres;
    }

    @Override
    public String toString() {
        return   super.toString() + " evAdres = " + evAdres + "]";

    }

}
