package day12_forLoop;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        //verilen bir rakam için çarpım tablosu oluşturun

        int sayi=4;

        /*
        1  2  3  4 ==1*1 1*2 1*3 1*4
        2  4  6  8 ==2*1 2*2 2*3 2*4
        3  6  9  12
        4  8  12  16
         */

        for (int i = 1; i <=sayi ; i++) { //iç döngü satırları yazdırır

            for (int j = 1; j <= sayi; j++) { //dış döngü sutunları yazdıracak

                System.out.print(i*j +" ");

            }
            System.out.println("");



        }
    }
}
