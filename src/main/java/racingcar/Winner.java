package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Winner {

    public List<String> getWinners(Cars cars) {
        int maxPosition = getMaxPosition(cars);
        return cars.getCars().stream()
                .filter(car -> maxPosition == car.getPosition())
                .map(Car::getName)
                .collect(Collectors.toList());
    }

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
