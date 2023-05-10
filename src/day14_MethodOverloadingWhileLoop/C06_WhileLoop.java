package day14_MethodOverloadingWhileLoop;
import java.util.Scanner;
public class C06_WhileLoop {
    public static void main(String[] args) {


        //kullanıcıdan toplanmak üzere sayılar alın
        //toplam 500ü aşınca
        //kaç sayı girdiğini ve sayıların yoplamını yazdırın

        Scanner scan = new Scanner(System.in);


        int girilenSayi = 0;
        int toplam = 0;
        int girilenSayiAdedi = 0;

        while (toplam < 500) { //toplam 500den küçük olduğu süre boyunca çalış

            System.out.println("Toplanmak üzere bir tam sayi giriniz");

            girilenSayi = scan.nextInt();
            toplam += girilenSayi;
            girilenSayiAdedi++;


        }
      System.out.println("Toplam " + girilenSayiAdedi + "adet sayi girildi :" + toplam);
    }
}