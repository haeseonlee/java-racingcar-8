package racingcar;

import racingcar.util.Validator;

import java.util.Arrays;
import java.util.List;

public class CarNameParser {

    private static final String COMMA_DELIMITER = ",";

    public static List<String> parse(String input) {
        validateNotEndWithDelimiter(input);
        return Arrays.stream(input.split(COMMA_DELIMITER))
                .toList();
    }

    private static void validateNotEndWithDelimiter(String input) {
        Validator.validateEndWithComma(input);
    }
}
