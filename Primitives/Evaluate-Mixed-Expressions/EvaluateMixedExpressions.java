public class EvaluateMixedExpressions {
   public static void main(String[] args) {
      System.out.println("3 / 2 + 5.0 = " + (3 / 2 + 5.0));   
      //prints out 3 / 2 + 5.0 = 6.0

      System.out.println("15.6 / 2 + 5 = " + (15.6 / 2 + 5)); 
      //prints out 15.6 / 2 + 5 = 12.8

      System.out.println("4 + 5 / 2.0 = " + (4 + 5 / 2.0)); 
      //prints out 4 + 5 / 2.0 = 6.5

      System.out.println("4 * 3 + 7 / 5 - 25.5 = " + (4 * 3 + 7 / 5 - 25.5)); 
      //prints out 4 * 3 + 7 / 5 - 25.5 = -12.5
   }
}

/* 
    Notes on Mixed Expressions:
    - if operator has both a floating point and integral operand, the integer is treated as 
   a floating point number, and the calculation will result in a floating point number
    - the entire expression is evaluated using precedence rules
*/