package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.ErrorMessage;

public class Car {

    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int FORWARD_NUMBER = 4;
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private int position;

    public Car(String name) {
        validateNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        if (randomNumber >= FORWARD_NUMBER) {
            this.position++;
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.MORE_THAN_FIVE_CHAR.getMessage());
        }
    }
}
