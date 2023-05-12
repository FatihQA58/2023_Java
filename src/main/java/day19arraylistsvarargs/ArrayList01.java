package day19arraylistsvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String>dataBase_email=new ArrayList<>();
        dataBase_email.add("asd@gmail.com");
        dataBase_email.add("acd@gmail.com");
        dataBase_email.add("abd@gmail.com");
        dataBase_email.add("add@gmail.com");
        dataBase_email.add("easfd@gmail.com");

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an email account");
        String email=scan.next();

            if (dataBase_email.contains(email)){
                System.out.println("This is taken, you can follow next step..");
                LocalDate date=LocalDate.now();//2023-04-14
                String currentDate=date.toString().replaceAll("[^0-9]","");//20230414
                LocalTime time=LocalTime.now();//12:21:51.169499800
                String currentTime= time.toString().split("\\.")[0].replaceAll("[^0-9]","");//122619
                String unique_email=email.split("@")[0]+currentDate+currentTime+"@"+email.split("@")[1];
                System.out.println(unique_email);
            }   else {
                dataBase_email.add(email);
                System.out.println("This email can be used");
            }

        System.out.println(dataBase_email);

    }
}
