package day08_nestedIfElse_Ternary;

public class C06_Ternary {
    public static void main(String[] args) {

        // ternary ya direk sout içerisinde kullanılır
        //yada bir değikene atama yapacak şekilde yazılır

        int sayi=20;
        //sayi%2==0 ?" çift sayi" : "sayı tek"  BU ŞEKİLDE HATA VERİR

        System.out.println(sayi%2==0 ?" çift sayi" : "sayı tek");// YAZDIRABİLİRİZ

        String sonuc=sayi%2==0 ?" çift sayi" : "sayı tek"; //ATAMA YAPABİLİRİZ


        //Eğer true olduğunda sonuç ile false olduğundaki sonuç
        //farklı data türlerinde olursa

        //sayi çift ise sayi çift yazdırın
        //değilse sayinin 2 katını yazdırın

        System.out.println(sayi%2==0 ?"sayi çift" : 2*sayi);

        // data türleri farklıysa yazdırabiliriz fakat atama yapamayız.
    }
}
