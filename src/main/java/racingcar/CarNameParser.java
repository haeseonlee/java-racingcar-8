package racingcar;

import java.util.Arrays;
import java.util.List;

public class CarNameParser {

    private static final String COMMA_DELIMITER = ",";

    public static List<String> parse(String input) {
        return Arrays.stream(input.split(COMMA_DELIMITER))
                .toList();
    }
}
