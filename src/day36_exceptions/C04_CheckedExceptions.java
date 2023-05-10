package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public C04_CheckedExceptions() throws FileNotFoundException {
    }

    public static void main(String[] args) {

        //Checked exceptions kod yazılır yazılmaz daha run etmeden
        //Javanın riskli kodları tanımlayıp çalıştırmadan önce
        //bana bir yol göstermelisin dediği exception türleridir

        //Checked Exception genelde dosya okuma yazma
        //IO işlemlerinde kullanılır

        //I0 exception oluşma ihtimaline karşı kodu yazar yazmaz
        //java altını kırmızı çizer

        //Checked exception kodun altını kırmızı çizdiğinden
        //kodumuzun çalışır hale gelmesi için kırmızı çizgiyi
        //kaldırmamız lazım

        //1.try cath blogu kullanarak exception handle edilebilir
        //ve javaya exception oluştuğunda ne yapmasını istediğimiz gösterilir

        //2.Eger exceptını handle etmek istemezsek
        //sadece kodun çalışmasını istiyorsak
        //method deklerasyonuna bu exception ihtimalini yazarsak
        //kodu çalışır hale getirebiliriz.

        //method signuturuna throws keywordu ile beklenen
        //exception türünü yazarsak kod çalışır duruma gelir
        //Ancak exception oluşursa javaya çözüm yolu sunulmadığından
        //kodun çalışması durur.
    }

    String dosyaYolu="src/day36_exceptions/text.txt";

    FileInputStream fis=new FileInputStream(dosyaYolu);

}
