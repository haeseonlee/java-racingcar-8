package racingcar;

import racingcar.util.ErrorMessage;

public class NumberConverter {

    public static int convert(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMERIC_INPUT.getMessage());
        }
    }
}
