package day15_doWhileLoop_scope;
import java.util.Scanner;
public class C01_WhileLoop_RakamlarToplamı {
    public static void main(String[] args) {

        //While loop kullanarak kullanıcıdan alınana sayının rakamlarını toplayın

        Scanner scan=new Scanner(System.in);
        System.out.println("Rakamları toplanacak pozitif tamsayi giriniz");
        int girilenSayi=scan.nextInt();

        int sayi=girilenSayi;
        int birlerBasamağı=0;
        int rakamlarToplami=0;

        while (sayi>0){

            birlerBasamağı=sayi%10;
            rakamlarToplami+=birlerBasamağı;
            sayi/=10;
        }
        System.out.println("Girilen "+ girilenSayi + "nın rakamlar toplamı: "+
                                               rakamlarToplami);
    }
}
