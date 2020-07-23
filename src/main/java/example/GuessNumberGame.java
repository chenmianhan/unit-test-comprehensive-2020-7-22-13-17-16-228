package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGame {

    private final String answer;
    final Set<Character> answerGridSet;
    char[] answerCharArray;

    public GuessNumberGame(String answer) {
        this.answer = answer;
        answerGridSet = new HashSet<>();
        answerCharArray = answer.toCharArray();
        for (char c : answerCharArray) {
            answerGridSet.add(c);
        }
    }

    public String guess(String guess) {

        if (guess.equals(answer)) return "4A0B";
        int rightNumberNum = 0;
        int rightPositionNum = 0;
        char[] guessCharArray = guess.toCharArray();
        for (int i = 0; i < guessCharArray.length; i++) {
            if (answerGridSet.contains(guessCharArray[i]))
                rightNumberNum++;
            if (answerCharArray[i] == guessCharArray[i]) rightPositionNum++;
        }
        if (rightNumberNum == 0) return "0A0B";
        if (rightNumberNum == 4 && rightPositionNum == 0) return "0A4B";
        return String.format("%sA%sB", rightPositionNum, rightNumberNum - rightPositionNum);

    }
}
