package day12_forLoop;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        //dinamik olarak verilen satır ve sutun sayısına göre
        //yıldızlardan bir dikdörtgen oluşturun

        /*

         * * * * *
         * * * * *
         * * * * *

         */

        int satirSayisi=3;
        int sutunsayisi=5;

        for (int i = 1; i <= satirSayisi; i++) {

            for (int j = 1; j <=sutunsayisi ; j++) {

                System.out.print(" * ");

            }
            System.out.println("");


        }




    }
}
