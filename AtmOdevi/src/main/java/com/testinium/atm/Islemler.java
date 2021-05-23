package com.testinium.atm;

public class Islemler {


    public  void paraCek(Double bakiye,double tutar){
        if ((bakiye - tutar)< 0) {
            System.out.println("Yeterli Bakiyeniz yok...");
        }else {
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz : " + bakiye);
        }
    }

    public void paraYatır(Double bakiye,double tutar) {
        bakiye +=  tutar;
        System.out.println("Yeni Bakiyeniz : " + bakiye);

    }
}