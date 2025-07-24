import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int NumberToGuess = rand.nextInt(101); 
        int UserGuess = -1;
        int Attempts = 0;
        final int MaxAttempts = 7;
    
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Select a number between 1 to 101.... Try to guess it!");
        
        while(UserGuess != NumberToGuess && Attempts<MaxAttempts) {

            System.out.print("Enter your guess: ");
            UserGuess = sc.nextInt();
            Attempts++;
            
            if(UserGuess < NumberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } 
            else if(UserGuess > NumberToGuess) {
                System.out.println("Too high! Try a lower number.");
            }

            if (UserGuess != NumberToGuess && Attempts == MaxAttempts) {
                System.out.println("........Game Over........");
                System.out.println("The correct number is: " + NumberToGuess);
                break;
            }
        }

        if(UserGuess == NumberToGuess) {
            System.out.println("Congratulations! You've guessed the correct number " + NumberToGuess + " in " + Attempts + " attempts!");
        }
        sc.close();
    }
}   
