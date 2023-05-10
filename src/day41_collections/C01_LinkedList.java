package day41_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        //LinkedList 3 tane interfaceyi implements etmiştir
        //List,Queue,Deque interfaceleri
        //Dolayısıyla bu interfacelerden sonra gelen ilk concrete
        //clas olduğundan bu 3 interfacdeki abstract methodları override etmiştir

        //LinkedList oluşturulurken seçilen data türüne göre
        //bu 3 interfaceden birinin özelliklerini alabilir
        //veya data türü LinkedList seçilirse 3 interfacenin
        //özelliklerinide toptan alır


        List<String> ll2=new LinkedList<>();

        //Daha önceden arrayList oluşturulurken List<>interfacenin
        //data türü olarak kullandığımızda bu şekilde oluşturulan
        //LinkedListlerin özelliklerini biliyoruz

        ll1.add("R"); //[R]
        ll2.add("Z"); //[R,Z]
        ll2.add(0,"A");//[A,R,Z]

        ll2.addAll(2,ll1);//[A,R,K,T,Z]
        ll2.set(3,"M"); //[A,R,K,M,Z]
        System.out.println(ll2.get(1));//R

        System.out.println(ll2.retainAll(ll1));//true
        //(ll1 haricindekileri siler.)









    }
}
