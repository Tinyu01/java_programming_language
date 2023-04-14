1/**
   This example demonstrates method calls and String manupulation.
*/

public class MethodDemo
{
   public static void main(String[] args)
   {
      String greeting = "Hello, World!";

      // greeting is the argument in this call to the println method
      System.out.println(greeting); 
        
      // The length method returns a value
      int numberOfCharacters = greeting.length();
           
      System.out.print("numberOfCharacters: ");
      System.out.println(numberOfCharacters);

      // You can use the return value of one method as an argument of another method
      System.out.print("greeting.length(): ");
      System.out.println(greeting.length());

      // The replace method has two arguments
      String river = "Mississippi";
      river = river.replace("issipp", "our");
      System.out.print("river: ");
      System.out.println(river);

   }
}
