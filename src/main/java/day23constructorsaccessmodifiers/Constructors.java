package day23constructorsaccessmodifiers;

public class Constructors {

        /*
        1)Constructors are for creating object from a class
        2)Java puts constructor behind every class as default, it is invisible and called as "default constructor"
          "Default Constructors" are like "public Constructors(){ }"
          If you type any constructor manually, Java removes default constructor.
        3)If you want you can create your own constructors
        4)Methods have "return type" but Constructors do not have
          Methods can use any name, Constructors must use Class name as name
    */
    public String stdntName="Tom";
    public int stdntAge=23;
    public boolean isSuccessful=true;
    //To create a constructor i)Use access modifier ii)Use class name as Constructor name iii)Put constructor body
    public Constructors(){

    }
    //Create constructor with parameters
    public Constructors(String stdntName,int stdntAge,boolean isSuccessful){
        this.stdntName=stdntName;
        this.stdntAge=stdntAge;
        this.isSuccessful=isSuccessful;

    }
    }

