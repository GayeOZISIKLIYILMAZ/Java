package day14_MethodOverloadingWhileLoop;

public class C04_MethodOvorleoding {
    public static void main(String[] args) {

        /*
        İsim ve parametreleri aynı olan birden fazla method oluşturulamaz
        Data türleri farklı olan parametrelerin yerlerini değiştirirsek
        java yeni bir method olarak kabul eder

        Overloading olan claslarda hangisinin çalışacağına
        1-çağırılan isimde method varmı
        2-method call da kullanılan argüment()ile methodlardaki parametrelrin
        %100 uyumlu olduğu varmı
        3-argüment ile parametre aynı olmasa bile verilen argümentleri
        kabul edecek parametre varmı
        4-Casting ile birden fazla methodu kullanabiliyorsa daha az
        casting ile çalışacak methodu kullanır

         */

        topla(3,5);//8
       topla(3.4,2.3);//5.7

        //topla("ali" , "veli" ); CTE bu argümentleri kabul edecek parametre yok

        topla('a','b'); //iki int 195 asciye göre yazdı

        topla(3f ,4f);//iki dauble çalışır 7.0 verir

        topla(3f,4);//daha az casting yapanı alır double int alır en sondaki 7.0 verir.

    }
    public static void topla (int a ,int b){
        System.out.println("İki tam sayını toplamı: "+ (a+b));

    }
    public static void topla (double a , double b){

        System.out.println("iki double sayıyı toplamı "+ (a+b));
    }

    public static void topla (int sayi1 , double sayi2){
        System.out.println("int ve double sayilarının toplami : "+(sayi1+sayi2));
    }

    public static void topla (double sayi1 , int sayi2){
        System.out.println("double ve int sayiların toplamı "+ (sayi1+sayi2));

    }
}
