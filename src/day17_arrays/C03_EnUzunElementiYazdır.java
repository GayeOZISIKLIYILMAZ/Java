package day17_arrays;

public class C03_EnUzunElementiYazdır {
    public static void main(String[] args) {

        //Verilen String bir array’deki en uzun
        // ve en kisa kelimeleri yazdiran bir method olusturun.

       String [] arr1={"Melike ","Burkay ","İnci","Eda","Emre"};

       enUzunEnKisaYazdir(arr1);//Melike Eda

    }

    public static void enUzunEnKisaYazdir (String[]arr){

        String enUzunKelime=arr[0];
        String enKisakelime=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }

            if (arr[i].length()<enKisakelime.length()){
                enKisakelime=arr[i];
            }

        }
        System.out.println("Arraydeki en uzun kelime : " + enUzunKelime);
        System.out.println("Arraydeki en kısa kelime : "+ enKisakelime);
    }




    }



