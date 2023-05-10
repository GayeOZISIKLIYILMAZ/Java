package day39_maps;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class C01_MapsIlkClass {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        //Bir map oluşturulurken ve element eklerken
        // bilgilere sonradan erişimin mümkün olabilmesi için
        //tüm elementlerin aynı bilgileri barındırdığından
        //ve aynı sıralama ile elemente eklendiğinden emin olmalıyız

        ogrenciMap.put(101, "Ali,Can,10,H,MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali,Cem,11,H,TM");
        ogrenciMap.put(104, "Ayse,Can,10,H,MF");
        ogrenciMap.put(105, "Ayse,Cem,11,M,TM");
        ogrenciMap.put(106, "Fatma,Han,10,K,Soz");


        //Mapde kaç element var

        System.out.println(ogrenciMap.size());//6
        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106]
        //tüm keyleri yazdırır.

        //tüm valuları yazdıralım
        System.out.println(ogrenciMap.values());
        //[Ali,Cem,10,H,MF, Veli,Can,10,M,TM, Ali,Can,11,M,Soz,
        // Ayse,Cem,11,M,Soz, Ayse,Han,10,H,MF, Veli,Han,10,H,MF]

        //value collectının içinde kaç element vardır

        System.out.println(ogrenciMap.values().size());//6 tane vardır


        Map<Integer, String> ogrencıMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrencıMap);
        /*
        101=Ali,Can,10,H,MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali,Cem,11,H,TM,
        104=Ayse,Can,10,H,MF,
        105=Ayse,Cem,11,M,TM,
        106=Fatma,Han,10,K,Soz}

         */
        System.out.println(ogrenciMap.get(104));//Ayse,Can,10,H,MF

        //105 numaralı öğrencinin adını soyadını yazdırın.

        int ogrenciKey = 105;

        String isimSoyisim = MapDepo.isimSoyisimYazdir(ogrenciMap, ogrenciKey);
        System.out.println(ogrenciKey + "Nolu öğrenci isim soyisim" + isimSoyisim);

    }

}








