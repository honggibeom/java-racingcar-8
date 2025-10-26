package racingcar;

import racingcar.Controller.RacingController;
import racingcar.View.InputView;
import racingcar.View.RacingView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingView racingView = new RacingView();
        RacingController controller = new RacingController(inputView, racingView);
        controller.startRacing();
    }
}
