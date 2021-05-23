package com.testinium.atm;

public abstract class Musteri {

    private String tcNo;
    private String Ad;
    private String Soyad;
    private double hesapBakiye;


    public Musteri() {
    }
    public Musteri(String tcNo, String ad, String soyad, double hesapBakiye) {
        super();
        this.tcNo = tcNo;
        this.Ad = ad;
        this.Soyad = soyad;
        this.hesapBakiye = hesapBakiye;
    }
    public String getTcNo() {
        return tcNo;
    }
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return Ad;
    }
    public void setAd(String ad) {
        this.Ad = ad;
    }
    public String getSoyad() {
        return Soyad;
    }
    public void setSoyad(String soyad) {
        this.Soyad = soyad;
    }
    public double getHesapBakiye() {
        return hesapBakiye;
    }
    public void setHesapBakiye(double hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }
    @Override
    public String toString() {
        return " [tcNo=" + tcNo + ", Ad=" + Ad + ", Soyad=" + Soyad + ", hesapBakiye=" + hesapBakiye ;

    }


}
