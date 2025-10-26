package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Model.CarNameValidator;
import racingcar.Model.NumberValidator;

public class InputView {
    public String inputCarNames() {
        System.out.println("자동차 이름을 입력하세요 : ");
        return Console.readLine();
    }

    public String inputRoundNumber() {
        System.out.println("진행할 라운드 횟수를 입력하세요 : ");
        return Console.readLine();
    }
}
