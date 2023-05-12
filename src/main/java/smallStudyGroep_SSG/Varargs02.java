package smallStudyGroep_SSG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varargs02 {
    public static void main(String[] args) {
        //Two ways of method calling???
        int []a={23,56,76,87,91};
        int []b={43,76,86,97};
        System.out.println(Arrays.toString(mergeArray(a, b)));
        getArrays(a,b);

    }
    //Function to merge a variable number of arrays of integers using varargs
    //---------->1.YOL
    public static int[] mergeArray(int[]...varargs){

        int totalLength=0;
        for (int[]arr:varargs) {
            totalLength+=arr.length;
        }
        int[]mergeArray=new int[totalLength];
        int indx=0;
        for (int[]arr:varargs) {
            for (int w:arr) {
                mergeArray[indx]+=w;
                indx++;
            }
        }
        return mergeArray;
    }
    //---------->2.YOL
    public static void getArrays(int []a,int ...b){
        int length=a.length+b.length;
        int newMergeArray[]=new int[length];

        int idx1=0;
        for (int i=0; i<a.length; i++){
            newMergeArray[idx1]=a[i];
            idx1++;
        }
        int idx2=idx1;
        for (int i=0; i<b.length; i++){
            newMergeArray[idx2]=b[i];
            idx2++;
        }
        System.out.println(Arrays.toString(newMergeArray));
    }
}
