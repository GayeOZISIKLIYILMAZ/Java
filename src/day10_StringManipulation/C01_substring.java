package day10_StringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ne kadar guzel";
      //substring 2 farklı şek kullanılabilir
        //1- tek parametre olursa o indeksten başlar sonuna kadar yazdırır

        System.out.println(str.substring(8));// kadar guzel

        System.out.println(str.substring(0));//Java ne kadar guzel
        System.out.println(str.substring(str.length() - 3));//zel

        System.out.println(str.substring(str.length()));//hiçlik


        //2-iki parametre girilirse başlangıç indeksinden (dahil) başlar
        //bitiş indeksi (hariç) olan bölümü yazdırır.

        System.out.println(str.substring(5, 7));//ne
        System.out.println(str.substring(3, 4));//a
        System.out.println(str.substring(0 ,1));//J

        // str ın 5. indeksteki karekterini yazınız

        System.out.println(str.charAt(5));//n
        System.out.println(str.substring(5, 6));//n

        System.out.println(str.substring(2,2));//hiçlik

        System.out.println(str.substring(5, 1));// Run Time Eror


    }


}
