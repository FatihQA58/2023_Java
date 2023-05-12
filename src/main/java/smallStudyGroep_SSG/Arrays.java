package smallStudyGroep_SSG;


public class Arrays {
    public static void main(String[] args) {
        Integer [] arr={12,21,32,45,56};
        System.out.println(java.util.Arrays.toString(arr));

        int [] arr2=new int[5];
        arr2[0]=12;
        arr2[1]=21;
        arr2[2]=32;
        arr2[3]=45;
        arr2[4]=56;
        System.out.println(java.util.Arrays.toString(arr2));

        int [] arr3=new int[5];
        arr3[0]=2;
        arr3[1]=21;
        arr3[2]=3;
        arr3[3]=5;
        arr3[4]=56;
        System.out.println(java.util.Arrays.toString(arr3));

        int sum=0;
        for (int w:arr3) {
            sum+=w;
            if (w<8){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);

        for (int k:arr3) {
            if (k%2==0){
                System.out.println(k+" is even number");
        }else{
                System.out.println(k+" is oud number");
            }

        }
    }


}
