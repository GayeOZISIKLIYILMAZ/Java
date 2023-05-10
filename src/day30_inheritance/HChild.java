package day30_inheritance;

public class HChild extends GParent {

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constarcturı  çalıştı");
    }

    public static void main(String[] args) {

        HChild objChild=new HChild();
        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayipareny);
        System.out.println(objChild.sayiGrandpareny);

        /*
        Child clasdan oluşturduğumuz obje
        parent ve grandparent claslarındaki tüm
        özelliklere sahip olur.

        Bir obje oluşturulduğunda
        ilk değerleri alabilmesi için MUTLAKA BİR CONSTRACTER çalışmalıdır.

        Constracter call bizim çok kullandığımız özellik değildir
        fakat inheritanceyi tam olarak anlamamız için constacter call
        konusunu bilmemiz lazım.

        Bu clastan obje oluşturmak için HChild () constractırını
        kullandık AMA objemiz parent ve grandparenttaki
        özellikleride sahiplendi

        peki bu nasıl oldu?

         */
    }
}
