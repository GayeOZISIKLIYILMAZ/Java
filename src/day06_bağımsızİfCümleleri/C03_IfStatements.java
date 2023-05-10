package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Uckenin 3 kenar uzunluğunu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        // javada 2li karşılaştırma vardır 3lü yoktur.

        if(kenar1==kenar2 && kenar1==kenar3 );
        System.out.println("Girilen kenarlar bir eskenar ucgen olusturur.");

    }
}
