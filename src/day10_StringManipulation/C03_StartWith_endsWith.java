package day10_StringManipulation;

public class C03_StartWith_endsWith {
    public static void main(String[] args) {

        String str="Java harika";

        System.out.println(str.startsWith("java"));// false büyük J ile başlar
        System.out.println(str.startsWith("Ja"));// true
        System.out.println(str.startsWith(str));//true
        System.out.println(str.startsWith(""));//true


        System.out.println(str.endsWith("a"));//true
        System.out.println(str.endsWith("ka"));//true
        System.out.println(str.endsWith("Java harika"));//true
        System.out.println(str.endsWith(""));//true

        System.out.println(str.endsWith(str.substring(str.length() - 1)));
        // sondan yapmaya başlarız a yı verir str a ile bitermi oda true
    }
}
