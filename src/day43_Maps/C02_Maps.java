package day43_Maps;

import day39_maps.MapDepo;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        //Öğrenciler mapinde şubesi H olan öğrencileri
        //isim soyisim ve sınıflarını yazdıralım

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        /*
        101=Ali,Can,10,H,MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali,Cem,11,H,TM,
        104=Ayse,Can,10,H,MF,
        105=Ayse,Cem,11,M,TM,
        106=Fatma,Han,10,K,Soz
         */

        ogrenciMap.keySet();
        //Bir mapteki keyleri set olarak döndürür

        Set<Integer>ogrenciKeySet=ogrenciMap.keySet();
        System.out.println(ogrenciKeySet);
        //[101, 102, 103, 104, 105, 106]

        ogrenciMap.values();
        //Bir mapteki tüm valueleri collection olarak döndürür

        Collection<String > ogrenciValueCollection=ogrenciMap.values();
        System.out.println(ogrenciValueCollection);

        /*
        [Ali,Can,10,H,MF,
        Veli-Cem-11-M-Soz,
        Ali,Cem,11,H,TM,
        Ayse,Can,10,H,MF,
        Ayse,Cem,11,M,TM,
        Fatma,Han,10,K,Soz]
         */





    }
}
