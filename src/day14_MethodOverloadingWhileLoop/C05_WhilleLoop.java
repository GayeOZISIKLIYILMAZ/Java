package day14_MethodOverloadingWhileLoop;
import java.util.Scanner;
public class C05_WhilleLoop {
    public static void main(String[] args) {

        /*
        Başlangıç ve bitiş değeri belli olan veya
        kaç kere tekrar edileceği bilinen looplarda
        for loop ideal olarak kullanılabilir.
        ANCAK Tekrar sayısı belli olmayan başlangıç veya bitişi başka bir variabıla
        bağlı olan durumlarda While Loop tercih edilir.
         */

        //50 ve 100 arasında sınırlar dahil sayıları toplayın

        int toplam=0;

        for (int i = 50; i <=100 ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam : "+toplam);

     //aynı soruyu while loop ile yapalım
        //for loopta 3 şeyi takip ederiz
        //1-başlangıç değeri
        //2-bitiş şartı
        //3-artış veya azalış şartı

        toplam=0;
        int sayi=50;

        while (sayi<=100){

            toplam+=sayi;

            sayi++;
        }
        System.out.println("While ile toplam : "+toplam);

    }
}
