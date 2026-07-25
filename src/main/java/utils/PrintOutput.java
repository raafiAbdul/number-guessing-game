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

    static void chooseDifficulty() {
        System.out.println("Enter your difficulty of choice: ");
        String difficultyString = "";
        switch(GameLogic.chooseDifficultyLogic()) {
            case 1 -> difficultyString = "Easy";
            case 2 -> difficultyString = "Medium";
            case 3 -> difficultyString = "Hard";
        }
        System.out.println("Great! You have selected the " + difficultyString + " difficulty level.");
        System.out.println("Let's start the game!");
    }

}
