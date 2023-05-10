package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı=scan.nextInt();

        if(sayı%5==0){
            System.out.println("Sayı 5in tam katı");
        }

        //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        if(sayı%3==0) {
            System.out.println("Uc ile bölünebilen sayi");
        }
            if(sayı%5==0){
                System.out.println("Beş ile bölünebilen sayı");
            }

        }
    }

