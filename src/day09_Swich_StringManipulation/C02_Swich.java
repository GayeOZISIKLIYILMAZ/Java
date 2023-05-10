package day09_Swich_StringManipulation;

import java.util.Scanner;

public class C02_Swich {
    public static void main(String[] args) {

        //Kullanicidan ay numarasini alip mevsimi yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ay numarası giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo){
            case 1 :
            case 2 :
                System.out.println("Kıs");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("İlkbahar");
                break;
            case 6 :
            case 7 :
            case 8:
                System.out.println("Yaz");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
        }

    }
}
