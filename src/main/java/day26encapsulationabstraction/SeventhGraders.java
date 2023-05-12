package day26encapsulationabstraction;

public class SeventhGraders extends Courses{
    @Override
    public void math() {
        System.out.println("Learn Square root");
    }

    @Override
    public void arth() {
        super.arth();
    }
}
