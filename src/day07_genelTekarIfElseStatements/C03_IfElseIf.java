package day07_genelTekarIfElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {
        // kullanıcıdan pozitif bir tam sayi alın
        // sayı 3 ile bölünebiliyorsa 3ün katı
        //sayi 5 ile bölünüyorsa 5in katı
        // sayi hem 3 hem 5 ile bölünüyorsa
        // 3ve 5 in katı yazdırın
        // ikisinede bölünmüyorsa ne 3ün nede 5in katı yazdırın.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayi giriniz");
        int sayi=scan.nextInt();

        if(sayi%3==0 && sayi%5==0){
            System.out.println("3ün ve 5in kati");

        } else if (sayi%5==0) {
            System.out.println("5in kati");

        } else if (sayi%3==0  ) {
            System.out.println("3ün kati");

        }else{
            System.out.println("Ne 3ün ne 5in kati");
        }
    }
}
 //eğer bir if else if cümlesi else ile bitiyorsa mutlaka if bodylerinden
// bir tanesi çalışır.