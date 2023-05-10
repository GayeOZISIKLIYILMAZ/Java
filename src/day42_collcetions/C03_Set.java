package day42_collcetions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        //Verilen bir arryin tekrar eden elementlerini silip
        //her bir elementin sadece 1 kere kullanıldığı hale getirin

        int []arr={3,5,8,9,2,3,4,3,4,1,3,5,3,1,6};

        Set<Integer>geciciSet=new HashSet<>();

        for (Integer aech:arr
             ) {
            geciciSet.add(aech);
        }
        int []geciciArr=new int [geciciSet.size()];

        int index=0;

        for (Integer each:geciciSet
             ) {
             geciciArr[index]=each;
             index++;
        }
        arr=geciciArr;
        System.out.println(Arrays.toString(arr));
    }
}
