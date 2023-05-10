package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        /*
        Bizden istenen görevde sıralama önemsiz ise asıl amaçlanan
        tüm eementleri elden geçirmek ise for loop yerine for each loop
        tercih edilir   index yok. başlangıç değeri. yok bitiş değeri yok.
         */

        int[]arr={3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8};

        //arrayin tüm elementlerinin toplamını yazdırın

        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Elementler toplamı : "+toplam);//72


        //arrrayin elementlerinden 3 ile bölünebilenleri yazdırın

        for (int each:arr
             ) {
            if (each%3==0) System.out.print(each +" ");//3 6 3 3 3
        }


        //arrayin elementleri içinde kaç tane tek sayi olduğunu bulun

        int sayac=0;

        for (int each:arr
             ) {
            if (each%2!=0)sayac++;
        }
        System.out.println("Arraydeki tek sayi adedi :"+sayac);//10 tane

    }
}
