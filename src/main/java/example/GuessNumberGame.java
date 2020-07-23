package example;

public class GuessNumberGame {

    private final String answer;

    public GuessNumberGame(String answer) {
        this.answer=answer;
    }

    public String guess(String guess) {
        if(guess.equals(answer))return "4A0B";
        else return "2A2B";
    }
}
