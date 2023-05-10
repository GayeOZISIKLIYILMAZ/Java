package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_istenmeyeniSil {
    public static void main(String[] args) {

        //Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> liste=C04_KullanıcıyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğiniz bir half girin");
            String istenmeyenHalf=scan.next().substring(0,1);

          List<String>temizlenmişList=istenmeyenHalfiSil(liste,istenmeyenHalf);
    }

  public static List<String> istenmeyenHalfiSil(List<String> liste, String istenmeyenHalf) {


        //mesela listemiz ali veli ayse fatma olsun isyenmeyen half a olsun.
      //for loop ile elemetleri ele alırken remove yaparsak
      //listin uzunluğu değişeceği için sorun yaşarız
      //farklı bir list oluşturup silinmeyecekleri yeni listeye kaydedelim


      List<String>kalanlarListesi=new ArrayList<>();

      for (int i = 0; i <liste.size() ; i++) {

       if (!liste.get(i).contains(istenmeyenHalf)){
           kalanlarListesi.add(liste.get(i));
       }
      }
      return kalanlarListesi;



  }
}
