package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.util.Validator;

import static org.junit.jupiter.api.Assertions.*;

public class RacingCarTest {

    @Test
    void 입력값_공백_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateEmptyInput(""));
    }
}
