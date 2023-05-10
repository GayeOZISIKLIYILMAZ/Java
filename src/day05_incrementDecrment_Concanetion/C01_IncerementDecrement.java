package day05_incrementDecrment_Concanetion;

public class C01_IncerementDecrement {
    public static void main(String[] args) {

        int a=20;
        //a nın değerini 3 arttırın ve yeni değerini oluşturacağınız b variabına atayın

       // a=a+3; böylede olur

        a+=3; // bunu kullanmak daha iyi
        // b variablına atama
        int b=a;

        System.out.println("a : "+ a +",b : "+ b);// a:23 b:23


        a=20;
        // anın değerinini b ye atayın a nın değerini 3 arttırın

        b=a;
        a+=3;
        System.out.println("a : "+ a +",b : "+ b);// a:23 b:20


        a=20;
        // anın değerini yazdırın ve sonra a yı 5 arttırın

        System.out.println("a : " + a);
        a+=5;
        // burada a yı yazdırsak 25 yazar.









    }
}
