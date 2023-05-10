package day11_StringManipulation_ForLoop;

public class C06_replaceAll {
    public static void main(String[] args) {

        //Soru:Kullanicinin belirli bir formatta verdigi
        // String fiyatlari toplayip yazdirin.
        //      input1 : “15.30 €” , input2 : “11.40 €”
        //      output : 26.70 €


        String input1= "15.30 €";
        String input2= "11.40 €";

        //inputlarda digit olmayan herşeyi yok edelim.

        input1=input1.replaceAll("\\D","");//1530
        input2=input2.replaceAll("\\D","");//1140

        //Digit olmayanarı yok ettik ama hala string oldukları için
        //toplayamayız inta çevirmemiz lazım

       double inp1=Integer.parseInt(input1);
        double inp2=Integer.parseInt(input2);

        System.out.println((inp1+inp2)/100 +" €");//26.7 €

    }
}
