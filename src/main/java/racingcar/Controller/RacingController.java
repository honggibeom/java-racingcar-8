package racingcar.Controller;

import racingcar.Model.CarNameValidator;
import racingcar.Model.NumberValidator;
import racingcar.Model.Racing;
import racingcar.Service.RacingService;
import racingcar.View.InputView;
import racingcar.View.RacingView;

public class RacingController {
    InputView inputView;
    RacingView racingView;

    public RacingController(InputView inputView, RacingView racingView) {
        this.inputView = inputView;
        this.racingView = racingView;
    }

    public void startRacing() {
        String cars = inputView.inputCarNames();
        CarNameValidator.validateCarName(cars);

        String round = inputView.inputRoundNumber();
        NumberValidator.validateNumber(round);

        Racing racing = new Racing(cars);
        RacingService racingService = new RacingService(racing, this.racingView);

        racingService.playRounds(Integer.parseInt(round));
    }
}
