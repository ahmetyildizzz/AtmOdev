package com.testinium.atm;

public class KurumsalMusteri extends Musteri{

    private String sirketAd;

    public KurumsalMusteri(String tcNo, String ad, String soyad, double hesapBakiye, String sirketAd) {
        super(tcNo, ad, soyad, hesapBakiye);
        this.sirketAd = sirketAd;
    }

    public String getSirketAd() {
        return sirketAd;
    }

    public void setSirketAd(String sirketAd) {
        this.sirketAd = sirketAd;
    }

    @Override
    public String toString() {
        return  super.toString() + " sirketAd=" + sirketAd + "]";
    }


}
