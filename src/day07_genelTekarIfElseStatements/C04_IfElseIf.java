package day07_genelTekarIfElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {
    public static void main(String[] args) {

        /*
         kullanicidan pozitif bir tamsayi alin
          sayi 3 ile bolunebiliyorsa "3'un kati"
          sayi 5 ile bolunebiliyorsa "5'in kati"
           sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("3ün ve 5in kati");

        } else if (sayi % 5 == 0) {
            System.out.println("5in kati");

        } else if (sayi % 3 == 0) {
            System.out.println("3ün kati");
        }
    }
}
// bazen şartlar yüm durumları karşılamaz
// bu durum if else if cümleleri else ile bitmez
// else ile bitmeyen if else if cümlelerinde
//bazı durumlarda hiç bir if bodysi devreye girmeye bilir.