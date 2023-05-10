package day25_passByValue_ImmutableClasses;

public class C03_ImmutubleClases {
    public static void main(String[] args) {

        /*
        Javada bir clas ve o clastan oluşturulan objeler
        ya mutubledır ya inmutubledir

       Java metinsel ifadeleri atayabileciğimiz
       3 clas oluşturmuştur
       String  immutuble
       StringBuilder  mutable
       StringBuffer  mutuble

       Immutuble bir clasta oluşturulan objelerde immutubldır
       String immutuble olduğunda java eski değeri değiştiremez
       bunun yerine istenen yeni değere sahip yeni bir obje
       oluşturur ve strın pointrını yeni objeye yöneltir

       Kullanılmayan eski objeler
       garbage collecter tarafından toplanmak üzere beklerler



         */

        String str="Java candir";

        str=str.toLowerCase();
        System.out.println(str);//java candir

        str=str.toUpperCase();
        System.out.println(str);//JAVA CANDİR


        //Aşağıdaki kod çalıştığında
        //java kaç obje oluşturur?

        String s="Hava";

        for (int i = 0; i <100 ; i++) {
            s=s+".";


        }


    }
}
