package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C03_nestedIfElse {
    public static void main(String[] args) {


         /*
        Kullanicidan cinsiyetini ve yasini alin,
         Kadin, 60 yas ve uzeri ,
          Erkek 65 yas ve uzeri emekli olabilir.
           Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya
        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Hatalı giriş yapılırsa kullanıcıyı uyarın
         */
      // Ana değişken yaş

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lütfen cinsiyetinizi giriniz " +
                "\n Kadın için:K Erkek için:E");
        char cinsiyet = scan.next().charAt(0);

        if(cinsiyet=='k' || cinsiyet=='K');


        if (yas<16 || yas>80){
            System.out.println("Gecersiz yas");
        } else if (yas<60) { // 16-60 yas arasi
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olmak icin " +(60-yas)+" yil daha calismalisin");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin " +(65-yas)+" yil daha calismalisin");
            }else{
                System.out.println("Gecersiz cinsiyet girisi");
            }
        } else if (yas<65) { // 60-65 yas arasi
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olabilirsin ");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin " +(65-yas)+" yil daha calismalisin");
            }else{
                System.out.println("Gecersiz cinsiyet girisi");
            }
        }else {// 65-80 arasi
            if (cinsiyet=='e'||cinsiyet=='E'||cinsiyet=='k'||cinsiyet=='K'){
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("Gecersiz cinsiyet girisi");
            }
        }
    }
}





