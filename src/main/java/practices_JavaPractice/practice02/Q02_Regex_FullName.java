package practices_JavaPractice.practice02;

import java.util.Scanner;

public class Q02_Regex_FullName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name and surname with a space between them");
        String fullName=input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim();
        String name=fullName.split(" ")[0].substring(0,1).toUpperCase()+fullName.split(" ")[1].substring(1).toLowerCase();
        String surname=fullName.split(" ")[1].substring(0,1).toUpperCase()+fullName.split(" ")[1].substring(1).toLowerCase();

        System.out.println("Name : "+name+"\nSurname : "+surname);


    }
}
