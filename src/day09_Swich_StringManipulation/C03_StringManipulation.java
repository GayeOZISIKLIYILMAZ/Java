package day09_Swich_StringManipulation;

public class C03_StringManipulation {
    public static void main(String[] args) {


        String str="Java Candır";
      //büyük half yazdır

        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println(str);// Java candır // string manipilasyon yaptktan sonra atama
                                                // yapmazsak asil varaiable değişmez.
        str=str.toUpperCase();// atama yaptık
        System.out.println(str);//JAVA CANDIR atandıktan sonra büyük yazdırır

        System.out.println(str.toLowerCase());//java candir


    }
}
