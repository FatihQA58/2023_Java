package day18arraylists;

public class Interview01 {
    public static void main(String[] args) {
        //Example 1: Swap the given two integers
        //           int a = 12; and int b = 5; ==> a = 5 and b = 12

        //1.Way:
        int a = 12;
        System.out.println("Before the swap a = " + a);
        int b = 5;
        System.out.println("Before the swap b = " + b);
        int c=a;

        a=b;
        System.out.println("After the swap a = " + a);
        b=c;
        System.out.println("After the swap b = " + b);

        //2.Way:
        int d=12;
        System.out.println("Before the swap d = " + d);
        int e=5;
        System.out.println("Before the swap e = " + e);

        d=d+e;
        e=d-e;
        System.out.println("After the swap e = " + e);
        d=d-e;
        System.out.println("After the swap d = " + d);





    }
}
