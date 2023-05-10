package day22_constructer;

public class C03_hemsireRunner {
    public static void main(String[] args) {

        /*
        Bir obje oluşturulurken parametre olarak hiçbir değer
        girilmezse oluşturulan obje,oluşturduğu clastaki variabllara
        atanan değeri alır eğer obje oluşturulan classda değer ataması yoksa
        java defoult değeri atar

         */

        C02_Hemsire hemsire1=new C02_Hemsire();

        System.out.println(hemsire1.isim);//null
        System.out.println(hemsire1.evliMi);//HİÇLİK
        System.out.println(hemsire1.yas);//0
        System.out.println(hemsire1.izindeMi);//false

        hemsire1.isim="Tuba";
        hemsire1.yas=29;

        System.out.println(hemsire1.isim);//Tuba
        System.out.println(hemsire1.yas);//29




    }
}
