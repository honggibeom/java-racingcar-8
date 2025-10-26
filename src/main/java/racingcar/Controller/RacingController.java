package racingcar.Controller;

import racingcar.Model.CarNameValidator;
import racingcar.Model.NumberValidator;
import racingcar.Model.Racing;
import racingcar.View.InputView;
import racingcar.View.RacingView;

public class RacingController {
    InputView inputView;
    RacingView racingView;
    Racing racing;

    public RacingController(InputView inputView, RacingView racingView) {
        this.inputView = inputView;
        this.racingView = racingView;
    }

    public void startRacing() {
        String cars = inputView.inputCarNames();
        CarNameValidator.validateCarName(cars);

        String round = inputView.inputRoundNumber();
        NumberValidator.validateNumber(round);

        this.racing = new Racing(cars);
        playRounds(Integer.parseInt(round));
    }

    public void playRounds(int roundCount) {
        for (int i = 0; i < roundCount; i++) {
            racing.startRound();
            racingView.printProgress(racing.getCars());
        }
        racingView.printResult(racing.getWinners());
    }
}
