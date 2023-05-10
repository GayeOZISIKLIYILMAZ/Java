package day19_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar);//[3, 5, 2]

        System.out.println(sayilar.get(0)) ; //3

        //son elementi yazdırın

        System.out.println(sayilar.size()-1);//2

        //2 elemeentini 12 yapın

        System.out.println(sayilar.set(2, 12));//2

        // 5i 7 yapalım

        System.out.println(sayilar.set(1, 7));//5 değiştirdiği elemanı getiriyor

        System.out.println(sayilar);//[3, 7, 12]

    }
}
