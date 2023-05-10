package day04_dataCastingWrapperclases;

public class C04_wrapperClases {
    public static void main(String[] args) {

        //char==>Character
        // int==>Intager
        //byte==>Byte
        //boolean==>Boolean

        // hazır methodlara sahip oluyor.

        Integer sayi=10;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        String sonucStr="345";
        System.out.println(sonucStr+10);//34510

        // 10 değeri ekleyelim

        int sonuc=Integer.parseInt(sonucStr);
        System.out.println(sonuc+10);//355

        char krk ='3';
        System.out.println(Character.isDigit(krk));//true
        System.out.println(Character.isLetter(krk));//false

    }
}
