package day05_incrementDecrment_Concanetion;

public class C04_StringIntGecisler {
    public static void main(String[] args) {

        String s1="423";
        // S1 i int çevirmek istersek

        int sayi=Integer.parseInt(s1);//423
        System.out.println(sayi++);//423 yazdırıp sonra arttıracak

        int a=20;
        int b=40;
        // bu 2 sayıyı kullanarak 2040 yazdırın

        // hiçlik koyarsak string olarak yanyana yazdırır

        System.out.println(a+""+b);//2040
    }
}
