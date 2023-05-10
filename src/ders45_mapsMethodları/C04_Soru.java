package ders45_mapsMethodları;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public static void main(String[] args) {

        //verilen bir cümlede kullanılan karekterleri
        //ve kaçar kere kullanıldığını yazdırın

        String str="Javayi balonu patlatmadan bitirelim";
        //J=1 a=7 v=1 y=1 ......

        String []strArr=str.split("");

        Map<String,Integer> kullanımMiktarlariMap=new TreeMap<>();

        for (int i = 0; i < strArr.length ; i++) {

            //ele aldığım element map de yoksa kullanım mik 1 olarak ekleyeceğiz



            //mapde varsa kullanım miktarını 1 arttır
            kullanımMiktarlariMap.computeIfPresent(strArr[i],(k,v) -> v+1);
            kullanımMiktarlariMap.putIfAbsent(strArr[i],1);

        }
        System.out.println(kullanımMiktarlariMap);
    }
}
