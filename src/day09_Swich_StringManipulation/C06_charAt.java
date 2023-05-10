package day09_Swich_StringManipulation;

public class C06_charAt {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.charAt(0));;//J

        //baştan 6.halfi yazdır
        System.out.println(str.charAt(5));//c

        //sondan 2. halfi
        System.out.println(str.charAt(11-2));//i

        //son halfi yazdırın
        System.out.println(str.charAt(11-1));//r

         // javada 2 tür hata ile karşılaşabiliriz
        //1-) syntax olarak hatalı yazılan kodlari Java compile ederken anlar
        //ve altını çizer ÖRNK : str=23; string variabıla int değer atanamaz
        //CompileTimeEror (CTE)

        //2-)bazende sytaxda hata olmaz java sorunu çalışmaya başladıktan sonra farkeder
        //str.charAt(15) : burada verilen strdan bir karakter isteniyor
        //compile timede strin uzunluğunu java anlamaz ama çalışınca 15.indeksin olmadığını
        // farkeder exception fırlatır RunTimeEROR (RTE)
    }
}
