package day22_constructer;

public class C04_Doktor {

    C04_Doktor(){
        System.out.println("parametresiz constracter calisti");
    }

    String isim;
    String soyisim;
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=30;

    public int  mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }
}
