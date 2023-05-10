package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlikYaptiMi);//false
        dok1.isim="Kemal";
        dok1.soyisim="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim);//Kemal

        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim);//null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim);//Celik

        System.out.println(dok1.fakulte);//tip
        System.out.println(dok2.fakulte);//tip

        dok1.isim="Burcu";
        System.out.println(dok2.isim);//null

        dok1.fakulte="Tip fakultesi";
        System.out.println(dok2.fakulte);//tip fakultesi

        ADoktor dok3=new ADoktor();
        System.out.println(dok3.dogumYili);//0
        System.out.println(dok3.fakulte);//tip fakultesi

        System.out.println(ADoktor.fakulte);
        //static variabllar için tavsiye edilen erişim yöntemi clas ismi.üye ismi
        // bu kullanım biçimine statik yöntem denir.



    }
}
