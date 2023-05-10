package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {

        List<String>isimler=new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");

        System.out.println(isimler);//[Kubra, Mustafa, Emre, Ferhat, Erdal]

        //2.indexdeki elementi yazdır
        System.out.println(isimler.get(2));//Emre

        //Ferhatın indexini yazdır

        System.out.println(isimler.indexOf("Ferhat"));//3 yani 3.sırada

        System.out.println(isimler.lastIndexOf("Ferhat"));//aramaya sondan başlar 3

        System.out.println(isimler.indexOf("Hilal"));// olmayan isim için -1 verdi
        System.out.println(isimler.lastIndexOf("Gökhan")); // -1 verir yok olduğunu
                                                           //belirtmek için

        isimler.add("Mustafa");
        System.out.println(isimler);//[Kubra, Mustafa, Emre, Ferhat, Erdal, Mustafa]

        System.out.println(isimler.indexOf("Mustafa")); // 1 aramaya baştan başlar
        System.out.println(isimler.lastIndexOf("Mustafa"));//5 aramaya sondan başlar
    }
}
