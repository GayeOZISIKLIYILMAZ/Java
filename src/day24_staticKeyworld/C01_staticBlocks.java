package day24_staticKeyworld;

public class C01_staticBlocks {
    public static void main(String[] args) {

        System.out.println("Main method çalıştı");

        System.out.println("=======");

        C01_staticBlocks obj1=new C01_staticBlocks();

    }
    static {
        /*
        Static bloklar clas ilk çalışmaya başladığında
        çalışır.Genel olarak clas için gerekli
        ön ayarlamaları yapmak için kullanılır
         */
        System.out.println("Static blok çalıştı");
    }
    {
        System.out.println("Static olamayna blok çalıştı");
    }
}
        /*
        satatic olamayan blocklar ise obje oluşturulurken
        constracterdan önce çalışır
        Birden fazla static blok varsa yukarıdan aşağıya
        doğru sıralı olarak çalışır.

         */