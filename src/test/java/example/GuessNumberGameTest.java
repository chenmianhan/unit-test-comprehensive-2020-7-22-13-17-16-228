package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_answer_is_1234_when_given_1234() {
        //given
        String guess = "1234";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("4A0B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_when_given_1243() {
        //given
        String guess = "1243";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("2A2B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_0A0B_when_answer_is_1234_when_given_5678() {
        //given
        String guess = "5678";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("0A0B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_0A4B_when_answer_is_1234_when_given_4321() {
        //given
        String guess = "4321";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("0A4B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_1A1B_when_answer_is_1234_when_given_1025() {
        //given
        String guess = "1025";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("1A1B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_0A2B_when_answer_is_1234_when_given_2107() {
        //given
        String guess = "2107";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("0A2B", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_wrong_input_input_again_when_answer_is_1234_when_given_1123() {
        //given
        String guess = "1123";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("Wrong Input,Input again", guessNumberGame.guess(guess));
    }

    @Test
    void should_return_wrong_input_input_again_when_answer_is_1234_when_given_12() {
        //given
        String guess = "12";

        //when
        AnswerGenerator mockAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(mockAnswerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockAnswerGenerator);

        //then
        assertEquals("Wrong Input,Input again", guessNumberGame.guess(guess));
    }


}
