import java.util.*;

public class InputStatements {

  static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {

    int feet;
    int inches;

    System.out.println("Enter two integers separated by spaces.");
    //prints out Enter two integers separated by spaces.

    feet = console.nextInt();
    inches = console.nextInt();
    //assuming we enter 23 and 7

    System.out.println("feet = " + feet);
    //prints out The feet = 23


    System.out.println("inches = " + inches);
    //prints out  inches = 7

  }
}

/* 
    Notes on InputStatements:
    - Using the scanner class, we first create an input stream object an associate it with 
        the standard input device: static Scanner console = new Scanner(System.in);
    - If the input can be interpretted as an int, nextInt() retrieves that int
    - You can use nextDouble() for doubles and next() for strings and nextLine() to read 
        strings until the end of the line.
    - While scanning for the next input, the expressions (except nextLine) skip whitespace characters
    - If the input can ot be expressed as an appropriate value, the program will terminate with an error message
    
*/