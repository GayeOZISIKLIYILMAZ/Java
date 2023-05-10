package day14_MethodOverloadingWhileLoop;
import java.util.Scanner;
public class C07_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir şifre isteyin aşağıdaki şartları sağlayana kadar
        //her seferinde hataları söyleyip yeni şifre isteyin
        //şartları sağlayan şifre olduğunda
        //"5inci denemenizde başarılı şifre oluşturuldu" şek yazın

        //-İlk half küçük half olmalı
        //son half büyük half olmalı
        //boşluk içermemeli
        //8 karakter veya daha uzun olmalı

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;
        while (flag != 4) {
            flag = 0;
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            // - ilk harf kucuk harf olmali
            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;
            } else {
                System.out.println("Ilk karakter kucuk harf olmali");
            }
            // - son harf buyuk harf olmali
            if (sifre.charAt(sifre.length() - 1) >= 'A' &&
                    sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("Son karakter buyuk harf olmali");
            }
            // - bosluk icermemeli
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                flag++;
            }
            // - 8 karakter veya daha uzun olmali
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("Uzunluk en az 8 karakter olmali");
            }
            denemeSayisi++;
        }
    System.out.println("Tebrikler! " + denemeSayisi + ". " +
            "denemede sifreniz basari ile kaydedildi");

    }
}



