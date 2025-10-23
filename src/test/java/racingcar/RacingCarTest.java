package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.util.Validator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RacingCarTest {

    @Test
    void 입력값_공백_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateEmptyInput(""));
    }

    @Test
    void 자동차_이름_저장_기능_테스트() {
        String input = "pobi,woni,jun";
        List<String> expected = List.of("pobi", "woni", "jun");

        assertEquals(expected, CarNameParser.parse(input));
    }

    @Test
    void 자동차_이름_5자_넘으면_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                new Car("oniiiii"));
    }
}
