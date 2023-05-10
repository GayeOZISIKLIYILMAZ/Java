package day15_doWhileLoop_scope;

public class C02_RakamlarToplamınıBul {
    public static void main(String[] args) {
        //verilen pozitif bir tam sayının rakamlar toplamını
        //bize döndüren method oluşturun


    }

    public static int rakamlarToplamınıBul(int verilenSayi){

        int sayi=verilenSayi;

        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int basamakSayisi=(sayi+"").length();

        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagı=sayi%10;
            rakamlarToplamı+=basamakSayisi;
            sayi/=10;

        }

        return rakamlarToplamı;
    }
}
