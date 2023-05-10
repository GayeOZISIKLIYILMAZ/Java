package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {
    public static void main(String[] args) {

        String str="Java her gecen gun guzellesiyor";
        int[]arr={3,4,5,6,2,3,6,7,8,7};

        //Kullanıcıdan 0 veye pozitif bir tam sayı isteyin
        //Girilen değeri index olarak kullanıp
        //Str ve arrnin o indexindeki elemanları yazdırın

        Scanner scan=new Scanner(System.in);
     System.out.println("Index olarak kullanmak için 0 veya pozitif tamsayı girin");

     /*
     Birbirinden bağımsız 3 farklı türde exception riski var
     bunları farklı şekillerde hadle edebiliriz
     1-ayrı ayrı try-cath yapabiliriz.
     2-tek bir try birden fazla catch yapabiliriz.
     3-tek bir try catch yapıp tüm exceptionları yakalayacak bir exception
       türü yazılabilir.
      */

        try {
            int index= scan.nextInt();
            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Tam sayi girmelisin");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sınırları dışında");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index arry sınırları dışında");
        }


    }
}
