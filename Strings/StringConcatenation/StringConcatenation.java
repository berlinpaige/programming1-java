public class StringConcatenation {
   public static void main(String[] args) {
      System.out.println("The sum = " + 12 + 26);
      //prints out The sum = 1226

      System.out.println("The sum = " + (12 + 26));
      //prints out The sum = 38

      System.out.println(12 + 26 + " is the sum.");
      //prints out 38 is the sum.

      System.out.println("The sum of " + 12 + " and " + 26 + " = " + (12 + 26));
      //prints out The sum of 12 and 26 = 38
   }
}

/* 
    Notes on String concatenation:
    - associativity of the + operator is from left to right, so numbers after the operator
      are treated as strings
*/