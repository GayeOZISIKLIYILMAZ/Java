package day29_inheritance;

public class C04_Child {

    int c=20;
    int a;

    String s="Child class";
    String m;

    public void method1(){
        System.out.println("child class method1");
    }
    public static void main(String[]args){

        C03_ParrentClass objC03=new C03_ParrentClass();

        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";

        objC03.method1();// Parrent Method1 çalıştı
        objC03.method2();//Parrent Method2 çalıştı



        C04_Child objC04=new C04_Child();

        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();//child class method1




        /*
        Javada parent claslar child edinmez
        child claslar parent edinir

        Bir clasın başka bir clastaki yğm özellikleri
        otomatik olarak edinmesini istiyorsak
        clasımızı extends keyworld ile classa child yaparız
        (Size baba diyebilirmiyim)
         */


    }

}
