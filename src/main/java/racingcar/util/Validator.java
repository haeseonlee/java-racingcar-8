package racingcar.util;

public class Validator {

    private static final int MIN_TRY_NUMBER = 1;

    public static void validateEmptyInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_INPUT.getMessage());
        }
    }

    public static void validateMoreThanOne(int tryNumber) {
        if (tryNumber < MIN_TRY_NUMBER) {
            throw new IllegalArgumentException(ErrorMessage.TRY_NUMBER_TOO_SMALL.getMessage());
        }
    }
}
