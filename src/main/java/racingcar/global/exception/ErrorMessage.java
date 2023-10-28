package racingcar.global.exception;

public enum ErrorMessage {
    EMPTY_VALUE("빈 값을 입력할 수 없습니다."),
    INVALID_INPUT_VALUE("잘못된 입력 형식입니다."),
    INVALID_LENGTH("차 이름은 5자를 초과할 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
