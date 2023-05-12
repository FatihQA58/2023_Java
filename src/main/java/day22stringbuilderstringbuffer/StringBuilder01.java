package day22stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");

        sb1.insert(1,"xxx");
        System.out.println(sb1);//Jxxxava

        sb1.insert(4,"abcde",1,3);
        System.out.println(sb1);//Jxxxbcava

        sb1.reverse();
        System.out.println(sb1);//avacbxxxJ

        sb1.replace(5,8,"y");//avacbyJ
        System.out.println(sb1);//avacbyJ

        String str1=sb1.toString();
        System.out.println(str1);

        StringBuilder sb2=new StringBuilder(str1);
        System.out.println(sb2);

        int idx1=sb2.indexOf("a");
        System.out.println(idx1);

    }
}
