package day26encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student student01=new Student();
        System.out.println(student01.getStudentId());//TH102HL

        student01.setStudentId("AB2023NL");
        System.out.println(student01.getStudentId());//AB2023NL

        Student student02=new Student();
        System.out.println(student02.getStudentId());//TH102HL


    }
}
