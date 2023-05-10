package day12_forLoop;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {



        for (int i = 20; i <10 ; i++) {     //20 10dan küçük değil

            System.out.println(i +" ");

        }
        // for loop çalıştı ancak ilk değer için bitiş şartı false
        //verdiğinden loop bodysi HİÇ DEVREYE GİRMEDİ.


        for (int i = 0; i <10 ; i--) {
            System.out.println(i +" ");

            //loop başladıktan sonra artış azalış yöntemi sebsbiyle
            //bitiş değerinden uzaklaşıyorsa loop teorik olarak
            //sonsuza kadar çalışır Sonsuz Loop olur.

        }

    }
}
