package racingcar.util;

public enum ErrorMessage {
    EMPTY_INPUT("입력값이 비어있습니다."),
    MORE_THAN_FIVE_CHAR("자동차 이름은 5글자 이하로 제한됩니다."),
    NOT_NUMERIC_INPUT("숫자 이외의 값은 입력할 수 없습니다."),
    TRY_NUMBER_TOO_SMALL("시도 횟수는 1번 이상이어야 합니다."),
    NOT_STRING_INPUT("자동차 이름은 문자만 입력 가능합니다."),
    END_WITH_COMMA("자동차 이름을 끝까지 입력해 주세요."),
    NOT_ENOUGH_CARS("자동차 경주는 2대 이상부터 진행됩니다.");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "[ERROR] " + message;
    }
}
