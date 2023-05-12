package smallStudyGroep_SSG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        HashSet<Integer> l1 = new HashSet<>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(1);
        l1.add(7);
        System.out.println(l1);

        List<Integer>l2=new ArrayList<>();
        l2.add(1);
        l2.add(3);
        l2.add(5);
        l2.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(1);
        l2.add(7);
        System.out.println(l2);
        System.out.println(creatUniqueList(l2));;


    }
    public static List<Integer> creatUniqueList(List<Integer> numbers){
        List<Integer>uniqueList=new ArrayList<>();
        for (int i=0; i<numbers.size(); i++){
            if (!uniqueList.contains(numbers.get(i))){
                uniqueList.add(numbers.get(i));
            }
        }
        return uniqueList;
    }
}
