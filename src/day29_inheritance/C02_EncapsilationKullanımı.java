package day29_inheritance;

public class C02_EncapsilationKullanımı {
    public static void main(String[] args) {

        C01 obj=new C01();

        obj.isim="Melike";//write
        System.out.println(obj.isim);//read

        obj.setSayi(40);//write
        System.out.println(obj.getSayi());//read

        /*
        Bir clas üyesinin pablic olması ile private yapılıp
        getter ve setter methodlarının oluşturulması
        işlemsel açıdan aynı sonucu oluşturur.

        Bazı devolopparlar get ve set yetkilerinin
        kullanıldığını vurgulamak için 2. yönyemi
        tercih ederler.
         */
    }
}
