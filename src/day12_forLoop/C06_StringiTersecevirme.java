package day12_forLoop;

public class C06_StringiTersecevirme {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

       String input="Java candir";

       String output="";

        for (int i = input.length()-1; i >=0 ; i--) {

            output +=input.charAt(i);

        }
        System.out.println(output);


    }
}
