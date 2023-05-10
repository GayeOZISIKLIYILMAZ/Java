package day20_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_equals {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(3);
        sayilar1.add(8);
        sayilar1.add(1);
        sayilar1.add(2);

        List<Integer>sayilar2=new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(1);
        sayilar2.add(8);
        sayilar2.add(2);
        sayilar2.add(5);

        System.out.println(sayilar1.equals(sayilar2));//false

        sayilar2.remove(4);// sayilar 2 den 4.indexdeki 5i sildik

        System.out.println(sayilar1.equals(sayilar2));//false yine olmadı çünkü sıralama
                                                          //farklı

        //equals hem elementleri hem indexleri kontrol eder.

        Collections.sort(sayilar1);   //Arraylerdeki gibi hemen sort yapamıyoruz
        Collections.sort(sayilar2);   //Collections clasından sort yapar düzenleriz.

        System.out.println(sayilar1.equals(sayilar2));//tru



    }
}
