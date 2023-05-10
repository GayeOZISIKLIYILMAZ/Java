package day11_StringManipulation_ForLoop;

public class C01_isEmpyt_isBlank {
    public static void main(String[] args) {


        String str="Java candir";

        System.out.println(str.isEmpty());// str boşmu diye soruyor ? false

        System.out.println(str.isBlank());// str boşluklardanmı oluşuyor ? false

        str="  ";

        System.out.println(str.isEmpty());// str boşmu false
        System.out.println(str.isBlank());// boşluklardan oluşur true

        str="";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());// true

    }
}
