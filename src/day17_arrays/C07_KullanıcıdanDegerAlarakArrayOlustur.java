package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanıcıdanDegerAlarakArrayOlustur {
    public static void main(String[] args) {

        //kullanıcıdan array oluşturmak üzere pozitif sayılar alın
        //kullanıcıya işlemi bitirmesi için sıfıra basmasını söyleyin
        //önceki clastan method kullanarak aldığımız arre ekleyin

        Scanner scan = new Scanner(System.in);
        int girilenSayi = 1;
        int[] arr = new int[0];//[]


        while (girilenSayi != 0) {
            System.out.println("Array'e eklemek icin pozitif tamsayilar girin" +
                    "\nislemi bitirmek icin 0'a basin");

            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {

                arr = C06_ArrayeElemanEklemeMethodu.arrayeElemenyEkle(arr, girilenSayi);
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}