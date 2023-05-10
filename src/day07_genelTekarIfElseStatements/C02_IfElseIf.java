package day07_genelTekarIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Dönem notunuzu giriniz");
        double not=scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Geçersiz not girişi");
        } else if (not>=85) {
            System.out.println("Tebrikler notunuz AA");

        } else if (not>=65) {
            System.out.println("BB ile geçtiniz");

        } else if (not>=50) {
            System.out.println("CC ile geçtiniz");

        }else {
            System.out.println("DD malesef kaldınız");
        }
    }
}
