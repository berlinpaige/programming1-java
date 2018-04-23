public class LogicalOperators {

  public static void main(String[] args) {

    boolean found = true;
    boolean flag = false;
    double x = 5.2;
    double y = 3.4;
    int a = 5;
    int b = 8;
    int n = 20;
    char ch = 'B';

    System.out.println("!found evaluates to " + !found);
    //prints out !found evaluates to false

    System.out.println("x > 4.0 evaluates to " + (x > 4.0));
    //prints out x > 4.0 evaluates to true

    System.out.println("!found && (x >= 0) evaluates to " + (!found && (x >= 0)));
    //prints out !found && (x >= 0) evaluates to false

    System.out.println("!(found && (x >= 0)) evaluates to " + !(found && (x >= 0)));
    //prints out !(found && (x >= 0)) evaluates to false

    System.out.println("x + y <= 20.5 evaluates to " + (x + y <= 20.5));
    //prints out x + y <= 20.5 evaluates to true

    System.out.println("(n >= 0) && (n <= 100) evaluates to " + ((n >= 0) && (n <= 100)));
    //prints out (n >= 0) && (n <= 100) evaluates to true
    
    System.out.println("('A' <= ch && ch <= 'Z') evaluates to " + (('A' <= ch && ch <= 'Z')));
    //prints out ('A' <= ch && ch <= 'Z') evaluates to true

    System.out.println("(a + 2 <= b) && !flag evaluates to " + ((a + 2 <= b) && !flag));
    //prints out (a + 2 <= b) && !flag evaluates to true
  }
}

/* 
    Notes on logical operators:
    
*/