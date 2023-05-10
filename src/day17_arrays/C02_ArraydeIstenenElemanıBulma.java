package day17_arrays;

public class C02_ArraydeIstenenElemanıBulma {
    public static void main(String[] args) {


        // Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa
        //kac kere kullanildigini yazdiran bir method olusturun.


        int[] arr1 = {2, 4, 5, 2, 4, 6, 7, 7, 6};

        elemanSayisiEkle(arr1,2);  //2 tane 2 var
    }
    public static void elemanSayisiEkle (int[]arr,int arananSayi){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==arananSayi){
                sayac++;
            }

        }
        System.out.println(sayac);
    }






    }

