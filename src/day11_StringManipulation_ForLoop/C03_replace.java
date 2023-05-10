package day11_StringManipulation_ForLoop;

public class C03_replace {
    public static void main(String[] args) {

        String str="Java candir";

        System.out.println(str.replace('j', 'H'));//Hava candir
        System.out.println(str.replace("a", ""));//Jv cndir
        System.out.println(str.replace("Java", "X"));//X candir
        System.out.println(str.replace("v","yayaya"));//jayayaya candir

        //strdaki spacleri yok etmek için "" hiçlik
        str=str.replace(" ","");//Javacandir

        System.out.println(str.replaceFirst("a",""));//İLK a yı alır
                                                                     //Jvacandir



    }
}
