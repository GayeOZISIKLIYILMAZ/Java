package day22_constructer;

public class C05_DoktorRunner {
    public static void main(String[] args) {


        C04_Doktor doktor1=new C04_Doktor();
        doktor1.isim= "Kemal";
        doktor1.yas=40;

        System.out.println(doktor1.soyisim); // S atanmamis
        System.out.println(doktor1.yas); // 40


        C04_Doktor doktor2 = new C04_Doktor();



        C04_Doktor doktor3;
        //burda obje oluşturulmadı variable oluşturuldu obje
        //oluşturma niyetimiz var dedik

        //Constructer calışmadan bir obje oluşturup değer ataması
        //mümkün değildir.



    }
}
