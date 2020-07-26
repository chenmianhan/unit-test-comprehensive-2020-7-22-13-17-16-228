package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnswerGeneratorTest {
    @Test
    void should_return_true_when_check_the_validity_given_the_answer_generate() {
        //given
        AnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        String answer = randomAnswerGenerator.generate();
        Validator figureUniqueValidator = new FigureUniqueValidator();

        //when
        boolean checkResult = figureUniqueValidator.isValid(answer);

        //then
        assertTrue(checkResult);
    }
}
