package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    @Test
    void intifyThrows() {
        assertThrows(NumberFormatException.class, () -> {
            GameLogic.intify("this throws");
        });
    }

    @Test
    void intifyDoesntThrow() {
        assertEquals(4, GameLogic.intify("4"));
    }

}