package day28interfacescollections;

public interface Break extends Details {

    int price();
    int volume=7;
    int weight();
    static void secure(){
        System.out.println("Breaks work securely");
    }

}
