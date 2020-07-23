package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_answer_is_1234_when_given_1234() {
        //given
        String guess = "1234";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //then
        assertEquals("4A0B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_when_given_1243() {
        String guess = "1234";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //then
        assertEquals("2A2B", guessNumberGame.guess(guess));
    }
}
