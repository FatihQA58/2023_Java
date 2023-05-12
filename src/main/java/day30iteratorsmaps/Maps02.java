package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    //Example 1: Type code to find the number of occurrences of the words in a sentence
    //           Java, I like Java Java. ==> Java=3, I=1, like=1
    public static void main(String[] args) {
        String str="Java, I like Java Java.";
        String [] arr=str.replaceAll("\\p{P}", "").trim().split(" ");
        System.out.println(Arrays.toString(arr));

        HashMap<String,Integer>occurrenceMap=new HashMap<>();
        for (String w:arr) {
            Integer numOfOccurence=occurrenceMap.get(w);
            if (numOfOccurence==null){
                occurrenceMap.put(w,1);
            }else {
                occurrenceMap.replace(w,numOfOccurence+1);
            }

        }
        System.out.println(occurrenceMap);
    }

}
