package day23constructorsaccessmodifiers;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        System.out.println(car1.model);//null

        Car car2=new Car("Toyota",2021);
        System.out.println(car2.make);//Toyota
        System.out.println(car2.year);//2021
        System.out.println(car2.price);//0

        Car car3=new Car("Honda","CRW",2023,35000);
        System.out.println(car3.make);
        System.out.println(car3.model);
        System.out.println(car3.year);
        System.out.println(car3.price);



    }
}
