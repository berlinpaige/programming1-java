import java.util.*;

public class SentinelControlledWhileLoop {

    static Scanner console = new Scanner(System.in);

    static final int SENTINEL = -999;

    public static void main(String[] args) {

        int number;
        int sum = 0;
        int counter = 0;

        System.out.println("Enter positive integers ending with " + SENTINEL);
        //prints out Enter positive integers ending with -999

        number = console.nextInt();

        while (number != SENTINEL) 
        {
            sum = sum + number;
            counter++;
            number = console.nextInt();
        }

        System.out.printf("The sum of the %d numbers = %d%n", counter, sum);

        //prints out: The sum of the 10 numbers = 282

        if (counter != 0)
            System.out.printf("The average = %d%n", (sum/counter));
            //prints out: The average of the 10 numbers = 28
        else
            System.out.println("No input");
            //prints out No input
    }
}

/* 
    Notes on sentinel controlled while loops:
    
*/