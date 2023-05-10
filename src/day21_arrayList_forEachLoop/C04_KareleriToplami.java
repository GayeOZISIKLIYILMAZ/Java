package day21_arrayList_forEachLoop;

public class C04_KareleriToplami {
    public static void main(String[] args) {

        //Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[]arr={2,3,5};

        karelerToplamiYazdir(arr);//38


    }

    public static void karelerToplamiYazdir(int[]arr){

        int karelerToplami=0;

        for (int each:arr
             ) {
          karelerToplami+= each*each;
        }
 System.out.println("Verilen arraydeki elementlerin kareleri toplamı"+ karelerToplami);
    }

}
