package day41_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkListSoru {
    public static void main(String[] args) {

        /*
        Kullanıcıdan değer alarak iki syring liste oluşturun
        Kullanıcı değer girmeyi bırakmak için 0a basmalıdır
        İki liste oluşturduktan sonra aşağıdaki şekilde bir output hazırlayın
        liste1 :......
        liste2 : .....
        ortak elementler : ......
         */

        System.out.println("Once List1i oluşturalım");
        List<String>list1=kullanicidanAlarakListeOlustur();

        System.out.println("Şimdi 2. listeyi oluşturalım");
        List<String>list2=kullanicidanAlarakListeOlustur();

        System.out.println("Liste1 : "+list1);
        System.out.println("Liste2 :"+list2);
        list1.retainAll(list2);
        System.out.println("Ortak elemanlar : "+list1);

    }
    public static List<String>kullanicidanAlarakListeOlustur(){

        List<String>isimListesi=new LinkedList<>();

        Scanner scan=new Scanner(System.in);

        String isim="";

        while (!isim.equalsIgnoreCase("0")){
            isim= scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }
        }
        return isimListesi;
    }
}
