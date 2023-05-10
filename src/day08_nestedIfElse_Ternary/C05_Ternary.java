package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi alın mutlak değerine çevirin
        // sayı=sayı(mutlak değer)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

      sayi=sayi>=0 ? sayi:sayi*(-1);
        System.out.println(sayi);



        }

    }

