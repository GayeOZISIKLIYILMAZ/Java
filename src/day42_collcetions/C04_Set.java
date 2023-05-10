package day42_collcetions;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        Set<Integer>sayilar=new HashSet<>();

        sayilar.add(12);
        sayilar.add(15);

        Set<Integer>sıralıSet=new TreeSet<>();

        sıralıSet.add(23);
        sıralıSet.add(34);
        sıralıSet.addAll(sayilar);
        System.out.println(sıralıSet);//[12,15,23,34]

        //Bir hashset ve tree set oluşturalım ikisinede
        //rondom 1000 tane sayı ekleyip
        //işlem sürelerini hesaplayalım.

        Random rnd=new Random();
        int sayi;

        LocalTime hasBas=LocalTime.now();

        for (int i = 0; i <1000 ; i++) {
              sayi= rnd.nextInt(100000);
              sıralıSet.add(sayi);
        }
        LocalTime hasBit=LocalTime.now();

        LocalTime treeBas=LocalTime.now();

        for (int i = 0; i <1000 ; i++) {
            sayi= rnd.nextInt(10000);
            sıralıSet.add(sayi);

        }
        LocalTime treeBit=LocalTime.now();

        System.out.println("HashSet bas "+ hasBas+"bitis"+hasBit);
        System.out.println("treeSet bas:"+treeBas+"bitis"+treeBit);


    }
}
