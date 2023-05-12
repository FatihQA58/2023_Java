package practices_JavaPractice.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_ArrayList_GradeAverage {
    // Get as many grades as a teacher wants to enter, and find the number of students who pass the average.
    public static void main(String[] args) {
        List<Integer> examGrades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter exam grade : ");
            examGrades.add(scan.nextInt());
            System.out.println("Let me know : Continue===>Y/N ?");
            String condition= scan.next();
            if (!(condition.equalsIgnoreCase("y"))){
                break;//==> breaks the loop under this condition
            }
        }while(true);//==> Infinite loop
        //As long as we do not use break code, this loop will keep repaiting.
        System.out.println(examGrades);

        double sum=0;
        for (int w:examGrades) {
            sum +=  w;
        }
        double average=sum/(examGrades.size());
        System.out.println("average = " + average);

        int numOfStudentAboveAverage=0;
        for (int w:examGrades) {
            if (w>average){
                numOfStudentAboveAverage++;

            }

        }
        System.out.println("numOfStudentAboveAverage = " + numOfStudentAboveAverage);
    }
}
