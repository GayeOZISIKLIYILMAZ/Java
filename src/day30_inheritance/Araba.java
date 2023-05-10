package day30_inheritance;

public class Araba {

    //marka gözetmeksizin tüm arabaların sahip olacağı özellikleri
    // bu clasa koyarız

    String marka="tüm arabaların markası olur";
    String model="tüm arabaların modeli olur";
    String vites="Tüm arabaların vitesi olur";
    String yakit="Tüm arabalar yakıtla çalışır";
    public void uretimYeri(){
        System.out.println("Tüm arabalar fabrikada üretilir");

    }
    public void motor(){
        System.out.println("Tüm arabaların motoru olur");

    }


}
