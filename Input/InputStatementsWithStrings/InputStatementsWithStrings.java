import java.util.*;

public class InputStatementsWithStrings {

  static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {

    String firstName;
    String lastName;

    int age;
    double weight;

    System.out.println("Enter first name, last name, age, and weight separated by spaces.");
    //prints out Enter first name, last name, age, and weight separated by spaces.

    firstName = console.next();
    lastName = console.next();
    age = console.nextInt();
    weight = console.nextDouble();
    //assuming we enter Berlin, Sohn, 26, and 130.0

    System.out.println("Name: " + firstName + " " + lastName);
    //prints out Name: Berlin Sohn


    System.out.println("Age: " + age);
    //prints out Age = 7

    System.out.println("Weight: " + weight);
    //prints out Weight = 7

  }
}

/* 
    Notes on Input statements with strings:    
*/