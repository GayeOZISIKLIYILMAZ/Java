package day04_dataCastingWrapperclases;

public class C01_AsciiTable {
    public static void main(String[] args) {

        /*
        a==>97==>10100010
        char data türündeki variable ve değerler sayısal data türlerine atanırsa
        veya sayısal data türündeki datalarla işleme sokulursa
        ascii tabldeki değerleri ile işleme girer.





         */
        System.out.println(5+'a');//102

        // kullanıcıdan aldığımız halfin bir sonrasını yazdır
        char girilenChar='f';
        System.out.println(girilenChar+1); //103 yazdırır

        System.out.println("Girilen halfin harfin bir sonrası : "+(char) (girilenChar+1));



    }

}
