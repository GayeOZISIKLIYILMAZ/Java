package day12_forLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsada program çalışsın

       Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini tam sayi olarak giriniz");
        int bas= scan.nextInt();
        System.out.println("Lütfen bitiş değerini yam sayi olarak giriniz");
        int bit=scan.nextInt();

        int toplam=0;

        if (bas<bit){

            for (int i = bas; i <=bit ; i++) {
                toplam +=i;

            }

        }else { //baş değeri bitiş değerinden büyük

            for (int i = bas; i >=bit ; i++) {
                toplam+=i;

            }

        }
        System.out.println("Sayıların toplamı " + toplam);

    }
}
