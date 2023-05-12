package day07ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1: Type code to check if a number is even or odd.
        int num = 13;
        //1.Way:
        if(num%2==0){
            System.out.println("Even");
        }
        if(num%2!=0){
            System.out.println("Odd");
        }

        //2.Way:
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


        //Example 2: Type code to check if initial of a String is upper case or not
      // 1.Way  :
        String str="Amsterdam";
        if(str.charAt(0)>='A' && str.charAt(0)<='Z' ){
            System.out.println("Initial of str is uppercase");
        }if(str.charAt(0)<'A' || str.charAt(0)>'Z' ){
            System.out.println("Initial of str is not uppercase");
        }
        //2.Way
        if(str.charAt(0)>='A' && str.charAt(0)<='Z'){
            System.out.println("It is upper case");
        }else{
            System.out.println("Not upper case");
        }
        int num2=-21;
        if(num2==0){
            System.out.println("Number is : "+num2);
        }else if(num2>0) {
            System.out.println("Number " + num2 + " is : Positive");
        }else{
            System.out.println("Number " + num2 + " is : Negative");
        }
        int dayNum=2;
        if(dayNum==1){
            System.out.println("Maandag");
        } else if (dayNum==2) {
            System.out.println("Dinsdag");
        } else if (dayNum==3) {
            System.out.println("Woensdag");
        }else if (dayNum==4) {
            System.out.println("Thursday");
        }else if (dayNum==5) {
            System.out.println("Vrijdag");
        }else if (dayNum==3) {
            System.out.println("Zaterdag");
        }else if (dayNum==3) {
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day number, please enter numbers from 1 to 7 ");
        }
    }
    }