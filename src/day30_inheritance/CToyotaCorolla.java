package day30_inheritance;

public class CToyotaCorolla extends BToyota {

    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla dize,benzinli, elektirikli olabilir";

   public void motor(){
       System.out.println("Corolla araclar Türkiyede uretilen motor kullanır");
   }
   public void uretimYeri(){
       System.out.println("Corolla araclar Turkiyede uretilir");
   }
    public static void main(String[] args) {

       CToyotaCorolla corolla=new CToyotaCorolla();

        System.out.println(corolla.lastik);//corola clasındakini yazdırır
        System.out.println(corolla.model);//corolla kendi clasından yazar
        System.out.println(corolla.yakit);// corolla clasından yazdırır
        corolla.motor();//corolla
        corolla.uretimYeri();//corolla


        System.out.println(corolla.marka);//Toyota clasından yazdırır
        System.out.println(corolla.aku);//Toyota
        corolla.guvenlik();//Toyoto

        System.out.println(corolla.vites);//Araba



    }
}
