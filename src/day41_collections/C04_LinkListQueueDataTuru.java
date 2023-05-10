package day41_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String>q1=new LinkedList<>();

        q1.add("H");
        q1.add("Y");//[H,Y]

        q1.offer("K");//[H,Y,K]
        //Kapasite sınırlaması yapmadığımız surece add ile aynı işlemi yapar

        q1.remove();
        System.out.println(q1.remove());//H yi siler Y,K kalır.
        //Queue eklemayi sona yapıp kullanmayı baştan yaptığı için
        //parametre girdiğimizde baştaki elementi remove ederve bize döndürür.

        q1.poll();
        //remove ile aynı işlemi yapar baştaki elementi siler
        //aralarındaki fark boş olarak çalıştırıldıklarında
        //remove exception fırlatır poll exception fırlatmaz null verir.

    }
}
