import java.util.Random;
import java.util.Scanner;

public class Number {
    
    public static void main(String[] args) {
        
        Random  rand = new Random(); // generate random number 

        int randomNumber = rand.nextInt(100) + 1; 

        Scanner scanner = new Scanner(System.in); //Creates Scanner object
        int tryCount = 0;
        
        System.out.println("Welcome to the game! \nI am thinking of a number between 1 and 100. \nPlease enter your guess here: ");

        while(true){
        int guessOne = scanner.nextInt(); // Read user input
        tryCount++;

        System.out.println("Your guess is " + guessOne);

        if (guessOne == randomNumber) {
            System.out.println("You guessed it!");
            System.out.println("It took you " + tryCount + " tries!");
            break;
        }     
          else if (guessOne < randomNumber) {
            System.out.println("Too low! Try again");
        } 
        else {
            System.out.println("Too high! Guess again!");
        }
        scanner.close(); // to solve resourse leak problem with scanner
    }
    }
}