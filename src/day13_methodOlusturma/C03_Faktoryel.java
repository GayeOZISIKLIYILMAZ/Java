package day13_methodOlusturma;

public class C03_Faktoryel {
    public static void main(String[] args) {

        //verdiğimiz bir sayının faktöriyelini hesaplayıp
        //sonucu döndüren method oluşturun

     int sonuc= faktoryelHesapla(5);
        System.out.println(sonuc);
    }

    public static int faktoryelHesapla (int sayi){

        int faktoryel=1;

        for (int i = sayi; i>=1 ; i--) {

            faktoryel*=i;

        }
        return faktoryel;
    }







}
