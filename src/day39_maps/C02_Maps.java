package day39_maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();

        ogrenciMap.put(105,"Hasan-Can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");

        System.out.println(ogrenciMap);

        /*
        Eğer mapde olan bir keya yeni değer eklersek eskiyi siler
        yeni değeri yazar.

        101=Ali,Can,10,H,MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali,Cem,11,H,TM,
        104=Ayse,Can,10,H,MF,
        105=Hasan-Can-11-K-MF,
        106=Fatma,Han,10,K,Soz,
        108=Hikmet-Han-10-M-TM
         */

        //108 numaralı öğrencinin isim soyismini yazdır

    System.out.println(MapDepo.isimSoyisimYazdir(ogrenciMap,108));//Hikmet Han

        int ogrenciKey=104;
        String yeniSube="K";

  ogrenciMap=MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,ogrenciKey,yeniSube);
        System.out.println(ogrenciMap);




    }
}
