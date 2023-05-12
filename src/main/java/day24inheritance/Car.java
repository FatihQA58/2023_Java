package day24inheritance;

public class Car extends Vehicle{
    public int age=8;

    public void move(){
        System.out.println("Car moves...");
    }
    public Car(){
        this(7);//it takes me to the constructor with int parameter in the Car class
        System.out.println("Car constructor 1");
    }
    public Car(int a){
        super(8);//it takes me to the constructor with int parameter in the Vehicle class
        System.out.println("Car constructor 2 "+ a);
    }
}
