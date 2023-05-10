package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        //uzun bir listeyi javada list olarak kaydetmek istersek
        //tek tek eklemek istemezsek pratik olarak bi arraye
        //oluşturup loop ile tüm elementleri list ile ekleyebiliriz


        int[]arr={2,3,4,5,6,3,8,9,4,2,1,5,9};

        List<Integer>sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);


        }
        System.out.println(sayilar);//[2, 3, 4, 5, 6, 3, 8, 9, 4, 2, 1, 5, 9]

        //tek tek eklememek için arrye yapıp yukardaki gibi yaparız


        //listede element olarak 3 varmı kontrol edin

        System.out.println(sayilar.contains(3));//true

        System.out.println(sayilar.contains(7));//false

        sayilar.clear();
        System.out.println(sayilar);//[] hepsini siler.


    }
}
