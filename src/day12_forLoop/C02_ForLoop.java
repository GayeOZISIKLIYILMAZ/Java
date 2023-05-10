package day12_forLoop;

public class C02_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar
        //  alin, sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int bas=20;
        int bit=40;

        int sayiToplamı=0;

        if (bit<bas){
            System.out.println("Baslangıç değeri bitiş değerinden küçük olmalıdır");
        }else {

            for (int i = bas; i <=bit; i++) { //böyle yazarsak dinamik kod olur.

                sayiToplamı +=i;

            }
        }
        System.out.println("Sayıların toplamı :" + sayiToplamı);//630
    }
}
