package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

                     //NOT
        //Eğer bir olay için sadece 2 olasılık varsa ve bu olasılıklardan
        // birisi mutlaka çalışacaksa if else statement kullanırız...



        //Kullanicidan notunu alin
        // 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("pozitif bir tam sayı giriniz");
        double sayi=scan.nextDouble();

        if (sayi>=50){
            System.out.println("Sınıfı geçtiniz");
        }else {
            System.out.println("Maalesef kaldınız");
        }



        // kullanıcıdan pozitif bi tam sayı alın
        // sayının tek veya çif olduğunu yazdırın

        System.out.println("Pozitif bir tam sayi giriniz");
        int sayı= scan.nextInt();

        if (sayı%2==0){
            System.out.println("Çift sayı");
        }else{
            System.out.println("Tek sayi");
        }




       // kullanıcıdan bir tam sayı alın 5 ile bölünüp bölünmediğini yazdırın.

        if (sayı%5==0){
            System.out.println("Sayı 5 ile tam olarak bölünür");
        }else {
            System.out.println("5ile tam olarak bölünemez");
        }


    }
}
