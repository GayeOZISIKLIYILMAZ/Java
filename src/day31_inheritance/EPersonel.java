package day31_inheritance;

public class EPersonel {

    String isim="personel isim belirtilmemiş";
    String unvan="Personel unvan belirtilmemiş";
    boolean izindeMi;

    public void standartMaas(){
        System.out.println("Personel askeri ücreti :"+ 8500);

    }
    public void ozelSigorta(){
        System.out.println("Personelden katkı payı alınarak ozek sigorta yapilir");
    }
}
