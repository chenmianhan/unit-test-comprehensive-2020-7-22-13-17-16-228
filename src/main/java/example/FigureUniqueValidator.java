package example;

public class FigureUniqueValidator implements Validator {
    @Override
    public boolean isValid(String number) {
        return number.length() == 4;
    }
}
