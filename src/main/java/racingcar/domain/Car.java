package racingcar.domain;

import racingcar.util.ErrorMessage;
import racingcar.util.Validator;

public class Car {

    private static final int FORWARD_NUMBER = 4;

    private final String name;
    private int position;

    public Car(String name) {
        validateNameLength(name);
        validateCarNameFormat(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int randomNumber) {
        if (randomNumber >= FORWARD_NUMBER) {
            this.position++;
        }
    }

    private void validateNameLength(String name) {
        Validator.validateNameLengthFive(name);
    }

    private void validateCarNameFormat(String name) {
        Validator.validateStringInput(name);
    }
}
