import java.util.*;

public class ForLoop {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int i;

        for (i = 10; i >= 1; i--)
            System.out.println(i + " ");

        //prints out: 10 9 8 7 6 5 4 3 2 1

        int newNum;
        int sum = 0;
        int j;


        for (j = 0; j < 5; j++) 
        {
            System.out.println("Type a new integer");
            //prints out Type a new integer
            newNum = console.nextInt();
            sum = sum + newNum;
        }

        System.out.println("The sum is " + sum);
        //prints out The sum is 64
    }
}

/* 
    Notes on for loops:
    
*/