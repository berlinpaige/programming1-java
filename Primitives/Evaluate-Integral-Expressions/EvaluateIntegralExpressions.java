public class EvaluateIntegralExpressions {
   public static void main(String[] args) {
      System.out.println("2 + 5 = " + (2+5));   //prints out 2 + 5 = 7
      System.out.println("13 + 89 = " + (13+89)); //prints out 13 + 89 = 102
      System.out.println("34 - 20 = " + (34-20)); //prints out 34 - 20 = 14
      System.out.println("45 - 90 = " + (45-90)); //prints out 45 - 90 = -45
      System.out.println("2 * 7 = " + (2*7)); //prints out 2 * 7 = 14
      System.out.println("5 / 2 = " + (5/2)); //prints out 5 / 2 = 2
      System.out.println("14 / 7 = " + (14/7)); //prints out 14 / 7 = 2
      System.out.println("34 % 5 = " + (34%5)); //prints out 34 % 5 = 4
      System.out.println("4 % 6 = " + (4%6)); //prints out 4 % 6 = 4
   }
}

/* 
    Notes on Integral Expressions:
    - division of two integrals produces the quotient omitting the remainder
    - be careful using the mod operator with negative quotients, can give erroneous results
*/