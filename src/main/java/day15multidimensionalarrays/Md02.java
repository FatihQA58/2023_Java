package day15multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
//Example 1: Convert a multidimensional array to a one dimensional array
        //           { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }
        String [] []arr= { {"learn", "java", "it"}, {"is", "easy"} };
        //1.Step: Create a one dimensional array
        //        We need to calculate the number of elements in the multidimensional array
        int totalNumOfElements=0;
                        //{ {"learn", "java", "it"}, {"is", "easy"} }
        for (String[] w:arr) {
            totalNumOfElements=totalNumOfElements+w.length;
        }
        System.out.println(totalNumOfElements);//5

        String [] new_arr=new String[totalNumOfElements];
        System.out.println(Arrays.toString(new_arr));// [null, null, null, null, null]

        //2.Step: Transfer elements from multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} }
        int indx=0;
                         //{ {"learn", "java", "it"}, {"is", "easy"} }
        for (String [] w:arr) {
                         //{"is", "easy"}
                        //{"learn", "java", "it"}
            for (String u:w) {
                new_arr[indx]=u;
                //newWords[0] = "Learn"
                //newWords[1] = "Java"
                //newWords[2] = "it"
                indx++;
            }

        }
        System.out.println(Arrays.toString(new_arr));//[learn, java, it, is, easy]
    }
}
