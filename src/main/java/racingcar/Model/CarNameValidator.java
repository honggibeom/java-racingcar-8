package racingcar.Model;

public class CarNameValidator {
    public static void validateCarName(String cars) {
        validateAllowedCharacters(cars);
        validateStartCharacter(cars);
        validateNameLength(cars);

    }

    private static void validateAllowedCharacters(String cars) {
        if (cars.matches("[^0-9a-zA-Z,]")) {
            throw new IllegalArgumentException("자동차 이름에 허용되지 않은 문자가 포함되어 있습니다.");
        }
    }

    private static void validateStartCharacter(String cars) {
        if (cars.startsWith(",")) {
            throw new IllegalArgumentException("자동차 이름은 ,로 시작할 수 없습니다.");
        }
    }

    private static void validateNameLength(String cars) {
        for (String name : cars.split(",")) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다: " + name);
            }
        }
    }
}
