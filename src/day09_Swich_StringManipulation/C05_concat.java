package day09_Swich_StringManipulation;

public class C05_concat {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";
        String str3=" ";
        // yukardıdaki variablları kullanarak "Java candir" YAZDIRIN

        System.out.println(str1+str3+str2); //1.yol

        System.out.println(str1.concat(str3).concat(str2));//2.yol

    }
}
