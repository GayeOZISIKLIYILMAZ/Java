package day14_MethodOverloadingWhileLoop;

public class C01_AsalSayiYazdır {
    public static void main(String[] args) {

  //verilen pozitif bir tam sayinin
   //asal olup olm adığını yazdıran method oluşturun

        asalMiYazdir(20);
        asalMiYazdir(7);

    }



    public static void asalMiYazdir(int sayi){

        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;
            }

        }
        if (flag==0){
            System.out.println("Girilen "+ sayi +"Asal bir sayidir");
        }else {
            System.out.println("Girilen "+ sayi+ "Asal değildir");
        }


    }
}
