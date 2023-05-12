package smallStudyGroep_SSG;

public class TypeCasting {
    public static void main(String[] args) {
        byte byt=127;
        int num=byt;
        System.out.println("byt = " + byt);
        System.out.println("num = " + num);

        System.out.println();

        int num2=128;
        byte byt2= (byte) num2;
        System.out.println("byt2 = " + byt2);
        System.out.println("num2 = " + num2);

        System.out.println();

        float flt=77.4f;
        int num3= (int) flt;
        System.out.println("num3 = " + num3);
        System.out.println("flt = " + flt);


    }
}
