package day03wrapperclasstypecastingmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(multi(56,23,38));
        System.out.println("Perimeter Of Rectangle : "+perimeterOfRectangle(12,34));
        System.out.println("SurfaceAreaOfARectangularPrism : "+getSurfaceAreaOfARectangularPrism(7.2,6.3,8.5));
        getName("Ahmet");
    }
    //once you assign the values for the given parameters in the method parenthesis these are called "arguments"
    public static int add(int a,int b){
        return a+b;
    }
    //Example 1: Create a method multiplies 3 integers
    public static int multi(int a, int b, int c){
        return a*b*c;
    }
    //Example 2: Create a method that calculates the perimeter of a rectangle

    public static int perimeterOfRectangle(int a,int b){
        return 2*(a*b);
    }
    //Example 3: Create a method that calculates the surface area of a rectangular prism.
    public static double getSurfaceAreaOfARectangularPrism(double a,double b,double c){
        return 2*(b*c+a*c+a*b);
    }
    //Example 4: Create a method that prints the given name on the console with a "!" at the end
    public static void getName(String name){
        System.out.println(name+"!");
    }

}
