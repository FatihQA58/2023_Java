package day24inheritance;

public class Civic extends Honda {
    public int age=4;

    public void move() {
        System.out.println("Civic moves...");
    }
    /*
    public Civic(){
        System.out.println("this.age = " + this.age);
        System.out.println("super.age = " + super.age);
        this.move(); //Civics move
        super.move();//Hondas move
    }
*/
    public Civic(){
        super();
        System.out.println("Civic constructor01");
    }
    public Civic(int a){
        super(6);//it takes me to the constructor with int parameter in Honda class
        System.out.println("Civic constructor 2"+a);
    }
}
