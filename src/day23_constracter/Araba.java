package day23_constracter;

public class Araba {


    public Araba(int i, String bmw) {
    }

    public Araba() {

    }

    @Override
    public String toString() {
        return "C06_Araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    public Araba(int yil,String marka, String model, boolean hasarliMi, int fiyat){
        /*
            Eger parametre ismi instance variable ismi ile AYNI DEGILSE
            bir alttdaki constructor'da oldugu gibi
            direk atama yapabiliriz

            Ancak genelde projenin daha anlasilir olmasi
            ve dogru variable'in kullanilmasi icin
            constructor'daki parametre isimleri, instance variable'lar ile ayni secilir

            Bu durumda Java'ya ayni isimdeki iki variable'dan
            hangisinin bu class'daki instance variable oldugunu belirtmemiz gerekir.

            bunun icin Java syntax olarak this. yazilmasini istemistir.

            this. yazmazsak Java en kisa sekilde ulasabilecegi variable'i bulur
         */

        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.hasarliMi = hasarliMi;
        this.fiyat = fiyat;

    }


    int yil;
    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    boolean hasarliMi;
    int fiyat = 10000;

    public void yakitTuketimi(String yakitTuru) {

        switch (yakitTuru) {
            case "Benzin":
                System.out.println("Benzinli araçlar için yakit tüketimi:" +
                        "6l/100km");
                break;
            case "Dizel":
                System.out.println("Dizel araçlar için yakit tüketimi:" +
                        "5l/100km");
                break;
            case "Elektirik":
                System.out.println("Elektirikli araçlar için yakit tüketimi:" +
                        "5KW/100 km");
                break;
            default:
                System.out.println("Geçersiz yakıt türü");
        }
        {


        }
    }
}
