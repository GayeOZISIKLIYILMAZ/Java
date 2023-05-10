package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalıstirma {
    public static void main(String[] args) {

        List<String>urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Cikolatali gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenHalf="o";


        System.out.println(C05_istenmeyeniSil.istenmeyenHalfiSil(urunler, istenmeyenHalf));
        //[nutella] kaldı o olanları sildi.

    }
}
