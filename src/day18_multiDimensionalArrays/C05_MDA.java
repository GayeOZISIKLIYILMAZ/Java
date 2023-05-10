package day18_multiDimensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {

        int [][]arr={{3,4,7},{1,2,3,4},{1,2},{7}};

     //toplam element sayisi kaçtır

        int elementSayisi=0;

        for (int i = 0; i < arr.length ; i++) {

            elementSayisi+=arr[i].length;

        }
        System.out.println("Element sayisi :"+elementSayisi);


    //tüm elementlerin toplamını bulun

        int elementlerToplamı=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

             elementlerToplamı += arr[i][j];

            }


        }
        System.out.println(elementlerToplamı);
    }
}
