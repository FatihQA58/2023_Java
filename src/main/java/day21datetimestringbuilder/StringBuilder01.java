package day21datetimestringbuilder;

public class StringBuilder01 {
     /*
        1)StringBuilder is a Class creates Strings for you.
        2)Normally we create Strings by using String Class, but Java gave us another class to create String because
          String Class gives you "immutable Strings" sometimes we need "mutable Strings" which StringBuilder gives.
     */
     public static void main(String[] args) {
         //To be able to use "updated String" you have to do assignment in String Class
         String str="Apex";
         System.out.println(str);//Apex
         str=str.concat("!");
         System.out.println(str);//Apex!

         //To be able to use "updated String" no need to do assignment in StringBuilder Class
         StringBuilder strbld=new StringBuilder("Apex");
         strbld.append("!");
         System.out.println(strbld);//Apex!

         //append() method is for joining StringBuilders like concat() method in String Class
         StringBuilder sb1=new StringBuilder("Mark");
         sb1.append(" wil gaan").append("!...");
         System.out.println(sb1);

         //length() and capacity() methods
         StringBuilder sb2=new StringBuilder("Brad");
         System.out.println("sb2.length() = " + sb2.length());
         System.out.println("sb2.capacity() = " + sb2.capacity());

         StringBuilder sb3=new StringBuilder();
         System.out.println("sb3.length() = " + sb3.length());
         System.out.println("sb3.capacity() = " + sb3.capacity());

         StringBuilder sb4=new StringBuilder();
         sb4.append("Java").append("Python").append("Programming Language").append("!!!!!!!!");
         System.out.println("sb4.length() = " + sb4.length());
         System.out.println("sb4.capacity() = " + sb4.capacity());// For sb4.append("Java").append("Python").append("Programming Language") ==> 16x2 + 2 = 34
         // For sb4.append("Java").append("Python").append("Programming Language").append("!!!!!") ==> 34x2 + 2 = 70

         StringBuilder sb5=new StringBuilder("Python");
         sb5.delete(1,3);
         System.out.println("sb5 = " + sb5);//sb5 = Phon

         sb5.deleteCharAt(2);
         System.out.println("sb5 = " + sb5);//sb5 = Phn

     }
}
