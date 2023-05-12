package day14arraysforeacloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1)Array can contain just "primitive" data types and "references"
     */
        //Example 1: Create an integer array with 4 elements, then find the sum of all elements

        int num[]= new int[4];
        System.out.println(Arrays.toString(num));
        num[0]=12;
        num[1]=21;
        num[2]=37;
        num[3]=59;
        System.out.println(Arrays.toString(num));

        int sum=0;
        for (int w:num) {
           sum=sum+w;
        }
        System.out.println(sum);

        //Example 2: Create a String array with the length 5, print the elements whose length is more than 6 on the console.
        String cities[]=new String[5];
        cities[0]="Sivas";
        cities[1]="Erzurum";
        cities[2]="Malatya";
        cities[3]="Rize";
        cities[4]="Bingol";
        System.out.println(Arrays.toString(cities));

        for (String w:cities) {
            if (w.length()>6){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //Example 3: Create a String array with the length 5, print the elements before "California" on the console.
        String city[]=new String[5];
        city[0] = "Miami";
        city[1] = "New York";
        city[2] = "Jacksonville";
        city[3] = "California";
        city[4] = "Tampa";
        System.out.println(Arrays.toString(city));

        for (String w:city) {
            if (w.equals("California")){
                break;
            }
            System.out.print(w+" ");
        }
        //Example 4: Create a String array with the length 5, print the elements except "California" and "Miami" on the console.
        String steden[]=new String[5];
        steden[0] = "Miami";
        steden[1] = "New York";
        steden[2] = "Jacksonville";
        steden[3] = "California";
        steden[4] = "Tampa";
        System.out.println(Arrays.toString(steden));

        for (String w:steden) {
            if (w.equals("Miami")||w.equals("California")){
                continue;
            }
            System.out.print(w+" ");
        }
    }

}
