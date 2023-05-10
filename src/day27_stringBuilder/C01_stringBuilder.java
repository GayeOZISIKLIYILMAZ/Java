package day27_stringBuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0

        sb1.append("Mustafa");

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//7


        sb1.append(" Yılmaztürk");

        System.out.println(sb1);//Mustafa Yilmaztürk 18 karekter
        System.out.println(sb1.capacity());//34 =2*eski capasity+2
        System.out.println(sb1.length());//18

        sb1.append("Javayı çok sever sabah akşam java çalışır");

        System.out.println(sb1.capacity());//70=2*34+2
        System.out.println(sb1.length());//62

        //2.yöntem

        StringBuilder sb2=new StringBuilder("Java candir");
        System.out.println(sb2.capacity());//27
        System.out.println(sb2.length());//11


        //3.yöntem

        StringBuilder sb3=new StringBuilder(11);
        sb3.append("24789076432");
        System.out.println(sb3.capacity());//11
        System.out.println(sb3.length());//11


        String str = "Java Candir";
        sb3.append(str,4,str.length());
        System.out.println(sb3); // 54464473321 : Tc No Candir

        // trim :
        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 26
        System.out.println(sb3.length()); // 26
    }
}
