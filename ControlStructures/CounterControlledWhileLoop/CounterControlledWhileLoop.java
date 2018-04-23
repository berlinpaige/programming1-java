import java.util.*;

public class CounterControlledWhileLoop {

    static Scanner console = new Scanner(System.in);  

        public static void main(String[] args) {

        int limit;
        int number;
        int sum;
        int counter;

        System.out.println("Enter the number of integers in the list");
        //prints out Enter the number of integers in the list

        limit = console.nextInt();
        System.out.println();
        //prints out 12

        sum = 0;
        counter = 0;
        System.out.println("Enter " + limit + " integers");
        //prints out Enter 12 integers

        while (counter < limit) 
        {
            number = console.nextInt();
            sum = sum + number;
            counter++;

        }

        System.out.printf("The sum of the %d numbers = %d%n", limit, sum);

        //prints out: The sum of the 12 numbers = 335

        if (counter != 0)
            System.out.printf("The average = %d%n", (sum/counter));
            //prints out: The average of the 12 numbers = 27
        else
            System.out.println("No input");
            //prints out No input
    }
}

/* 
    Notes on counter controlled while loops:
    
*/