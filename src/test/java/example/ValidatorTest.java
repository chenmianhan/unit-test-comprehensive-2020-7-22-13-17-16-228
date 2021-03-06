package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ValidatorTest {
    @Test
    void should_return_false_when_figure_not_equal_4_given_11() {
        //given
        String number = "11";
        Validator figureUniqueValidator = new FigureUniqueValidator();

        //when
        boolean checkResult = figureUniqueValidator.isValid(number);

        //then
        assertFalse(checkResult);
    }

    @Test
    void should_return_false_when_digit_is_not_unique_given_1123() {
        //given
        String number = "1123";
        Validator figureUniqueValidator = new FigureUniqueValidator();

        //when
        boolean checkResult = figureUniqueValidator.isValid(number);

        //then
        assertFalse(checkResult);
    }

    @Test
    void should_return_true_when_right_format_given_1234() {
        //given
        String number = "1234";
        Validator figureUniqueValidator = new FigureUniqueValidator();

        //when
        boolean checkResult = figureUniqueValidator.isValid(number);

        //then
        assertTrue(checkResult);
    }
}
