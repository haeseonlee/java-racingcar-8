package racingcar.domain;

import racingcar.util.ErrorMessage;
import racingcar.util.Validator;

public class Car {

    private static final int FORWARD_NUMBER = 4;
    private static final int MAX_NAME_LENGTH = 5;

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
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.MORE_THAN_FIVE_CHAR.getMessage());
        }
    }

    private void validateCarNameFormat(String name) {
        Validator.validateStringInput(name);
    }
}
