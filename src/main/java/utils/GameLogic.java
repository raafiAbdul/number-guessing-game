package utils;

import java.util.*;

public class GameLogic {

    private static final Scanner input = new Scanner(System.in);
    private static int highscore = 100;

    // this converts any kinda string into a number
    static int intify(String string) throws NumberFormatException {
        String firstWord = string.split("\s")[0].toLowerCase();
        return Integer.parseInt(firstWord);
    }

    // this takes in user input and repeatedly checks if its intify()-able
    // and loops until user input is valid
    static int checkIfValid(int upperBound, String item) {
        boolean acceptable = false;
        int guess = 0;
        while(!acceptable) {
            try {
                guess = intify(input.nextLine());
                if(guess > 0 && guess < upperBound)
                    acceptable = true;
                else
                    System.out.print("Please enter a valid " + item + ": ");
            } catch (NumberFormatException _) {System.out.print("Please enter a valid " + item + ": ");}
        }
        return guess;
    }

    // this accepts user input and returns difficulty level
    static int chooseDifficultyLogic() {
        return checkIfValid(4, "option");
    }

    // this is the main loop of the game
    public static void gameLoop() {
        boolean exit = false;
        while(!exit) {
            PrintOutput.printWelcomeMessage();
            int chances = PrintOutput.chooseDifficulty();
            int randomNum = (int)(Math.random()*99) + 1;
            int guessInt;
            boolean isWon = false;
            for(int attempts = 1; attempts <= chances; attempts++) {
                System.out.println(randomNum);
                System.out.print("Enter your guess: ");
                guessInt = checkIfValid(101, "guess");
                if(guessInt == randomNum) {
                    PrintOutput.guessOutput(true, attempts, guessInt, randomNum);
                    if(attempts < highscore)
                        highscore = attempts;
                    isWon = true;
                    break;
                }
                else PrintOutput.guessOutput(false, attempts, guessInt, randomNum);
            }

            if(!isWon) {
                System.out.println("You've ran out of guesses");
            }

            if(highscore != 100 && isWon) {
                System.out.println("New high score: " + highscore + "!");
            }

            char playAgainChar;
            do {
                System.out.print("Do you want to play again (y/N): ");
                playAgainChar = input.nextLine().toLowerCase().charAt(0);
            } while(playAgainChar != 'y' && playAgainChar != 'n');

            if(playAgainChar == 'n') {
                exit = true;
            }

            System.out.println();

        }
        System.out.println("Thanks for playing!");
    }


}
