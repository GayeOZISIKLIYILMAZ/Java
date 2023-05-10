package day05_incrementDecrment_Concanetion;

public class C03_Concatinetion {
    public static void main(String[] args) {
        // bir string başka bir string veya başka data türünden bir variable ile
        // + işareti ile birleştirilebilir

        String a="Java";
        String b="Guzeldir";
        System.out.println(a+b);// javagüzeldir

        System.out.println(a+ " "+b);// java güzeldir

        int c=10;
        int d=20;
        System.out.println(a+b+d);//Java1020
        // stringle başka data türünden değer toplanırsa sonuç string olur

        System.out.println(a+(c+d));//Java30
        System.out.println(a+c*d);//Java200
        System.out.println(d+c+a);//30Java


    }
}
