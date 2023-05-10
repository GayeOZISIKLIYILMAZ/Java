package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

         /*
        Kullanicidan cinsiyetini ve yasini alin,
         Kadin, 60 yas ve uzeri ,
          Erkek 65 yas ve uzeri emekli olabilir.
           Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya
        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Hatalı giriş yapılırsa kullanıcıyı uyarın
         */

        // birden fazla değişkene bağlı if else statementlerı
        //yazarken önce değişkenlerden birine göre ana yapıyı oluşturalım
        //cinsiyeti ana değişken yapalım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lütfen cinsiyetinizi giriniz " +
                "\n Kadın için:K Erkek için:E");
        char cinsiyet = scan.next().charAt(0);

        if(cinsiyet=='k' || cinsiyet=='K'){

            if (yas<16 && yas>=80){
                System.out.println("Geçersiz yas girişi");
            } else if (yas<60) {
                System.out.println("Emekli olman için : "+ (60-yas)+"Yıl çalışmalısın");

            } else{
                System.out.println("Emekli olablirsin");
            }


        } else if (cinsiyet=='e'|| cinsiyet=='E') {

          if (yas<16 || yas>=80) {
              System.out.println("Geçersiz yaş girişi");
          } else if (yas<65) {
              System.out.println("Emekli olman için :" + (65-yas)+ "yıl çalışmalısın");

          }else {
              System.out.println("Emekli olabilirsin");
          }


        }else {
            System.out.println("Geçersiz cinsiyet");
        }


    }

    }

