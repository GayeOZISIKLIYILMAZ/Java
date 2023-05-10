package day13_methodOlusturma;
import java.util.Scanner;
public class C02_İkiSayiyiToplama {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayi alıp toplamlarını yazdıran
        //bir method oluşturun

      ikiSayıTopla();
    }

    public static void ikiSayıTopla(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Toplmak için iki sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("İki sayi toplamı : "+ (sayi1+sayi2));
    }
}
