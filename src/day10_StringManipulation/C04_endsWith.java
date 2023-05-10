package day10_StringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        // kullanicidan bir mail alin
        //  - mail @ icermiyorsa “gecersiz mail”
        //  - mail @gmail.com icermiyorsa, “mail gmail olmali”
        //  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        // yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen email adresinizi giriniz");
        String email=scan.nextLine();

      if (!email.contains("@")){
          System.out.println("Geçersiz mail");
      }  if (!email.contains("@ mail.com")) {
          System.out.println("mail gmail olmalı");

      }  if (!email.endsWith("@ mail.com")) {
          System.out.println("Mailde yazım hatası var");

          //tüm hataları söylemek için bağımsız if cümlesi kullanırız
          // 3ünüde kontrol eder.

      }

    }
    }

