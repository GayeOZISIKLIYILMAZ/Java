package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if ('A' <= girilenKarakter && girilenKarakter <= 'Z') {
            System.out.println("Girilen karakter büyük half");
        }else {
            System.out.println("Girilen karakter büyük half değil");
        }
    }
}