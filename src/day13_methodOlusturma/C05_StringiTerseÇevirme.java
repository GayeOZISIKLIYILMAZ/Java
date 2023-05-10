package day13_methodOlusturma;

public class C05_StringiTerseÇevirme {
    public static void main(String[] args) {

        //verilen bir stringi tersine çevirip bize döndüren method oluşturun

        System.out.println(stringTersineCevir("Java"));

    }

    public static String stringTersineCevir(String metin){ //Java

        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i++) {

            tersMetin +=metin.charAt(i);

        }
        return tersMetin;



    }
}
