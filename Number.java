import java.util.Random;
import java.util.Scanner;

public class Number {
    
    public static void main(String[] args) {
        
        Random  rand = new Random(); // generate random number 

        

        Scanner scanner = new Scanner(System.in); //Creates Scanner object
        int tryCount = 0;
        
        System.out.println("Welcome to the game!  \nPlease pick a number to choose your difficulty.");

        int chosenRange = scanner.nextInt(); // user chooses range 

        int randomNumber = rand.nextInt(chosenRange) + 1; 

        System.out.println("OK... I am now thinking of a number between 1 and " + chosenRange + ". Please now enter your guess.");

        while(true){
        int guessOne = scanner.nextInt(); // Read user input
        tryCount++;

        System.out.println("Your guess is " + guessOne);

        if (guessOne == randomNumber) {
            System.out.println("You guessed it!");
            if (tryCount == 1) {
                System.out.println("You guessed it first time! Lucky you!");
            } 
            else if (tryCount <= 10) {
                System.out.println("It took you " + tryCount + " guesses. That is acceptable.");
            } 
            else {
                System.out.println("It took you " + tryCount + " guesses. You should do better.");
            }
            break;
        }     
          else if (guessOne < randomNumber) {
            System.out.println("Too low! Try again");
        } 
        else {
            System.out.println("Too high! Guess again!");
        }
        // scanner.close(); // to solve resourse leak problem with scanner - need to investigate further. 
    }
    }
}