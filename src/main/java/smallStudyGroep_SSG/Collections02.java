package smallStudyGroep_SSG;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections02 {
    public static void main(String[] args) {
        String arr[]={"Java","Python","C","C++"};
        System.out.println(isPerfectArray (arr));

       /*
        String arr[]=new String[4];
        arr[0]="Java";
        arr[1]="Python";
        arr[2]="C";
        arr[3]="C++";
        System.out.println(Arrays.toString(arr));

        String new_Arr[]=new String[arr.length];

        int indx=0;
        for (int i=0; i<arr.length; i++) {
            new_Arr[indx]=arr[i];
            indx++;
        }
        System.out.println(Arrays.toString(new_Arr));

        //Arrays.sort(new_Arr);------>if we did sort(), it will print "Not Perfect"

        if (Arrays.equals(arr,new_Arr)){
            System.out.println("Perfect");
        }else {
            System.out.println("Not Perfect");
        }

        */
    }
    public static boolean isPerfectArray (String arr[]){
    for (int i=0; i<arr.length; i++){
        if(arr[i]==arr[(arr.length-1)-i]){
            return true;
        }
    }

        return false;
    }


}
