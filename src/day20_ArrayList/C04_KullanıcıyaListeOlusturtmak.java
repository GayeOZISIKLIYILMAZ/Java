package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanıcıyaListeOlusturtmak {
    public static void main(String[] args) {

        //Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize
        // liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListOlusturtma());

    }
    public static List<String>kullaniciyaListOlusturtma(){

        List<String>isimler=new ArrayList<>();

        String girilenIsim="";
        Scanner scan=new Scanner(System.in);

        do{
            System.out.println("Listeye eklenmek için bir isim girin" +
                    " bitirmek için q ya basın ");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){

                isimler.add(girilenIsim);

            }

        }while (!girilenIsim.equalsIgnoreCase("Q"));


      return isimler;

    }
}
