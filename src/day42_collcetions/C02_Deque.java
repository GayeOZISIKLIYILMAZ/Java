package day42_collcetions;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        Deque<String>urunler=new LinkedList<>();

        urunler.add("Nutella");
        urunler.add("Çikolatalı gofret");
        urunler.add("Cokoprens");

        //Tüm ürünlerin başına "Y " ekleyelim

        String eleman="";
        Deque geciciDeque=new LinkedList();

        while (eleman!=null){

            eleman=urunler.poll();
            if (eleman!=null){
                eleman="Y"+eleman;
                geciciDeque.add(eleman);

            }


        }
        urunler=geciciDeque;
        System.out.println(urunler);


    }
}
