package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private static final String MOVE_SYMBOL = "-";

    private final Cars cars;

    public Race(Cars cars) {
        this.cars = cars;
    }

    public void start() {
        cars.moveAll();
    }

    public List<String> getRaceResult() {
        List<String> result = new ArrayList<>();
        for (Car car : cars.getCars()) {
            result.add(car.getName() + " : " + MOVE_SYMBOL.repeat(car.getPosition()));
        }
        return result;
    }
}
