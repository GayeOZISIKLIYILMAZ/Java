package day36_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str=null;
        System.out.println(str);//null
        System.out.println(str.concat("Java"));//.NullPointerException

        String str1="34";
        String str2="23";

        //String olarak verilen sayıların toplamını yazınız

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//50

        //23ün yanına half konursa

    System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//NumberFormatException

        String str4="Java candir";

        Object obj=str4;

        Integer a =(Integer) obj;//ClassCastException


    }
}
