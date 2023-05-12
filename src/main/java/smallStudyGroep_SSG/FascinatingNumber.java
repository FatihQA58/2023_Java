package smallStudyGroep_SSG;

import java.util.Arrays;

public class FascinatingNumber {
    public static void main(String[] args) {
        System.out.println(isFacinatingNumber( 192));

    }
    public static boolean isFacinatingNumber(int num){
        int multplyBy2=num*2;
        int multplyBy3=num*3;
        String fscntngNum=""+num+multplyBy2+multplyBy3;//Converting int to String
        char[] number=fscntngNum.toCharArray();//Converting String to char
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        fscntngNum=new String(number);//Converting char to String
        return fscntngNum.equals("123456789");
    }

}
