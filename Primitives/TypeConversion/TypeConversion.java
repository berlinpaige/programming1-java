public class TypeConversion {
   public static void main(String[] args) {
      System.out.println("(int) (7.9) = " + (int)(7.9));
      //prints out (int) (7.9) = 7

      System.out.println("(int) (3.3) = " + (int)(3.3));
      //prints out (int) (3.3) = 3

      System.out.println("(double) (25) = " + (double)(25));
      //prints out (double) (25) = 25.0

      System.out.println("(double) (5 + 3) = " + (double)(5 + 3));
      //prints out (double) (5 + 3) = 8.0

      System.out.println("(double) (15) / 2 = " + (double)(15) / 2);
      //prints out (double) (15) / 2 = 7.5

      System.out.println("(double) (15 / 2) = " + (double)(15 / 2));
      //prints out (double) (15 / 2) = 7.0

      System.out.println("(int) (7.8 + (double) (15) / 2) = " + (int) (7.8 + (double) (15) / 2));
      //prints out (int) (7.8 + (double) (15) / 2) = 15

      System.out.println("(int) (7.8 + (double) (15 / 2)) = " + (int) (7.8 + (double) (15 / 2)));
      //prints out (int) (7.8 + (double) (15 / 2)) = 14
   }
}

/* 
    Notes on Type Conversion:
    - using type conversion avoids implicit type coercion erroneous results
    - First the expression is evaluated, then its value is treated as the value type specified
    - you can also use cast operators to treat char values as int values and visa versa
*/