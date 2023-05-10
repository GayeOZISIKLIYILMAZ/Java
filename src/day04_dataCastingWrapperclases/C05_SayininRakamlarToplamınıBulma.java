package day04_dataCastingWrapperclases;

import java.util.Scanner;

public class C05_SayininRakamlarToplamınıBulma {
    public static void main(String[] args) {
        // kullanıcıdan 3 basamaklı bir sayi alın sayının rakamlar toplamını yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println( "Lütfen 3 basmaklı tam sayı giriniz");

        int girilenSayi=scan.nextInt();//135

        int rakam=girilenSayi%10;

        int rakamlarToplami=rakam;

        girilenSayi=girilenSayi/10; //13

        rakam=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+rakam;

        girilenSayi=girilenSayi/10; //13/10=1

        rakam=girilenSayi%10;

        rakamlarToplami=rakamlarToplami+rakam;
        System.out.println("Girilen sayını rakamlar toplamı " + rakamlarToplami);//9




    }
}
