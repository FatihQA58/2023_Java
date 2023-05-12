package practices_JavaPractice.practice01;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {
        /*
	 Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
	 		First Name: ...
	 		Last Name : ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Note: Use only one "System.out.println();"
	 */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter his/her first name");
        String name=input.nextLine();
        System.out.println("Please enter his/her first last name");
        String lastName=input.nextLine();
        System.out.println("Please enter his/her age");
        byte age=input.nextByte();
        System.out.println("Please enter his/her height");
        Double height=input.nextDouble();
        System.out.println("Please enter his/her weight");
        Double weight=input.nextDouble();
        System.out.println("First Name : " + name+"\n"+"Last Name : " + lastName+"\n"+"Age : " + age+"\n"+"Height : " + height+"\n"+"Weight : " + weight);

    }
}
