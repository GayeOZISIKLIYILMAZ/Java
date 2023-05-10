package day11_StringManipulation_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        //null bir değer değildir
        //null pointerdır. Yanaına yazıldığı non primitive
        //variabla değer atanmadığını işaret eder

        String str; // str oluşyuruldu değer atanmadı

        //java method içerisinde değer atamadan variable oluşturmasına izin verr
        //ama değer atamadan kullanmaya izin vermez.

        //Sytem.out.println(str); CTE
       // str.concat("Java"); CTE

        //bazen programlarda variablelar oluşturulur
        // daha sonra değer atanacağı için değer ataması yapılmaz
        // değer ataması yapılmadan listeleme bile CTE verdiği için
        // değer verilmediğini işaretleyecek ama CTE oluşmasını
        //engelleyecek bir çözüm olarak null pointer oluşturulur

        str=null; //str="null" DEĞİL
                 //NULL OLARAK İŞARETLENMİŞ DEĞERİ NULL ATANMIŞ DEĞİL

        System.out.println(str);//null
        System.out.println(str.concat("Java"));//Null pointerException

        System.out.println(str.length());//Null pointerException

        System.out.println(str+"Java");// nullJava

        String str2=str+"Java";// toplamalarda hata vermiyor

        //biz genelde string bir ifade oluşturup sonra değer atayacaksak hiçlik
        //değeri atarız.

        String str3=""; //str3e değer atanmıştır

        //null olarak işaretlenen string hibir methodla kullanılamaz.





    }
}
