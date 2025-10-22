package racingcar.util;

public class Validator {

    private static void validateEmptyInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_INPUT.getMessage());
        }
    }
}
