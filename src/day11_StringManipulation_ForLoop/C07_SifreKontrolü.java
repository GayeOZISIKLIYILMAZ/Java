package day11_StringManipulation_ForLoop;

import java.util.Scanner;

public class C07_SifreKontrolü {
    public static void main(String[] args) {


      // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
      // kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
      // ilk harf kucuk harf olmali
      // son karakter rakam olmali
       // sifre bosluk icermemeli
       // uzunlugu en az 10 karakter olmali

        String sifre="123";
        int flag=0;

        if (sifre.charAt(0)>='a'&& sifre.charAt(0) <='z' ){
            flag++;
        }else {
            System.out.println("İlk half küçük olmalı");
        }
        char sonHalf=sifre.charAt(sifre.length()-1);
        if (sonHalf>='0' && sonHalf<='9'){
            flag++;
        }else {
            System.out.println("Son karekter rakam olmalı");
        }
        if (sifre.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
        }else {
            flag++;
        }

        if (sifre.length()>=10){
            flag++;
            System.out.println("Şifrenin uzunluğu en az 10 karekter olmalıdır");

        }

        if (flag==4){
            System.out.println("Şifre başarıyla kaydedildi");
        }




    }
}
