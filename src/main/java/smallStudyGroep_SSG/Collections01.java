package smallStudyGroep_SSG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Collections01 {
    public static void main(String[] args) {
        ArrayList<Integer>list01=new ArrayList<>();
        list01.add(12);
        list01.add(22);
        list01.add(32);
        list01.add(42);
        list01.add(52);
        System.out.println(list01);
        list01.add(32);
        list01.add(42);
        list01.add(52);
        System.out.println(list01);

        System.out.println("<===============>");

        Set<Integer>list02=new HashSet<>();
        list02.add(12);
        list02.add(22);
        list02.add(32);
        list02.add(42);
        list02.add(52);
        System.out.println(list02);
        list02.add(32);
        list02.add(42);
        list02.add(52);
        System.out.println(list02);



    }
}
