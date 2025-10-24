package racingcar;

public class Race {

    private final Cars cars;

    public Race(Cars cars) {
        this.cars = cars;
    }

    public void start() {
        cars.moveAll();
    }
}
