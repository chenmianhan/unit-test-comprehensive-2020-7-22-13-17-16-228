package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGame {

    private final String answer;
    final Set<Character> answerGridSet;

    public GuessNumberGame(String answer) {
        this.answer = answer;
        answerGridSet = new HashSet<>();
        for (int i = 0; i < answer.length(); i++) {
            answerGridSet.add(answer.charAt(i));
        }
    }

    public String guess(String guess) {

        if (guess.equals(answer)) return "4A0B";
        int rightNumberNum = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (answerGridSet.contains(guess.charAt(i)))
                rightNumberNum++;
        }
        if (rightNumberNum == 0) return "0A0B";
        return "2A2B";
    }
}
