package day21_arrayList_forEachLoop;

import java.util.Arrays;

public class C05_istenenHalfAdediniBulma {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle="Yatin kalkin java çalişin";
        String istenenHalf="a";

        String[]karakterler=cumle.split("");
        System.out.println(Arrays.toString(karakterler));
       //[Y, a, t, i, n,  , k, a, l, k, i, n,  , j, a, v, a,  , ç, a, l, i, ş, i, n]

        int sayac=0;
        for (String each:karakterler
             ) {
            if (each.equalsIgnoreCase(istenenHalf));
            sayac++;

        }
        if (sayac==0){
            System.out.println("Istenen harf cumlede kullanilmamis");
        }else {
            System.out.println("istenen harf cumlede " + sayac + " adet kullanilmis");
        }
    }


}
