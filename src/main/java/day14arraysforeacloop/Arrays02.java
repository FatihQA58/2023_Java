package day14arraysforeacloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: Type code lets user enter many student names into an array.
        //           Whenever user wants he should be able to quit
        //           When I quit or complete I should be able see all elements on the console.

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of the students you want to add ...");
        int numOfSdtnt=input.nextInt();
        String names[]=new String[numOfSdtnt];

        for (int i=0; i<numOfSdtnt; i++){
            System.out.println("Please enter "+(i+1)+ ". student name, to quit press 'q'");
            String stdntNames=input.next();

            if (!stdntNames.equalsIgnoreCase("q")){
                names[i]=stdntNames;
            }
            else {
                break;
            }
        }
        for (String w:names) {
            if(w!=null){
                System.out.print(w+" ");
            }
            /*
            if(w!=null){
               break;
            }
             System.out.print(w+" ");
             */
        }
    }
}
