package practices_JavaPractice.practice04;

import java.time.LocalTime;
import java.util.Scanner;

public class Q04_DateTime_DiceSecond {
     /*
     Write a method that rolls two dice and compares the result with the score of the computer by multiplying the result by 2 or 5 according to the second it was rolled.
     If the second of the dice is a multiple of 5, the number of dice will be multiplied by 5 and added to the score.
     If the second of the dice is a multiple of 2, the number of dice will be multiplied by 2 and added to the score.
     If the second of the dice is odd number, the number of dice will be added to the score.
    */
     public static void main(String[] args){
         rollDice();
     }
    static int playerDice;
    static int computerDice;
    static int playerSecond;
    static int computerSecond;
    static int playScore;
    static int computerScore;
    static int counter;
     public static void rollDice(){
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter R to roll dice");
         if (scan.next().equalsIgnoreCase("r")){
             playerDice=(int)((Math.random()*6)+1);
             System.out.println("playerDice :"+playerDice);
             playerSecond=LocalTime.now().getSecond();
             System.out.println("playerSecond :"+playerSecond);
             if (playerSecond%5==0) {
                 playScore+=playerDice*5;
             } else if (playerSecond%2==0) {
                 playScore+=playerDice*2;
             }else{
                 playScore+=playerDice;
             }
         }else{
             rollDice();
         }
         System.out.println("playScore : " + playScore);

         computerDice=(int)((Math.random()*6)+1);
         System.out.println("computerDice : "+computerDice);
         computerSecond=playerSecond+1;
         System.out.println("computerSecond : "+computerSecond);
         if (computerSecond%5==0) {
             computerScore+=computerDice*5;
         } else if (computerSecond%2==0) {
             computerScore+=computerDice*2;
         }else{
             computerScore+=computerDice;
         }
         System.out.println("computerScore : " + computerScore);
         counter++;
         if (counter==2){
             if (playScore>computerScore){
                 System.out.println("You Win!!! Your score is : "+playScore+" ---Computer's score is: "+computerScore);
             } else if (playScore<computerScore) {
                 System.out.println("You Lose!!! Your score is : "+playScore+" ---Computer's score is: "+computerScore);
             }else {
                 System.out.println("Draw!!! Your score is : "+playScore+" ---Computer's score is: "+computerScore);
             }
         }else {
             rollDice();
         }

     }
}
