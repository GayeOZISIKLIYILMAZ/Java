package day03_dataCastingWrapperClas;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan bir çemberin yarıçapını alın çevresini ve alanı nı yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen çemberin yarı çapını girinz");
        double yarıCap=scan.nextDouble();

        System.out.println("Cemberin cevresi : "+ 2*3.14* yarıCap);


    }
}
