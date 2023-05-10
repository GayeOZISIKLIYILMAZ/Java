package day10_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java cok ama cok guzel";

        System.out.println(str.indexOf("c"));//5
        System.out.println(str.indexOf("a"));//birden fazlaysa ilk bulduğunu verir 1
        System.out.println(str.indexOf("cok"));//5 başladığı yerden verir
        System.out.println(str.indexOf("cok", 6));// aramaya 6.indeksten sonra
                                                             // başlıcak yani 13

        System.out.println(str.indexOf("cok",5));//5
        System.out.println(str.indexOf("java"));// aranan index yoksa -1 der




    }
}
