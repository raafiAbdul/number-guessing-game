package utils;

import java.util.*;

public class GameLogic {

    private static final Scanner input = new Scanner(System.in);

    public static int chooseDifficultyLogic() {
        return input.nextInt();
    }

    public static void gameLoop() {
        boolean exit = false;
        while(!exit) {
            PrintOutput.chooseDifficulty();

        }
    }


}
