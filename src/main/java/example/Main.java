package example;

import java.util.Scanner;

public class Main {

    private static final String RIGHT_GUESS_RESULT = "4A0B";

    public static void main(String[]args){
        GuessNumberGame guessNumberGame=new GuessNumberGame(new RandomAnswerGenerator());
        System.out.println("Game Start!");
        int maxTimes = 6, curTime = 0;
        while (curTime < maxTimes) {
            Scanner guessScanner = new Scanner(System.in);
            StringBuilder guess= new StringBuilder();
            for (int i = 0; i <4 ; i++) {
                guess.append(guessScanner.nextInt());
            }
            String guessResult = guessNumberGame.guess(guess.toString());
            System.out.println(guessResult);
            curTime++;
            if (guessResult.equals(RIGHT_GUESS_RESULT)) break;
        }
        if (curTime == maxTimes) System.out.println("Game Over!");

    }
}
