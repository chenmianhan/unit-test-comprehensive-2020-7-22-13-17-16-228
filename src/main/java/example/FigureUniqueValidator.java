package example;

import java.util.HashSet;
import java.util.Set;

public class FigureUniqueValidator implements Validator {

    private static final int VALIDATE_NUMBER_LENGTH = 4;

    @Override
    public boolean isValid(String number) {
        if (number.length() != VALIDATE_NUMBER_LENGTH) return false;
        Set<Character> digitSet = new HashSet<>();
        for (Character digit : number.toCharArray()) {
            digitSet.add(digit);
        }
        return digitSet.size() == VALIDATE_NUMBER_LENGTH;
    }

}
