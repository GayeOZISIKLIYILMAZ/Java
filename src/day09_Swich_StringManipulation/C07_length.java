package day09_Swich_StringManipulation;

public class C07_length {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";
        // karekter sayısını yazdırın

        System.out.println(str.length());//30

        //son karekteri yazdırın
        System.out.println(str.length()-1);

        // sondan 3. karekteri yazdırın

        System.out.println(str.charAt(str.length() - 3));//y
    }
}
