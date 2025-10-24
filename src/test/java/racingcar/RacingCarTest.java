package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.util.CarNameParser;
import racingcar.util.NumberConverter;
import racingcar.util.Validator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RacingCarTest {

    @Test
    void 입력값_공백_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateNotEmptyInput(""));
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

    @Test
    void 시도횟수가_1보다_작으면_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateMoreThanOne(0));
    }

    @Test
    void 시도횟수가_숫자가_아닌_경우_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                NumberConverter.convert("a"));
    }

    @Test
    void 자동차_이름이_문자가_아닌_경우_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateStringInput("123"));
    }

    @Test
    void 입력값이_구분자로_끝나는_경우_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateNotEndWithComma("pobi,woni,jun,"));
    }

    @Test
    void 자동차_2대_미만이면_예외_발생() {
        assertThrows(IllegalArgumentException.class, () ->
                Validator.validateEnoughCars(List.of("pobi")));
    }
}
