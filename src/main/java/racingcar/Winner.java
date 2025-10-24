package racingcar;

public class Winner {

    private int getMaxPosition(Cars cars) {
        int maxPosition = 0;
        for (Car car : cars.getCars()) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
