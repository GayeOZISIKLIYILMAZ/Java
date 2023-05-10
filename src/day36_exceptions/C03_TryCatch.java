package day36_exceptions;

public class C03_TryCatch {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=0;


        try {

            System.out.println(sayi1/sayi2);
            System.out.println("deneme1");
            System.out.println("deneme2");
            System.out.println("deneme3");


        } catch (ArithmeticException e) {

            System.out.println("Bolen 0 olmamalı");

        }

        /*
        Bir try bloğunda exception oluşursa o satırdan
        catch satırına kadar aradaki tüm kodlar IGNORE edilir

        Eğer try bloğunda exception oluşmassa catch devreye girmez
         */
    }
}
