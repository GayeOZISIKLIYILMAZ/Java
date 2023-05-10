package day43_Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {

    public static void main(String[] args) {
        //Verilen bir cümlede kullanılan herbir halfi
        //ve o halfin kullanım miktarını
        //A=5,b=3... gibi yazdırın

        String str="Javayı balonu patlatmadan bitirelim";
        //J=1 a=7 v=1 y=1....

        String []halflerArr=str.split("");
    //[J, a, v, a, y, ı,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String,Integer> kullanimMiktarlariMap=new TreeMap<>();

       //1-tüm halfleri sırası ile ele alıcaz
        int sayac=1;

        for (int i = 0; i <halflerArr.length ; i++) {

            //2.Ele aldığımız halfin daha önce mape eklenip eklenmediğini
            //kontrol edelim

            if (kullanimMiktarlariMap.containsKey(halflerArr[i])){
                continue;

            }else {
                //Kod buraya geldiyse o half henüz mape eklenmemiştir
                //ozaman halfin kullanım miktarını bulmalıyız

                for (int j = i+1; j <halflerArr.length ; j++) {

                    if (halflerArr[j].equals(halflerArr[i])){
                        sayac++;
                    }
                }
                //sayma işlemi bitti key ve valueyi mape ekleyelim

              kullanimMiktarlariMap.put(halflerArr[i],sayac );
                sayac=1;
            }

        }
        System.out.println(kullanimMiktarlariMap);
    }
}
