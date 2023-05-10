package day17_arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip,
        // yeni halini bize donduren bir method olusturun
        int[] arr = {2,4,7,8};

        // arr'ye method'u kullanarak 5 ekleyin

       arr= arrayeElemenyEkle(arr,5);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayeElemenyEkle(int[]arr , int eklenecekElement){

        int[]yeniArray=new int[arr.length+1];//[0,0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {
            yeniArray[i]=arr[i];
        } // yeniArr [2,4,7,8,0]
        yeniArray[yeniArray.length-1] = eklenecekElement;
        return yeniArray;
    }
}
