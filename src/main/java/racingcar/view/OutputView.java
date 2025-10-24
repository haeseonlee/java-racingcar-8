package racingcar.view;

import java.util.List;

public class OutputView {

    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printRaceResult(List<String> results) {
        for (String result : results) {
            System.out.println(result);
        }
        System.out.println();
    }
}
