package day19arraylistsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    //Example 2: Ask user to enter an integer from 1 to 10
    //           If the number user entered exists in the Database(DB) change the number to "Bingo"
    //           If the number user entered does not exist in the DB add it into the DB
    //           If all records in the DB is "Bingo" give a message to the user like "You won!"
    public static void main(String[] args) {
        List<String>database=new ArrayList<>();
        database.add("5");
        database.add("8");
        database.add("2");
        database.add("9");

        int counter=0;
        do{
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer from 1 to 10");
        String num=scan.next();

        int number=Integer.valueOf(num);

        if (number>10 || number<1){
            System.out.println("Use the numbers from 1 to 10");
        } else if (database.contains(number)) {
            database.set(database.indexOf(number),"Bingo");
            counter++;
        }else {
            database.add(num);
        }
        if (counter==database.size()) {
            System.out.println("YOU WON!!!!!!!");
            break;
        }
        }while (true);
        System.out.println(database);
    }
}
