package day22_constructer;

public class C02_Hemsire {

    /*
    Örneğin bir hastane programında hastanede
    çalışacak hemşirelerin hangi bilgilerini tutmak
    istiyorsak hangi methodları hemşireler kullanmak istiyorsak
    bir hemşire clası oluşturup
    tüm bu özellikleri (variable ve methodları) o clasta oluştururuz.

    programda ne zaman hemşireye ihtiyac olsa hemşire clasından
    obje oluşturulur böylece tüm özelliklere sahip olur

    Eğer biz istediğimiz parametrelere sahip bir constructor
    oluşturmazsak java clastan obje oluşturabilmesi için
    classa defalult bir consturucter koyar.

    Default constructor görülmez parametresi yoktur
    contructer bodysi boştur.

    C02_Hemsire (){

    }
       bizde istediğimiz parametrelere sahip
       istediğimiz kadar constructer oluşturabiliriz

        ÇOK ÖNEMLİ=> Eğer biz bir constructer oluşturursak
        yani calassda gözle görünen bir constructer varsa
        java default constructri siler bizim oluşturduğumuz hiçbir
        constractera default constracter denmaz.
     */

    String isim;
    String soyisim;
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;
    public int  mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }

    }



