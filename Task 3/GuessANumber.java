import java.util.Random;
import java.util.Scanner;

public class GuessANumber{
    private static int rnd_number;

    public static void main(String[] args){
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");

        makeAGuess();
    }

    private static void makeAGuess(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a number:");

        if(scanner1.hasNextInt()){ //decided to change it to hasNextInt instead of hasNextDouble because otherwise I would have to convert it to int anyways when comparing
            int guess = scanner1.nextInt();

            if(guess == rnd_number){
                System.out.println("Congratulations! You guessed the correct number: " + rnd_number);
				
            }
			
			else if(guess < rnd_number){
                System.out.println("Your guess is too low. Try again.");
                makeAGuess();
            }
			
			else{
                System.out.println("Your guess is too high. Try again.");
                makeAGuess();
				
				
            }
        }else{ // if the input isn't valid for "hasNextInt()" which means it's not a number that has been typed:
            System.out.println("Invalid input! Please enter a valid number.");
            makeAGuess();
        }
    }
	
	
}

		// Create a Scanner object   	 
        // use hasNextDouble to check if input is numeric, 
        // if so...
	// Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively