package day10_StringManipulation;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str="Java bazen beyin yakar";

        System.out.println(str.indexOf("a"));//1
        System.out.println(str.lastIndexOf("a"));//aramaya sondan başlar sonuç 20

        System.out.println(str.indexOf("a", 2)); // 3
        System.out.println(str.lastIndexOf("a", 19));//18

        System.out.println(str.indexOf("a", 4));//6
        System.out.println(str.lastIndexOf("a", 17));//6

        System.out.println(str.indexOf('e'));//8
        System.out.println(str.lastIndexOf('e'));//12 buda sondan bakar

        System.out.println(str.lastIndexOf("Mustafa"));//-1


        // Verilen bir cumlede, istenen bir String icin
       // asagidaki cumlelerden uygun olani yazdirin
       // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1 den fazla kullanilmis
        // 3- aradığımız kelime cümlede hiç kullanılmamış

        String cumle="Yasasın java iyiki java öğreniyorum";
        String kelime="Yasasın";

        int ilkIndex=cumle.indexOf(kelime);
        int lastIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)){
            System.out.println("aradığımız kelime cümlede hiç kullanılmamış");
        } else if (ilkIndex==lastIndex) {
            System.out.println("aradığımız kelime cümlede bir kere kullanılmış");

        }else {
            System.out.println("aradığımız kelime cümlede birden fazla kullanılmış");
        }

    }
}
