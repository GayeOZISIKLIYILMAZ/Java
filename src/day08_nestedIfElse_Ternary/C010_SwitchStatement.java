package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C010_SwitchStatement {
    public static void main(String[] args) {

        //kullanıcıdan bir half isteyin o halfle başlayan
        // gün ismi yazdırın
        // yoksa geçersiz half yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir half giriniz");
        char girilenHalf=scan.next().charAt(0);

        girilenHalf=Character.toUpperCase(girilenHalf);


        switch (girilenHalf){

            case 'P' :
                System.out.println("Pazar pazartesi perşembe");
                break;
            case 'S':
                System.out.println("Salı");
                break;
            case 'C' :
                System.out.println("Carsamba cuma cumartesi");
                break;
            default:
                System.out.println("Geçersiz half");
        }

    }
}
