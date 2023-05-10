package day12_forLoop;

public class C04_Faktorel {
    public static void main(String[] args) {

        // Kullanicidan 20’den kucuk bir sayi alip,
        // Bu sayinin faktoryel degerini hesaplayin.

        int sayi=5;

        int faktoryel=1;

        for (int i = sayi; i >=1; i--) {

            faktoryel*=i;

        }
        System.out.println(sayi + " ! = " + faktoryel);
    }
}
