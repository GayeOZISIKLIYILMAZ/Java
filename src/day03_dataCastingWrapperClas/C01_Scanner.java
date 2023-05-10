package day03_dataCastingWrapperClas;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini soyismini ve yaşını alıp aşağıdaki formayya yazdırın
         //isminiz:John
        //Soyısmınız:Doe
        //yasınız:44
        // kaydınız başarıyla tamamlanmıştır

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi yazınız");
        String soyIsim=scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();

        System.out.println("Isminiz : "+ isim);
        System.out.println("Soyİsminiz : "+ soyIsim);
        System.out.println("Yasınız : "+ yas);
        System.out.println("Kaydınız baiarıyla tamamlanmıştır" );


        System.out.println("Isminiz : "+ isim+
                             "Soyİsminiz : "+ soyIsim+
                              "Yasınız : "+ yas +
                              "Kaydınız baiarıyla tamamlanmıştır"           );
        // böylede yazılabilir..
        // alt satıra inmek içinde \n yazarak yaparız..










    }
}
