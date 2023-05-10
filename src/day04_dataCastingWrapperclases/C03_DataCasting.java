package day04_dataCastingWrapperclases;

public class C03_DataCasting {
    public static void main(String[] args) {

        int a=20;
        int b=6;
        System.out.println(a/b);//3
        // 2 sayı tam sayıysa sonucu tam sayı verir.

        double c=6;
        System.out.println(a/c);//3,333333333
        // bölünen sayıların data türleri farkı sonucu daha geniş olan cinsinden verir

        float d=6f;
        // floatsa yanına f yazmak zorundayız
        System.out.println(a/d);// 3.33333

        // a/b işleminin sonucunu ondalıklı olarak yazdırma

        System.out.println( (double) (a/b) );
        // işlem önceliği a/b ddeir
        // işlemi yapar sonucu 3 bulur sonra double olduğundan 3ü
        // daoubleye cast eder 3.0 olur.

        // bölme işleminin sonucu double olması için
        // işleme girenlerden birisi double olmalıdır

        System.out.println((double ) a/b);//3.333333335
        System.out.println(a/(double)b);//3.333333335


        int e=1467;
        System.out.println(e=e/10);//146
        System.out.println(e);//146

        e=e/10;
        System.out.println(e);//14

        e=e/10;
        System.out.println(e);//1

        e=e/10;
        System.out.println(e);//0

    }
}
