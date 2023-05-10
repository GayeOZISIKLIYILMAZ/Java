package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı alın sayı çift ise
        // "sayı çift"
        //değilse "tek sayı" yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("Çift sayi");
        }else {
            System.out.println("Tek sayi");
        }

        System.out.println(sayi%2==0 ? "Çift sayi" : "Tek sayi");
    }
}
