package day03_dataCastingWrapperClas;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini soyismini ve yaşını alıp aşağıdaki formatta yazdırın
        // J.Doe,44

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi soyisminiz ve yaşınızı giriniz "+
               " \n Her bilgiden sonra ENTER a basınız " );

          char isimİlkHalf = scan.nextLine().charAt(0);
          String soyİsim=scan.nextLine();
          double yas= scan.nextDouble();

        System.out.println("Girilen bilgiler " + isimİlkHalf + " " + soyİsim + yas);







    }
}
