package racingcar;

import racingcar.Controller.RacingController;
import racingcar.Model.Racing;
import racingcar.View.InputView;
import racingcar.View.RacingView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingView racingView = new RacingView();
        Racing racing = new Racing();
        RacingController controller = new RacingController(inputView, racingView,racing);
        controller.startRacing();
    }
}
