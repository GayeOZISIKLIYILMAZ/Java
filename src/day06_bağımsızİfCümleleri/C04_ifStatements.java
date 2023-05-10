package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {

        //Kullanicidan notunu alin
        // 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

      if (not>=50 && not<=100){
          System.out.println("Sınıfı geçtin");
      }
      if (not<50){
          System.out.println("Maalesef kaldın");
      }


    }
}



