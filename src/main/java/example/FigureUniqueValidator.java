package example;

import java.util.HashSet;
import java.util.Set;

public class FigureUniqueValidator implements Validator {
    @Override
    public boolean isValid(String number) {
        if (number.length() != 4) return false;
        Set<Character> digitSet = new HashSet<>();
        for (Character digit : number.toCharArray()) {
            digitSet.add(digit);
        }
        return digitSet.size() == 4;
    }

}
