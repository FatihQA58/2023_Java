package day31mapsexceptions;

public class Exception02 {
    public static void main(String[] args) {


        //Example 1: Create a method return any element from an array by using the index of the element
    }
    public static String getElementFromArray(String []arr,int indx){
        try{
            return arr[indx];
        }catch (ArrayIndexOutOfBoundsException e){
           return arr[arr.length-1];
        }
    }
}
