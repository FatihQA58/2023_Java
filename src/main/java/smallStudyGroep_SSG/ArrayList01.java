package smallStudyGroep_SSG;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<Integer>();

        l3.add(5);
        l3.add(8);
        l3.add(5);
        l3.add(65);
        l3.add(14);
        l3.add(4);
        System.out.println(l3);
        l3.add(1,87);
        System.out.println(l3);

        for (Integer w:l3) {
            w+=2;
            System.out.print(w+" ");
        }

    }
}
