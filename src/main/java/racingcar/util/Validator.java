package racingcar.util;

import java.util.List;

public class Validator {

    private static final int MIN_TRY_NUMBER = 1;
    private static final int MIN_CAR_COUNT = 2;
    private static final String COMMA_DELIMITER = ",";

    public static void validateNotEmptyInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_INPUT.getMessage());
        }
    }

    public static void validateMoreThanOne(int tryNumber) {
        if (tryNumber < MIN_TRY_NUMBER) {
            throw new IllegalArgumentException(ErrorMessage.TRY_NUMBER_TOO_SMALL.getMessage());
        }
    }

    public static void validateStringInput(String input) {
        if (input.matches("\\d+")) {
            throw new IllegalArgumentException(ErrorMessage.NOT_STRING_INPUT.getMessage());
        }
    }

    public static void validateNotEndWithComma(String input) {
        if (input.trim().endsWith(COMMA_DELIMITER)) {
            throw new IllegalArgumentException(ErrorMessage.END_WITH_COMMA.getMessage());
        }
    }

    public static void validateEnoughCars(List<String> carNames) {
        if (carNames.size() < MIN_CAR_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.NOT_ENOUGH_CARS.getMessage());
        }
    }
}
