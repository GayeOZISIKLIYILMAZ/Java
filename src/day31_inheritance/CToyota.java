package day31_inheritance;

public class CToyota extends BAraba {

    protected String str2="Toyota";

    protected CToyota(){
        System.out.println("Parametresiz toyota consturactrı calıstı");
    }

    protected CToyota(int sayi){
        System.out.println("Intager Parametreli toyota consturactrı calıstı");
    }
    protected CToyota(String s){
        System.out.println("String parametreli toyota constracterı çalıştı");
    }

}
