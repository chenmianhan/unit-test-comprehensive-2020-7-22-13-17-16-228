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
        //TODO CurTime
        int maxTimes = 6, curTime = 0;
        while (curTime < maxTimes) {
            Scanner guessScanner = new Scanner(System.in);
            StringBuilder guess= new StringBuilder();
            //TODO i
            for (int i = 0; i < NUMBER_LENGTH; i++) {
                guess.append(guessScanner.nextInt());
            }
            String guessResult = guessNumberGame.guess(guess.toString());
            System.out.println(guessResult);
            curTime++;
            if (guessResult.equals(RIGHT_GUESS_RESULT)) break;
        }
        if (curTime == maxTimes) System.out.println(GAME_OVER);

    }
}
