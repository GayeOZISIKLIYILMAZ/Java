package ders45_mapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class C01_MapsMethodları {
    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",7);
        mp1.put("C",7);

        System.out.println(mp1.putIfAbsent("D", 9));//null

        mp1.putIfAbsent("D",15);//9

        //putIfApset key daha önce yoksa ekler null döner daha önce varsa
        //eklemek istediğimiz yeni değeri döndürmez eski değeri ekler

        Map<Integer,String>mp2=new HashMap<>();

        mp2.put(2,"S");
        System.out.println(mp2.putIfAbsent(3, "K"));//null
        System.out.println(mp2);//2=S,3=K




    }
}
