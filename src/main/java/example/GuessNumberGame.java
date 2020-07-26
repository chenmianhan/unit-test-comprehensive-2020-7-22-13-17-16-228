package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGame {

    private final Set<Character> answerDigitSet;
    private char[] answerCharArray;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        String answer = answerGenerator.generate();
        answerDigitSet = new HashSet<>();
        answerCharArray = answer.toCharArray();
        for (char c : answerCharArray) {
            answerDigitSet.add(c);
        }
    }

    public String guess(String guess) {
        if (!checkInput(guess)) return "Wrong Input,Input again";
        else return generateOutput(guess);

    }

    private String generateOutput(String guess) {
        int rightNumberNum = 0;
        int rightPositionNum = 0;
        char[] guessCharArray = guess.toCharArray();
        for (int i = 0; i < guessCharArray.length; i++) {
            if (answerDigitSet.contains(guessCharArray[i])) rightNumberNum++;
            if (answerCharArray[i] == guessCharArray[i]) rightPositionNum++;
        }
        return String.format("%sA%sB", rightPositionNum, rightNumberNum - rightPositionNum);
    }

    private boolean checkInput(String guess) {
        if (guess.length() != 4) return false;
        Set<Character> checkSet = new HashSet<>();
        char[] guessCharArray = guess.toCharArray();
        for (char guessGrid : guessCharArray) {
            if (!checkSet.contains(guessGrid)) {
                checkSet.add(guessGrid);
            } else return false;
        }
        return true;
    }
}
