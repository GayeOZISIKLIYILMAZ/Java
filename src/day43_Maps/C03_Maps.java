package day43_Maps;

import day39_maps.MapDepo;

import java.util.Map;

public class C03_Maps {
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

        String subeAdi="H";
        MapDepo.subeOgrenciBilgileriYazdir(ogrenciMap,subeAdi);

    }
}
