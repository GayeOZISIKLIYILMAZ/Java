package day19_arrayList;

import day17_arrays.C06_ArrayeElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        /*
        ArrayList uzunluğu esnek bir listedir
        array alt yaısını kullanır ancak ekleme ve silme gibi işlemlerde
        daha avantajlıdır

        ArrayListin tek dezavantajı var oda elementleri tek tek eklememiz gerekir
         */

        int[]arr={3,4};
        arr= C06_ArrayeElemanEklemeMethodu.arrayeElemenyEkle(arr,5);
        System.out.println(Arrays.toString(arr));//[3, 4, 5]


        List<String> halfler=new ArrayList<>();
        System.out.println(halfler);// [ ] boş bir list oluşturur.

        halfler.add("s");
        halfler.add("l");
        halfler.add("a");
        System.out.println(halfler);// [s,l,a]


    }
}
