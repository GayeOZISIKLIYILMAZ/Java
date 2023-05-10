package day19_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> halfler=new ArrayList<>();

        halfler.add("A");
        halfler.add("B");
        halfler.add("K");

        System.out.println(halfler);//[A, B, K]

        System.out.println(halfler.remove("B"));//true
        System.out.println(halfler);//[A, K]

        System.out.println(halfler.remove(0));// A
        System.out.println(halfler);//[K] kaldı

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar);//[1, 3, 18, 2]

        //sayılardan oluşan bir list varsa remove methoduna yazacağımız
        //sayıyı index olarak kabul eder
        sayilar.remove(1);
        System.out.println(sayilar);//[1, 18, 2] 1. siler

        //eğer sayiyi silmek istersek remove methodundan önce
        //o sayıyı bir objeye atayıp
        //remove methodunda obje ismini yazabiliriz

        //1i silelim

        Integer silinecekSayi=1;

        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);//[18 ,2] element olarak 1i sildi index olarak değil





    }
}
