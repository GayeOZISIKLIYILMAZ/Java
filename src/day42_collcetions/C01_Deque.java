package day42_collcetions;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String>dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B");//[K,B]

        dq1.addLast("F");//[K,B,F]sona ekler
        dq1.addLast("A");//[A,K,B,F] başa ekler

        System.out.println(dq1.getFirst());//A yı getirir
        System.out.println(dq1.getLast());//F

        System.out.println(dq1.remove());//A yı siler a yı getirir
        System.out.println(dq1.poll());//buda aynı şekilde kalan K yı siler

      //NOT:Remove boşken exception fırlatır NoSuchElementException
      //    Poll boş olmasına rağmen exception fırlatmaz null verir

        dq1.add("K");
        dq1.add("B");

        dq1.push("F");//[F,K,B] başa ekler

        dq1.pop();//[F] ilk elementi siler bize getirir listede K,B kaldı

        dq1.element();//[K]//en baştaki elemeti getirr ama silmez boş çalışırsa
                           //exception fırlatır.

        dq1.peek();//ilk elementi silmeden getirir boş çalışırsa null

        dq1.offer("C");//en sona ekler [K,B,C] ekleyince true döndürür.







    }
}
