package day26_localTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {


        //kullanıcıdan 2 farklı kişinin isim ve doğum taarihinin
        //gün ay ve yılını alıp hangi tarihte doğan
        //kişinin daha büyük olduğunu yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("İlk kişinin ismini giriniz");
        String isim1=scan.nextLine();

        System.out.println("İkinci kişinin ismini girin");
        String isim2=scan.nextLine();

        System.out.println("İlk kişinin doğum tarihini gün ay yıl olarak girin");
        int gun=scan.nextInt();
        int ay=scan.nextInt();
        int yil= scan.nextInt();

        LocalDate tarih1=LocalDate.of(yil,ay,gun);


        System.out.println("İkinci kişinin doğum tarihini gün ay yıl olarak girin");

        gun= scan.nextInt();
        ay= scan.nextInt();
        yil= scan.nextInt();

        LocalDate tarih2=LocalDate.of(yil,ay,gun);

        System.out.println(tarih2.isAfter(tarih1) ?
                            "Buyuk olan" +isim1 :

                             "Buyuk olan"+isim2);

    }
}
