package day43_Maps;

import day39_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {

        //Öğrenci mapinde numarası verilen sayılar arasında olan öğrencilerin
        //isim soyism ve bölümlerini yazdırın list olarak bize döndüren
        //bir method oluşturun

        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();

        int basNo=103;
        int bitNo=107;
    List<String> isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);




    }
}
