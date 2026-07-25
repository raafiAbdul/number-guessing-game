package utils;

import java.util.*;

public class GameLogic {

    private static final Scanner input = new Scanner(System.in);

    static int intify(String string) throws NumberFormatException {
        String firstWord = string.split("\s")[0].toLowerCase();
        return Integer.parseInt(firstWord);
    }

    static int chooseDifficultyLogic() {
        int difficulty = 1;
        boolean acceptable = false;
        while(!acceptable) {
            try {
                difficulty = intify(input.nextLine());
                if(difficulty > 0 && difficulty < 4)
                    acceptable = true;
                else
                    System.out.println("Please choose valid option");
            } catch (NumberFormatException _) {System.out.println("Please choose valid option");}
        }
        return difficulty;
    }

    public static void gameLoop() {
        boolean exit = false;
        while(!exit) {
            PrintOutput.chooseDifficulty();

        }
    }


}
