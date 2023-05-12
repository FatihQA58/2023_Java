package smallStudyGroep_SSG;

public class NestedLoop02 {
    public static void main(String[] args) {
        for (int i=1; i<5; i++){
            for (int j=1; j<9; j++){
              if(i>1 && j>1 && j<8 && i<4) {//if(i==1 || j==1 || j==8 ||i==4)
                  System.out.print("X ");
              } else  {
                  System.out.print("A ");
              }
            }
            System.out.println();
        }

    }
}
