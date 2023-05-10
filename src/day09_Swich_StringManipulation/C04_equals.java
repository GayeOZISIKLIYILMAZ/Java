package day09_Swich_StringManipulation;

public class C04_equals {
    public static void main(String[] args) {

        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";

        System.out.println(str1.equals(str2));//false
        System.out.println(str3.equals(str4));//false //tamaman aynı olmalılar

        // eğer büyük küçük halfe dikkat etmeden stringleri karşılaştırmak istersek

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str4));//true

        String str5="Java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);
        System.out.println(str8);//Java

        System.out.println(str1==str5);//Java==Java true

        System.out.println(str1==str8);//Java==Java false

      // == ile stringleri karşılaştırırsak hem metin değerine hem referansına bakar.
      // equals ile Stringleri karşılaştırırsak sadece metin değerine bakar.

        // == ile Stringleri karşılaştırdığımızda beklediğimizden farklı sonuç olabilir
        // bu yüzden 2 Stringi karşılaştırırsak == deği equals kullanırız.


    }
}
