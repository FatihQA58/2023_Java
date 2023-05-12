package smallStudyGroep_SSG;

public class DataTypes {
    public static void main(String[] args) {
        int myNum=5; //Integer(Whole number)
        float myFloatNum=5.99f;//floating point number
        char myLetter='F';//Character
        String myText="Hello";//String

        byte age=25;
        System.out.println(age);

        Integer age2=54;
        byte newAge=age2.byteValue();//Wrapper classes have a lot of useful methods but primitives not.
        System.out.println(newAge);

        int id=5436;
        //Long newID=id;----->it will complain because int and long are not compatible
        Integer newId=id;//-->it will not complain because int and long are compatible
        System.out.println(newId);


    }
}
