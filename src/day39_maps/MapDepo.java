package day39_maps;

import java.util.*;

public class MapDepo {

    //öğrenci map oluşturup bize döndüren bir method oluşturun

    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali,Can,10,H,MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali,Cem,11,H,TM");
        ogrenciMap.put(104, "Ayse,Can,10,H,MF");
        ogrenciMap.put(105, "Ayse,Cem,11,M,TM");
        ogrenciMap.put(106, "Fatma,Han,10,K,Soz");

        return ogrenciMap;


    }

    public static String isimSoyisimYazdir(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        String ogrenciValue = ogrenciMap.get(ogrenciKey);//Ayse-Cem-11-M-TM

        String[] valueArr = ogrenciValue.split("-");//[Ayse,Cem,11,M,TM]
        String isimSoyisim = valueArr[0] + " " + valueArr[1];//Ayse Cem

        return ogrenciValue;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {

        if (ogrenciMap.containsKey(ogrenciKey)) {

            String istenenKeyValuesu = ogrenciMap.get(ogrenciKey);//Ayse Can 10 H MF
            String[] istenenKeyValueArr = istenenKeyValuesu.split("-");
            istenenKeyValueArr[3] = yeniSube;
            String istenenKeyinYeniValuesu = istenenKeyValueArr[0] + "-" +
                    istenenKeyValueArr[1] + "-" +
                    istenenKeyValueArr[2] + "-" +
                    istenenKeyValueArr[3] + "-" +
                    istenenKeyValueArr[4] + "-" +
                    ogrenciMap.put(ogrenciKey, istenenKeyValuesu);
        }

        return ogrenciMap;
    }


    public static void subeOgrenciBilgileriYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

       Collection<String> valueCollection =ogrenciMap.values();

        System.out.println("Isim  Soyisim  Sinif");
        System.out.println("====================");
        for (String eachValue:valueCollection
             ) {
            //Valueyu parçalara ayır

            String[] valueArr=eachValue.split("-");

            //sube ismini kontrol et istenen sube ise isim soyisim sınıf yazdir

            if (valueArr[3].equals(subeAdi)){
                System.out.println(valueArr[0]+" "+valueArr[1]+" "+valueArr[2]);
            }

        }
    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {

        //Hem key hemde value lazım olduğundan ikisinide oluşturalım

        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();
        Collection <String>ogrenciValueCollection=ogrenciMap.values();

        //Döndüreceğimiz listeyi oluşturalım

        List<String>isimListesi=new ArrayList<>();

        //Key değerlerini tek tek elden geçirip
        //istenen aralıkta olanları bulalım

        String value;
        String[] valueArr;
        String istenenIsim;
        for (Integer eachKey:ogrenciKeySeti

             ) {
            if (basNo<=eachKey && eachKey<=bitNo){
                //buraya verilen sınır değererine uyan eachKeye gelecek

                value=ogrenciMap.get(eachKey);
                valueArr=value.split("-");

                istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

             isimListesi.add(istenenIsim);

            }

        }
        return isimListesi;
    }
}
