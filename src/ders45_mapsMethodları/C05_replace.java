package ders45_mapsMethodları;

import java.util.HashMap;
import java.util.Map;

public class C05_replace {
    public static void main(String[] args) {

        Map<String, Integer> mp1 = new HashMap<>();

        mp1.put("A", 5);
        mp1.put("B", 7);
        mp1.put("C", 7);

        mp1.replace("C", 10);
        System.out.println(mp1);//{A=5, B=7, C=10}

        mp1.replace("D", 9);
        System.out.println(mp1);// null//{A=5, B=7, C=10}

        System.out.println(mp1.replace("B",3,12));
        System.out.println(mp1);//false
                              //{A=5, B=7, C=10}


    }
}