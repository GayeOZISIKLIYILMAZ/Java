package day31_inheritance;

public class BAraba {

   protected BAraba(){
        System.out.println("Araba parametresiz constracter calisti");
    }

   protected BAraba(String str){
        System.out.println("Araba str parametreli constracter calisti");
    }

    protected BAraba(int a,int b){
        System.out.println("Araba 2 int parametreli constracter calısti");
    }
}
