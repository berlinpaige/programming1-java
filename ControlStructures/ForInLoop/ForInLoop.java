import java.util.*;

public class ForInLoop {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        int temp;
        int sum;

        System.out.println("Enter a positive integer");
        //Enter a positive integer

        num = console.nextInt();

        temp = num;

        sum = 0;

        do
        {
            sum = sum + num % 10;

            num = num / 10;
        }
        while (num > 0);

        System.out.println("The sum of the digits = " + sum);
        //prints out: The sum of the digits = 36
    }
}

/* 
    Notes on for in loops:
    
*/