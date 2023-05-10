package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);//[3,4,5]

    }
    public static void elementleriArttir(List<Integer>sayilar){
        //tüm elementleri 2 katına çıkar

        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i,2*sayilar.get(i));

        }
        System.out.println("Elementleri arttır methodu"+sayilar);

        elementleriArttir(sayilar);
        //elemntleri arttır methodunu çalıştırdıktan sonra
        System.out.println("Element arttır methodundan sonra"+sayilar);

    }
    public static void yeniListeAta(List<Integer>sayilar){

        //sayilar listesine yeni bir list değeri atayıp
        //sonra 1,2,3 elemntlerini ekleyin

        sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni liste ata mehodunda"+sayilar);
    }
}
