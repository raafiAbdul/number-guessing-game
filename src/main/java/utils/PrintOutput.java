package utils;

public class PrintOutput {
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have 3-10 chances (depending on the difficulty)\nto guess the correct number");

        System.out.println("\nPlease select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
    }

    static int chooseDifficulty() {
        System.out.print("Enter your difficulty of choice: ");
        String difficultyString = "";
        int level = GameLogic.chooseDifficultyLogic();
        int chances = 10;
        switch(level) {
            case 1 -> {
                difficultyString = "Easy";
                chances = 10;
            }
            case 2 -> {
                difficultyString = "Medium";
                chances = 5;
            }
            case 3 -> {
                difficultyString = "Hard";
                chances = 3;
            }
        }
        System.out.println("Great! You have selected the " + difficultyString + " difficulty level.");
        System.out.println("Let's start the game!");
        return chances;
    }

    static void guessOutput(boolean isCorrect, int attempts, int guess, int randomNum) {
        if(isCorrect)
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        else if(randomNum > guess) {
            System.out.println("Incorrect! The number is greater than " + guess + ".");
        } else if(randomNum < guess){
            System.out.println("Incorrect! The number is less than " + guess + ".");
        }
    }

}
