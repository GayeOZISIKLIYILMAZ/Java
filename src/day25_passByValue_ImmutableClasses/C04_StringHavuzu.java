package day25_passByValue_ImmutableClasses;

public class C04_StringHavuzu {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja"+"va";
        String s ="Ja";
        String t="va";
        String str5=s.concat(t);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true


        System.out.println("==========");


        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false


        /*

       == Hem referansı hem değeri karşılaştırır

       equals ise sadece değerleri karşılaştırır.

       Eğer String havuzunda olup hem referansı hem değeri aynı olan
       Stringler == ile karşılaştırılırsa sonuç true  olur

       Ancak new keyword kullanılarak oluşturulan veya method kullanılan
       Stringler == ile kullanılırsa sonuç False olur

         */


    }
}
