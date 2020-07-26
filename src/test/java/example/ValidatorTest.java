package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;


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
}
