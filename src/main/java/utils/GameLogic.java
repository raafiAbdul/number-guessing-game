package utils;

import java.util.*;

public class GameLogic {

    private static final Scanner input = new Scanner(System.in);

    public static int intify(String string) throws NumberFormatException {
        String firstWord = string.split("\s")[0].toLowerCase();
        return Integer.parseInt(firstWord);
    }

    static int chooseDifficultyLogic() {
        int difficulty = intify(input.nextLine());
        while(difficulty < 0 && difficulty > 3) {
            difficulty = input.nextInt();
        }
        return difficulty;
    }

    public static void gameLoop() {
        boolean exit = false;
        while(!exit) {
            int difficulty = PrintOutput.chooseDifficulty();
            switch(difficulty) {
                case 1: {

                }
            }
        }
    }


}
