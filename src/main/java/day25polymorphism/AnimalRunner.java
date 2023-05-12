package day25polymorphism;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        System.out.println(cat.move());
    }
}
