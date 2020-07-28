package example;

import java.util.Scanner;

public class Main {

    private static final String RIGHT_GUESS_RESULT = "4A0B";
    private static final String GAME_START = "Game Start!";
    private static final String GAME_OVER = "Game Over!";
    private static final int NUMBER_LENGTH = 4;

    public static void main(String[]args){
        GuessNumberGame guessNumberGame=new GuessNumberGame(new RandomAnswerGenerator());
        System.out.println(GAME_START);
        int maxTimes = 6, time = 0;
        while (time < maxTimes) {
            Scanner guessScanner = new Scanner(System.in);
            StringBuilder guess= new StringBuilder();
            //TODO i
            for (int i = 0; i < NUMBER_LENGTH; i++) {
                guess.append(guessScanner.nextInt());
            }
            String guessResult = guessNumberGame.guess(guess.toString());
            System.out.println(guessResult);
            time++;
            if (guessResult.equals(RIGHT_GUESS_RESULT)) break;
        }
        if (time == maxTimes) System.out.println(GAME_OVER);

    }
}
