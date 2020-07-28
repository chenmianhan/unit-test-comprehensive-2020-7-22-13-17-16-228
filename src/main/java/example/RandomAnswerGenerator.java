package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomAnswerGenerator implements AnswerGenerator {

    private static final int NUMBER_LENGTH = 4;

    @Override
    public String generate() {
        //TODO NAMING
        StringBuilder result= new StringBuilder();
        List<Integer> numberS=new ArrayList<>(10);
        //TODO i,10
        for (int i = 0; i <10 ; i++) {
            numberS.add(i);
        }
       Collections.shuffle(numberS);
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            result.append(numberS.get(i));
        }
        return result.toString();
    }
}
