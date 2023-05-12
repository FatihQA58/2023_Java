package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
         /*
           Example 1: Type code to find the number of occurrences of letters in a sentence
                      Java is easy ==> J=1, a=3, v=1, i=1, s=2, y=1
     */
        String str = "Java is easy.";
        String[] arr = str.replaceAll("[^a-zA-Z]", "").trim().split("");
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> occurenceOfCharacter = new HashMap<>();

        for (String w : arr) {
            Integer numberOfOccurence = occurenceOfCharacter.get(w);
            if (numberOfOccurence == null) {
                occurenceOfCharacter.put(w, 1);
            } else {
                occurenceOfCharacter.replace(w, numberOfOccurence + 1);
            }
        }
        System.out.println(occurenceOfCharacter);
    }
}