package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGame {

    private static final String WRONG_INPUT_OUTPUT = "Wrong Input,Input again";
    private final Set<Character> answerDigitSet;
    private final FigureUniqueValidator figureUniqueValidator=new FigureUniqueValidator();
    //TODO warning

    private final char[] answerCharArray;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        String answer = answerGenerator.generate();
        answerDigitSet = new HashSet<>();
        answerCharArray = answer.toCharArray();
        //TODO c
        for (char c : answerCharArray) {
            answerDigitSet.add(c);
        }
    }

    public String guess(String guess) {
        if (!figureUniqueValidator.isValid(guess)) return WRONG_INPUT_OUTPUT;
//TODO else
        else return generateOutput(guess);

    }

    private String generateOutput(String guess) {
        //TODO NAMING
        int rightNumberNum = 0;
        int rightPositionNum = 0;
        char[] guessCharArray = guess.toCharArray();
        //TODO i
        for (int i = 0; i < guessCharArray.length; i++) {
            if (answerDigitSet.contains(guessCharArray[i])) rightNumberNum++;
            if (answerCharArray[i] == guessCharArray[i]) rightPositionNum++;
        }
        return String.format("%sA%sB", rightPositionNum, rightNumberNum - rightPositionNum);
    }


}
