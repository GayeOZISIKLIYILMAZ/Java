package day27_stringBuilder;

public class C04_StringBuilderdaStringMethodlari {
    public static void main(String[] args) {

        /*
        StringBuilder classında olmayıp
        String classında olan methodları önce stringe cevirir
        sb.toString() kullanarak StringBuileri önce Stringe çevirir
        sonra istediğimiz String methodlarını kullanırız

        Bu konuda dikket etmemiz gereken konu String döndüren methodlar
        veya String clasından kullanacığımz methodlar kalıcı değişiklik
        YAPMAZ.
         */

        StringBuilder sb1=new StringBuilder("Java Candir");
        StringBuilder sb2=new StringBuilder("Java candir");

        sb1.substring(5);
        System.out.println(sb1);//Java Candir değişmedi

        //sb1=sb1.subsitring(5);

        System.out.println(sb1.compareTo(sb2));//-32
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));//true

        sb1.subSequence(3,6);
        System.out.println(sb1);//Java Candir


    }
}
