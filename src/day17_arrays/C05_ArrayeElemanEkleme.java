package day17_arrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {
    public static void main(String[] args) {

        //verilen arraye istenen elementi ekleyelim

        int[] a={1,2,3};
        int[] b={3,4,5,6,7};

        a=b;
        System.out.println(Arrays.toString(a));//[3, 4, 5, 6, 7]

        //arrayin uzunluğu değiştirilemez
        //arraye yeni array değeri atanabilir

        //SORU!!

        int [] arr={4,5,6};
        int eklenecekElement=10;



        // arr = new int[4]; // [0,0,0,0] direk atama yaparsak eski degerler kaybolur
        // once istenen uzunlukta yeni bir array olusturup
        // eski array'deki tum elementleri yeni array'e tasiyoruz
        // sonra istenen elementi'de atayip
        // yeni istedigimiz hale gelince
        // eskiArr = yeniArr; diyerek yeni array'in degerini eskisine atiyoruz

        int[] yeniArr= new int[arr.length+1]; // [0,0,0,0]
        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i];
        } // yeniArr [4,5,6,0]
        yeniArr[yeniArr.length-1] = eklenecekElement; // [4,5,6,10]
        System.out.println(Arrays.toString(yeniArr)); // [4, 5, 6, 10]
        arr = yeniArr;
        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 10]
    }
}
