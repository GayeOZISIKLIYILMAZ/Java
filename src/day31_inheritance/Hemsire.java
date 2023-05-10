package day31_inheritance;

public class Hemsire extends FMuhasebe{

    String unvan="Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler minumum 10 bin tl maaş alır");
    }

    public void ozelSigorta(){

 System.out.println("Hemsireler aylık 300 tl katkı ile özel sigorta yaptırabilir");
    }

    public void nobetUcreti(int nobetSayısı){
        System.out.println(nobetSayısı*200);
    }

    public static void main(String[] args) {
        Hemsire hemsire=new Hemsire();
        hemsire.method();
    }

    public void method(){


        Hemsire hemsire=new Hemsire();

        System.out.println(hemsire.unvan);//hemsire
        System.out.println(super.unvan);//parent clastaki unvanı arar.
                                        //orda yoksa onunda parentına bakar
        System.out.println(this.sgkNo);//calısan sgk no....(bu önce kendi clasına bakar)
        System.out.println(super.sgkNo);//(bu direk parrentta arar)
        this.standartMaas();//10bin
        this.fazlaMesai(3);//600
        super.fazlaMesai(4);//800
        this.ozelSigorta();//aylık 300 lira...
        super.ozelSigorta();//personel..
    }

}
