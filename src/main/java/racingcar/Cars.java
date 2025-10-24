package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.Validator;

import java.util.List;

public class Cars {

    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;

    private final List<Car> cars;

    public Cars(List<String> carNames) {
        validateAtLeastTwoCars(carNames);
        this.cars = addCars(carNames);
    }

    private List<Car> addCars(List<String> names) {
        return names.stream()
                .map(Car::new)
                .toList();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void moveAll() {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            car.move(randomNumber);
        }
    }

    private void validateAtLeastTwoCars(List<String> carNames) {
        Validator.validateEnoughCars(carNames);
    }
}
