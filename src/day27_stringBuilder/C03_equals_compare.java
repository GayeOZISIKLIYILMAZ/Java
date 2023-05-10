package day27_stringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");

        StringBuilder sb2=new StringBuilder("Java");

        String str="Java";

        //System.out.println(sb1==str);
        // javada farklı data türüne sahip objeler == ile karşılaştırılamaz

        System.out.println(sb1==sb2);//false
        System.out.println(sb1==sb1);//true new diyerek oluşturduğumuz için == kullanılmaz
                                     // sadece kendine eşit olur


        System.out.println(sb1.equals(sb2));//false
        //StringBuldier da içerik aynı olsa bile equals methodu false döner
        //çünkü stringbulder clasında equals methodu yoktur
        //equals methodunun parent clası olan object clasından kullanır
        //ve bundan dolayı içeriklere bakmadn false verir.

        System.out.println(sb1.equals(str));//false
        System.out.println(sb1.equals(sb1));//true

        // 2 stringBuldirın içeriklerini aynı olduğunu
        //kontrol etmek için compareTo methodu kullanılır

        System.out.println(sb1.compareTo(sb2));//0
        //System.out.println(sb2.compareTo(str)); çalışmaz CTE

        StringBuilder sb3=new StringBuilder("Hava");
        StringBuilder sb4=new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3));//2
        System.out.println(sb1.compareTo(sb4));//2
        System.out.println(sb3.compareTo(sb4));//4

        /*
        CompareTo karşılaştırılan StringBuldirlar aynı metne sahipse
        0 döner Aynı değilse bastan itibaren kontrole başlar farklı
        olan ilk halfin karşılaştırılan kelimedeki anı indexdeki
        halften kaç half ilerde olduğunu döndürür.
         */



    }
}
