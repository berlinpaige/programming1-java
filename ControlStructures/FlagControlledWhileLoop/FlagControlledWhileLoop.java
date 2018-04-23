import java.util.*;

public class FlagControlledWhileLoop {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int number;
        int guess;
        boolean done;

        number = (int) (Math.random() * 50);
        done = false;

        while (!done) 
        {
            System.out.println("Enter an integer greater than or equal to zero and less than 50");
            //prints out Enter an integer greater than or equal to zero and less than 50

            guess = console.nextInt();

            if (guess == number) 
            {
                System.out.println("You guessed the correct number");
                //prints out "you guessed the correct number"
                done = true;
            }
            else if (guess < number)
                System.out.println("Your guess is lower than the number, guess again");
                //Your guess is lower than the number, guess again"
            else
                System.out.println("Your guess is higher than the number, guess again");
                //Your guess is higher than the number, guess again"
        }
    }
}

/* 
    Notes on flag controlled while loops:
    
*/