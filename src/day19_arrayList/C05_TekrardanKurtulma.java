package day19_arrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrardanKurtulma {
    public static void main(String[] args) {

        //verilen arrayden tekrar eden sayıları silip
        //her bir elementin 1 kez kullanıldığı hale getirin

        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        //bir tane boş list oluşturalım
        //arraydeki her bir elemanı ele alalım
        //ele aldığımız element listte yoksa ekleyelim
        //varsa eklemeyelim böylece benzersiz elemntlerden oluşan
        //bir list oluşturalım.


        List<Integer>benzersizElementlerList= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);

            }

        }
        System.out.println(benzersizElementlerList);//[3, 4, 5, 6, 2, 7]

        //istenen listeyi list olarak elde ettik
        //bunu arrye direk atayamayız

        arr=new int[benzersizElementlerList.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= benzersizElementlerList.get(i);

        }

        System.out.println(Arrays.toString(arr));//[3, 4, 5, 6, 2, 7]


    }
}
