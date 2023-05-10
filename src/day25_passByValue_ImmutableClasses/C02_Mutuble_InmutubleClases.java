package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutuble_InmutubleClases {
    public static void main(String[] args) {

        /*
        String ve Wrapper claslar immutuble oldukları için
        DEĞİŞTİRİLEMEZLER
        Array ve List mutuble oldukları için atama yapmasakta
        değerleri DEĞİŞİR.
         */

        String str="Java gün geçtikçe daha da keyifli oluyor";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str);//Java gün geçtikçe daha da keyifli oluyor

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar);//[5, 8]


        sayilar.set(0,7);
        sayilar.remove(1);

    }
}
