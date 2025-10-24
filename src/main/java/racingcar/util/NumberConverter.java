package racingcar.util;

public class NumberConverter {

    public static int convert(String input) {
        try {
            requireTryNumberInput(input);
            int tryNumber = Integer.parseInt(input);
            requireTryNumberAtLeastOne(tryNumber);
            return tryNumber;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMERIC_INPUT.getMessage());
        }
    }

    private static void requireTryNumberInput(String input) {
        Validator.validateNotEmptyInput(input);
    }

    private static void requireTryNumberAtLeastOne(int tryNumber) {
        Validator.validateMoreThanOne(tryNumber);
    }
}
