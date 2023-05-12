package practices_JavaPractice.practice04;

public class Q03_Static_Budget {
//Type a basic home budget
public static void main(String[] args) {
    Budget father=new Budget();
    father.getSalary(3000);
    System.out.println("familyBudget = " + Budget.familyBudget);//3000
    father.getPocketMoney(500);
    System.out.println("familyBudget = " + Budget.familyBudget);//2500 >>>>>if you insist, you can use (father.familyBudget)

    Budget mother=new Budget();
    mother.getPocketMoney(1000);
    System.out.println("familyBudget = " + Budget.familyBudget);//1500
    mother.getSalary(5000);
    System.out.println("familyBudget = " + Budget.familyBudget);//6500 >>>>>if you insist, you can use (mother.familyBudget)
    mother.spendPocketMoney(2000);//This will not work, because she does not have that much pocket money
    System.out.println("mother's pocketMoney = " + mother.pocketMoney);//1000

    Budget kid=new Budget();
    kid.getPocketMoney(1000);
    Budget.spendFamilyBudget(5000);//if you insist, you can use (kid.familyBudget)
    System.out.println("kid's pocketMoney = " + kid.pocketMoney);//1000
    System.out.println("it spent for furniture of kid = " + Budget.familyBudget);//500
}
}

