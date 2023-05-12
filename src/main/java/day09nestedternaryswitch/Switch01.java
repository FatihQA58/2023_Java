package day09nestedternaryswitch;

public class Switch01 {
    public static void main(String[] args) {
        //Example 1: Type code to display day numbers for the day names
        //           Sunday==>1, Monday==>2, ... ,Saturday==>7, Tom==>Invalid day name

        //1.Way: Use if-else-if
        String dayName = "MonDaY";
        if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Dinsdag")) {
            System.out.println(2);

        } else if (dayName.equalsIgnoreCase("Woenssdag")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Donderdag")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Vrijdag")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Zaterdag")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Zoondag")) {
            System.out.println(7);
        }else {
            System.out.println("Invalid dayNames");
        }

        //2.WAY

        switch (dayName.toUpperCase()){
            case "MONDAY":
                System.out.println(1);
                break;
            case "DINSDAG":
                System.out.println(2);
                break;
            case "WOENSDAG":
                System.out.println(3);
                break;
            case "DONDERDAG":
                System.out.println(4);
                break;
            case "VRIJDAG":
                System.out.println(5);
                break;
            case "ZATERDAG":
                System.out.println(6);
                break;
            case "ZOONDAG":
                System.out.println(7);
                break;
            default:
                System.out.println("Please enter a dayName");
        }


    }
}
