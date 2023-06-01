/*
* Guessing Game*
* An umber guessing game where the computer generates a random number
* and the player has to guess it. Provides feedback to the player indicating
* whether their guess is too high or too low, and keep track of the number of
* attempts until they guess the correct number.
*
*/


package GuessingGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int randomNumber = randomNumberGenerator();
        int attempts = 0;
        int guess = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tGuessing Game");
        System.out.println("Guess a number between 0 to 100");

        do{
            try{
                System.out.print("Number (0-100): ");
                guess = input.nextInt();
                if(guess<0 || guess >100) throw new InputMismatchException();
                else if(guess>randomNumber) System.out.println("Your guess is too high");
                else if(guess<randomNumber) System.out.println("Your guess is too low");
                else if(guess==randomNumber) {
                    System.out.println("The number is " + randomNumber + ", You guessed the correct Number after "
                            + attempts + " attempt/s.");
                }
                attempts++;
            }catch(InputMismatchException exc){
                System.out.println("Invalid Value, Please enter a number from 0 to 100");
                input.next();
                continue;
            }
        } while (guess!=randomNumber);

    }

    public static int randomNumberGenerator(){
        Random random = new Random();
        return random.nextInt(101);
    }
}
