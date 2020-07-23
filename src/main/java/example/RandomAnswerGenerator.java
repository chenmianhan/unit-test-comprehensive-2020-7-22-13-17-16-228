package example;

import java.util.*;

public class RandomAnswerGenerator implements AnswerGenerator {

    @Override
    public String generate() {
        StringBuilder result= new StringBuilder();
        List<Integer> numberS=new ArrayList<>(10);
        for (int i = 0; i <10 ; i++) {
            numberS.add(i);
        }
       Collections.shuffle(numberS);
        for (int i = 0; i <4 ; i++) {
            result.append(numberS.get(i));
        }
        return result.toString();
    }
}
