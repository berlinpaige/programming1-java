import java.util.*;
import java.io.*;

public class InputFromFile {
  public static void main(String[] args) throws FileNotFoundException {

    Scanner inFile = new Scanner(new FileReader("./data.txt"));

    String firstName;
    String lastName;

    double hoursWorked;
    double payRate;
    double wages;

    firstName = inFile.next();
    lastName = inFile.next();

    hoursWorked = inFile.nextDouble();
    payRate = inFile.nextDouble();

    wages = hoursWorked * payRate;

    inFile.close();

    System.out.println("firstName = " + firstName);
    //prints out The firstName = Emily
    
    System.out.println("lastName = " + lastName);
    //prints out The lastName = Johnson

    System.out.println("wages = " + wages);
    //prints out The wages = 607.5

  }
}

/* 
    Notes on input from a file:
    
*/