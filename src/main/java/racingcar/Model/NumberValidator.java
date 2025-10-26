package racingcar.Model;

public class NumberValidator {
    public static void validateNumber(String round) {
        int number = parseNumber(round);
        validateGreaterThanZero(number);
    }

    private static int parseNumber(String round) {
        if (!round.matches("[0-9]+")) {
            throw new IllegalArgumentException("라운드 횟수는 숫자여야합니다.");
        }
        return Integer.parseInt(round);
    }

    private static void validateGreaterThanZero(int round) {
        if (round < 1) {
            throw new IllegalArgumentException("라운드 횟수는 1 이상이어야 합니다.");
        }
    }
}
