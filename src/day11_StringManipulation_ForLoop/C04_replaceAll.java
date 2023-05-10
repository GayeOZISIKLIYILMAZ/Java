package day11_StringManipulation_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str="J1a23va34 5C54and65ir87";

        //strdaki sayıları methodla temizleyin.


         //NOT= Eğer değiştirmek istediğimiz metin tek bir metin değil
        //ortak özelliği olan farkli metinlerse

        //tüm sayilar
        //sayi olmayanları tümü
        //tüm spacler
        //space olmayan tüm karekterler gibi

        //bu ortak özellikler belirtmek için regexler var.

        str=str.replaceAll("\\d","");
        System.out.println("strın yeni hali :" +str);//Java candir


    }
}
