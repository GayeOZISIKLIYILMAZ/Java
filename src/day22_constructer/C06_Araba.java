package day22_constructer;

public class C06_Araba {
    public C06_Araba() {

    }
    /*
    Bir obje oluşturulurken default veya görünür constracter
    kullanılırsa obje ilk atanan değerlere sahip olur
    istediğimiz değerleri atamak için tek tek variabllara
    atama yapmamız gerekir
    Bunun yerine
    atamak istediğimiz değerleri parametre olarak
    constractera yollayalım
    ve atamaları constracter içinde yapalım.

     */

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

    public  C06_Araba(String mrk, String mdl, boolean hmi, int yl, int fyt){



    }

    int yil;
    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";
    boolean hasarliMi;
    int fiyat=10000;

    public void yakitTuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin":
                System.out.println("Benzinli araçlar için yakit tüketimi:" +
                        "6l/100km");
                break;
            case "Dizel":
                System.out.println("Dizel araçlar için yakit tüketimi:" +
                "5l/100km");
                break;
            case "Elektirik":
                System.out.println("Elektirikli araçlar için yakit tüketimi:"+
                            "5KW/100 km");
                break;
            default:
                System.out.println("Geçersiz yakıt türü");
        }
    }
}
