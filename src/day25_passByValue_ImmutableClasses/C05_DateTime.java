package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getNano());

        //bir loop ile 1 den 10000e kadar olan satıları toplayınız
        // ve bu işlemlerin kaç nanosaniye sürdüğünü bulunuz

        int toplam=0;
        int basSuresiNano=saat.getNano();

        for (int i = 1; i <10000 ; i++) {
            toplam+=i;

        }
        LocalTime saatSon=LocalTime.now();
        int bitSuresiNano= saat.getNano();

        System.out.println("Islem suresi"+ (bitSuresiNano-basSuresiNano));



    }
}
