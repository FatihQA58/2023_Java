package practices_JavaPractice.practice01;

//Ctrl+D=====>Bir alt satira bulundugun satirin aynisini yazdirma
//variable adini yazip nokta koyduktan sonra soutv secersek variable'i etiketiyle birlikte yazdirabiliriz.
//(System.out.println("tenThousends = " + tenThousends);)
//WET CODE====>Write Everything Twice
//DRY CODE====>Don't Repeat Yourself
//"\n"========>output bir alsagi satira indirme
//Code-Reformat Code======>Yazilan kodlari duzenli gosterme(Ctrl+Alt+L)
public class Q01_Variables {
    public static void main(String[] args) {
        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        //1.way
        int x = 12345;
        int ones = x % 10;
        int tens = (x / 10) % 10;
        int hundreds = (x / 100) % 10;
        int thousends = (x / 1000) % 10;
        int tenThousends = (x / 10000) % 10;

        System.out.println(tenThousends + "\n" + "" + thousends + "\n" + hundreds + "\n" + tens + "\n" + ones);


        //2.WAY
        int number = 12345;
        int mod = 0;
        for (int i = 0; number > 0; number /= 10) {
            mod = number % 10;
            System.out.println(mod);
        }

    }
}
