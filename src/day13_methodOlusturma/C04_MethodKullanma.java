package day13_methodOlusturma;
import java.util.Scanner;
public class C04_MethodKullanma {
    public static void main(String[] args) {

        //kullanıcıdan 10 dan küçük 2 pozitif sayı alıp
        //faktoriel değerlerini toplayın

        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan küçük 2 adet pozitif tam sayi girin");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

     int sonuc= C03_Faktoryel.faktoryelHesapla(sayi1)+
             C03_Faktoryel.faktoryelHesapla(sayi2);

        System.out.println(sonuc);
    }
}