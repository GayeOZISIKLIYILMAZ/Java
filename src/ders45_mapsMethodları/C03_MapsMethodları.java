package ders45_mapsMethodları;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class C03_MapsMethodları {
    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",7);
        mp1.put("C",7);

        //C key olarak varsa değerini 3 arttır

        if (mp1.containsKey("C")){
            mp1.put("C",mp1.get("C")+3);
        }
        System.out.println(mp1);//{A=5, B=7, C=10}

        //Mapde D yoksa valuse 11 olacak şeklilde ekleyelim

        if (!mp1.containsKey("D")){
            mp1.put("D",11);
        }
        System.out.println(mp1);//A=5,B=3,C=10,D=11


        //"A" key olarak varsa değerini 5 azaltın

        System.out.println(mp1.computeIfPresent("A",(k,v) -> v-5));//0

        //E yoksa değerini 8 olarak ekleyin

        mp1.computeIfAbsent("E",v -> 8);
        System.out.println(mp1);//A=0,B=3,C=10,D=11,E=8

        //Enin değerini 4 arttır (varsaya yoksa demezse)

        mp1.compute("E",(k,v) -> +4);
        System.out.println(mp1);


    }
}
