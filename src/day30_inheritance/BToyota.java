package day30_inheritance;

public class BToyota extends Araba {

    String marka="Toyota";
    String aku="Inci aku";
    String lastik="Brigestone";

    public void motor(){
        System.out.println("Toyottolar cevreci toyota motoru kullanır");
    }
    public void guvenlik(){
        System.out.println("Toyotta araclar extra güvenlik onlemleri barındırır");
    }
}
