package day24inheritance;

public class Honda extends Car{
    public int age=6;

    public void move(){
        System.out.println("Honda moves...");
    }
    public Honda(){
        super();
        System.out.println("Honda constructor 1");
    }
    public Honda(int a){
        this();//it takes me to the constructor with int parameter in Honda class
        System.out.println("Honda constructor 2"+a);
    }
}
