package day44_maps;

import day39_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {

    public static void main(String[] args) {

        //önceki derslerde key(set) ve value(collection) değerlerini
        //toplu olarak alabiliyorduk
        //ancak key ve valueyı birlikte kullanmak istediğimizde
        //bu işlemi yapmak zor olur

        //Bunun için java Entry Interfacesini oluşturmuştur
        //Entry key=Value ikilisini 1 Entry olarak kabul eder

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap);
        /*
        {
        101=Ali,Can,10,H,MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali,Cem,11,H,TM,
        104=Ayse,Can,10,H,MF,
        105=Ayse,Cem,11,M,TM,
        106=Fatma,Han,10,K,Soz
        }
         */

        Set<Map.Entry<Integer,String>>ogrenciEntrySeti  =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);

        //Bunu yazdırınca yukardıdakiden farklı olarak süslü parantezle yazdırmaz
        //Köşeli parantezle yazdırır []
        /*
        1-Yukarıdaki map bu set
        2-yukarıdakide key ve valueler her eleman için bir arada ama ayrı ayrı
        bireyler.
        Entryde ise K=V ikisi birlikte bir element oluşturur
         */

        //Entry seti içerisindeki entryleri bizde sıra numarası vererek yazdıralım

        int sıraNo=1;

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            System.out.println(sıraNo + "-   "+eachEntry);
            sıraNo++;
            
        }

        //Entryleri kullanarak Keyleri 1 yazdırın

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            System.out.println(eachEntry.getKey());
            /*
            101
            102
            103
            104
            105
            106
             */

            //Entrleri kullanarak tüm elementlerin sınıflerını 1 arttırın
            //12.sınıfta olan varsa mapten çıkarın

        }

        
    }
}
