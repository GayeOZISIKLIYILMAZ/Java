package day04_dataCastingWrapperclases;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {

       // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir half giriniz");
        char girilenHaalf=scan.next().charAt(0);

        System.out.println("Girilen half : " + girilenHaalf +
                               "Girilen halften sonraki 3 half : " +
               (char)(girilenHaalf+1)  + " ," +(char)(girilenHaalf+2) + ","+
                        (char)(girilenHaalf+3)+","
                            );
    }
}
