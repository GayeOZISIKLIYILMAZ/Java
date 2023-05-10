package day08_nestedIfElse_Ternary;

public class C08_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir half isteyin
        //girilen karakter küçük half ise onu büyük half olarak yazdırın
        //yoksa girilen halfi yazdırın

        char half='m';

        System.out.println(half>='a' && half<='z' ? Character.toUpperCase(half) :half);
    }
}
