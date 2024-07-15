import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomGuess = random.nextInt(100) +1;
        int attempt = 0;
        boolean IsGuess = false;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I have selected a number between 1 to 100: Try to Guess it");

        while(!IsGuess)
        {
            System.out.print("Enter the guess : ");
            int guess = sc.nextInt();

            if(guess < randomGuess)
            {
                System.out.println("To Low! Try again");
                attempt++;
            }
            else if(guess > randomGuess)
            {
                System.out.println("To High! Try again");
                attempt++;
            }
            else {
                IsGuess= true;
            }
        }
        System.out.println("congratulation! you guess the Number " + randomGuess + " correctly.");
        System.out.println("It took you "+ attempt + " attempts to win.");
    }
}

