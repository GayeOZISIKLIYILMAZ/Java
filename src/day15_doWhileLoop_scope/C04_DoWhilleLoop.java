package day15_doWhileLoop_scope;
import java.util.Scanner;
public class C04_DoWhilleLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplanmak üzere sayılar alın
        //kullanıcıya bitirmek için 0 a basmasını söyleyin
        //0a bastığında
        //sıfıra bastığında sıfır hariç kaç sayi girdiğini ve toplamını yazdırın


        Scanner scan = new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        int sayiAdedi=0;
        /*
        while(girilenSayi !=0){
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }
         */
        do {
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }while(girilenSayi !=0);
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : "
                + toplam);
        
    }



}
