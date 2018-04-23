public class PredefinedMethods {

  public static void main(String[] args) {

    double u, v;
    int inches;

    System.out.println("2 to the power of 6 = " + Math.pow(2, 6));
    //prints out 2 to the power of 6 = 64.0

    u = 12.5;
    v = 3.0;

    System.out.println(u + " to the power of " + v + " = " + Math.pow(u, v));
    //prints out 12.5 to the power of 3.0 = 1953.125

    System.out.println("The square root of 42.25 = " + Math.sqrt(42.25));
    //prints out 2 to The square root of 42.25 = 6.5

    u = Math.pow(8.5, 2.0);

    System.out.println("The square root of " + u + " = " + Math.sqrt(u));
    //prints out 2 to The square root of 72.25 = 8.5
  }
}

/* 
    Notes on predefined methods:
    - Math is contained in the package java.lang, therefore no 
        explicitly stated imports are needed
    - Every method in the calss Math is a static method, 
        so you can use every method using the name of the class, Math    
*/