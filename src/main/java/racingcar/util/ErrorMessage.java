package racingcar.util;

public enum ErrorMessage {
    EMPTY_INPUT("입력값이 비어있습니다."),
    MORE_THAN_FIVE_CHAR("자동차 이름은 5글자 이하로 제한됩니다."),;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "[ERROR] " + message;
    }
}
