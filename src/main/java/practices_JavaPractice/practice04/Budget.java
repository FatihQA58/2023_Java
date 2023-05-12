package practices_JavaPractice.practice04;

public class Budget {
    public static double familyBudget;
    public double pocketMoney;

    public void getPocketMoney(double moneyToTake){
        familyBudget-=moneyToTake;
        pocketMoney+=moneyToTake;

    }
    public void getSalary(double salary){
        familyBudget+=salary;

    }
    public void spendPocketMoney(double moneyToSpend) {

        if (pocketMoney > moneyToSpend) {
            pocketMoney -= moneyToSpend;
        }
    }
    public static void spendFamilyBudget(double moneyToSpend){
        if (familyBudget>moneyToSpend){
            familyBudget-=moneyToSpend;
        }
    }

}
