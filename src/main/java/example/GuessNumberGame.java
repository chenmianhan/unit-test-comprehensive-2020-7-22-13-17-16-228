package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGame {

    private final String answer;
    private final Set<Character> answerGridSet;
    private char[] answerCharArray;
    private int times;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
        answerGridSet = new HashSet<>();
        answerCharArray = answer.toCharArray();
        for (char c : answerCharArray) {
            answerGridSet.add(c);
        }
        times = 0;
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
            if (answerGridSet.contains(guessCharArray[i])) rightNumberNum++;
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
