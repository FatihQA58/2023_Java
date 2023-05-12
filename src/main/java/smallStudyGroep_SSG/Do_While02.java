package smallStudyGroep_SSG;

import java.util.Scanner;

public class Do_While02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int num;
        do{
            System.out.println("Please enter number");
            num= scan.nextInt();
            sum+=num;
            /*if(num==0){
               break;
            }*/
        }while(num!=0);//while(true);
        System.out.println(sum);
    }
}
