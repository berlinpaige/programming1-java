public class DecimalOutputFormatting {

  public static void main(String[] args) {

    double x = 15.674;
    double y = 235.73;
    double z = 9525.9864;

    System.out.println("The values of x, y, an z with two decimal places:");
    //prints out The values of x, y, an z with two decimal places:
    
    System.out.printf("x = %.2f %n", x);
    System.out.printf("y = %.2f %n", y);
    System.out.printf("z = %.2f %n", z);
    //prints out:
    //x = 15.67
    //y = 235.73
    //z = 9525.99

    System.out.println("The values of x, y, an z with three decimal places:");
    //prints out The values of x, y, an z with three decimal places:
    
    System.out.printf("x = %.3f %n", x);
    System.out.printf("y = %.3f %n", y);
    System.out.printf("z = %.3f %n", z);
    //prints out:
    //x = 15.674
    //y = 235.730
    //z = 9525.986

  }
}

/* 
    Notes on decimal output formatting:
    
*/