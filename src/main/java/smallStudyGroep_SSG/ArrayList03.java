package smallStudyGroep_SSG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(3);
        l2.add(5);
        l2.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(1);
        l2.add(7);
        System.out.println(delete(l2));

    }
    public static List<Integer> delete(List<Integer>numbers){
        List<Integer>newMethod=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Can you choose which num you delete,please");
        int num= scan.nextInt();
        for (int i=0; i<numbers.size(); i++) {
            if (!(numbers.get(i)==num)){
                newMethod.add(numbers.get(i));
            }

        }
        return newMethod;
    }
}
