package day30_inheritance;

public class EChild extends DParrentAccessModifer {
    static int sayiChildStatic;
    public static void main(String[] args) {



        //Inheritancede privite class üyeleri inherit edilemez

        EChild eChild=new EChild();

        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);

        //içinde bulunduğumuz classlardaki static
        //variabllar obje üzerinden otomatik gelmez
        //ama manuel yazdığımızda java kabullenir
        System.out.println(eChild.sayiChildStatic);

        //ancak parent clasdaki static variabllar
        //obje üzerinden kullanılamaz
        //System.out.println(eChild.sayi.StaticPrivate);







    }
}
