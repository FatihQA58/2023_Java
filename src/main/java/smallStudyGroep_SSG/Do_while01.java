package smallStudyGroep_SSG;

import java.util.Scanner;

public class Do_while01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum = 0;
        int num=0;
        do {
            System.out.println("Please enter number");
            num= scan.nextInt();
            sum+=num;

        }while (sum<501);
        System.out.println("You have entered enough number, the sum is : "+sum);
    }
}
