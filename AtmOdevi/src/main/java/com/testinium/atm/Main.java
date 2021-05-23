package com.testinium.atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  musteriNo = "";
        Double bakiye;
        double tutar ;
        Islemler islemler = new Islemler();
        Map<String,Musteri> hashMap= new HashMap<>();
        Musteri musteri1 = new BireyselMusteri("21822726254", "Ahmet", "YILDIZ", 10000.36, "kavacık İstanbul");
        Musteri musteri2 = new BireyselMusteri("21753162252", "Merve", "YILDIZ", 5371.21,  "paşabahçe İstanbul");
        Musteri musteri3 = new BireyselMusteri("21524153554", "Hilal", "YILDIZ", 11246.36, "kanlıca İstanbul");
        Musteri musteri4 = new KurumsalMusteri("21822726259", "Zeki",  "YILDIZ", 378546.32, "Yıldız TEKSTİL");
        Musteri musteri5 = new KurumsalMusteri("23736426258", "Fatma", "YILDIZ", 123546.32, "Eryılmaz TEKSTİL");

        hashMap.put("111", musteri1);
        hashMap.put("222", musteri2);
        hashMap.put("333", musteri3);
        hashMap.put("444", musteri4);
        hashMap.put("555", musteri5);

        System.out.println("ATM'mize Hoş Geldiniz...");
        System.out.println("**************");
        System.out.println("Müşteri Girişi");
        System.out.println("**************");

        System.out.println("Lütfen Müşteri Numaranızı Giriniz.");

        while(scanner.hasNextLine()) {
            musteriNo = scanner.nextLine();
            if(hashMap.containsKey(musteriNo)) {
                System.out.println("Hoşgeldiniz " + hashMap.get(musteriNo));
                bakiye = hashMap.get(musteriNo).getHesapBakiye();
                System.out.println("Hangi İşlemi Yapmak İstersiniz");
                System.out.println("Para Yatırmak İçin 1'e , Para Çekmek İçin 2'ye Basın : ");
                switch(scanner.nextInt()) {
                    case 1 :
                        System.out.println("Lütfen Yatırmak İstediğiniz tutarı girin");
                        tutar = scanner.nextInt();
                        islemler.paraYatır(bakiye,tutar);
                        break;
                    case 2 :
                        System.out.println("Lütfen Çekmek İstediğiniz tutarı girin");
                        tutar = scanner.nextInt();
                        islemler.paraCek(bakiye,tutar);
                        break;
                    default : System.out.println("Geçersiz İşlem İstediniz Lütfen Tekrar Müşteri Numaranızı Girin");
                }
            }else {
                System.out.println("Lütfen Müşteri Numaranızı Doğru Giriniz!");
            }
        }

    }
}







