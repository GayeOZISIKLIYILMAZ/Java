package day36_exceptions;

public class C01_TryCatch {

    public static void main(String[] args) {

        /*
        Kodlarımızı yazarken sorun çıkma ihtimali
        gördüğümüzde sorun çıkma potansiyeli olan
        kodları try catch(finally)blokları ile çevreleriz.
         */

        int sayi1=20;
        int sayi2=0;

        try {
            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {

           // e.printStackTrace();//exceptında gördüğümüz tüm
                                 // hata açıklamalarını yazdırır.
          //  System.out.println("Bölen sayi sıfır olamaz");

            System.out.println(e.getMessage());//by zero hatanın kaynağını gösterdi



        }


        /*

        1-try bloğu exception oluşturma potansiyeeli olan kodları yazıyoruz

        2-cath statement:
          ArithmeticException:Oluşma ihtimali olan exception

          e:Karşılaştığı exceptını kaydedeceği obje

        3:cath bloğu:öngörlen exception gerçekleştiğinde
                    çalışmasını istediğimiz kodlar
         */
    }
}
