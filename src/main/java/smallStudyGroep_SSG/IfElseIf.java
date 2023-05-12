package smallStudyGroep_SSG;

public class IfElseIf {
    public static void main(String[] args) {
        String day="Sunny";
        if(day.equalsIgnoreCase("sunny")){
            System.out.println("You can wear T-shirt");
        } else if (day.equalsIgnoreCase("cloudy")) {
            System.out.println("You must get an umbrella");
        }else {
            System.out.println("Not sure");
        }
    }
}
