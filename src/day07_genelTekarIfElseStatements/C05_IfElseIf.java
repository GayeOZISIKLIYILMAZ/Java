package day07_genelTekarIfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin,
         Kadin, 60 yas ve uzeri ,
          Erkek 65 yas ve uzeri emekli olabilir.
           Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya
        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lütfen cinsiyetinizi giriniz " +
                "\n Kadın için:K Erkek için:E");
        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet=='K'&& yas>=60 ){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K'&& yas<60) {
            System.out.println("Emekli olman için " + (yas-60)+ "yıl çalışmalısın");

        } else if (cinsiyet=='E'&& yas>=65) {
            System.out.println("Emekli olabilirsin");

        } else if  (cinsiyet=='E' && yas<65) {
            System.out.println("Emekli olman için + "+ (yas-65)+"uıl çalışmalısın" );

        }

    }
}