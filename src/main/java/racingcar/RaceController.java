package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RaceController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Winner winner;

    public RaceController(InputView inputView, OutputView outputView, Winner winner) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.winner = winner;
    }

    public void run() {
        String readCarNames = inputView.readCarNames();
        List<String> carNames = CarNameParser.parse(readCarNames);
        Cars cars = new Cars(carNames);

        String readTryNumber = inputView.readTryNumber();
        int tryNumber = NumberConverter.convert(readTryNumber);

        Race race = new Race(cars);

        outputView.printResultMessage();
        for (int i = 0; i < tryNumber; i++) {
            race.start();
            outputView.printRaceResult(race.getRaceResult());
        }

        outputView.printWinners(winner.getWinners(cars));
    }
}
