package racingcar;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> carNames) {
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
}
