package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanıcınıGirdiğiDeğerleriToplama {

    public static void main(String[] args) {

        //Kullanıcıdan istediği kadar tamsayi alıp toplayın
        //kullanıcı q ya bastığında işlemi sonlandırıp
        //kaç sayi girildiğini ve toplamını yazdırın
        //q veya Q dışında tam sayi olamayan değer girilirse
        //hata mesejı verip yeni değer isteyerek işleme devam edin

        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan=new Scanner(System.in);


        do {
            System.out.println("Toplamak üzere tam sayi giriniz Biyirmek için q" +
                    "ya basınız ");

            try {
                girilenSayi= scan.nextInt();//q,Q veya geçersiz başka input girerese
                toplam+=girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                char input=scan.next().charAt(0);

                if (input=='q' ||input=='Q'){
             System.out.println("Girilen"+sayac+"adet tamsayının toplamı:"+toplam);

             break;

                }else {
                    System.out.println("Tam sayı değeri girmelisiniz");
                }
            }

        }while (true);
        System.out.println("Bu iş bu kadar");


    }
}
