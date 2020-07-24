package example;

import java.util.Scanner;

public class Main {
    

    public static void main(String[]args){
        System.out.println("please input guess");
        Scanner guessScanner=new Scanner(System.in);
        GuessNumberGame guessNumberGame=new GuessNumberGame(new RandomAnswerGenerator());
        while(guessScanner.hasNext()){
            StringBuilder guess= new StringBuilder();
            for (int i = 0; i <4 ; i++) {
                guess.append(guessScanner.nextInt());
            }

            System.out.println(guessNumberGame.guess(guess.toString()));
        }


    }
}
