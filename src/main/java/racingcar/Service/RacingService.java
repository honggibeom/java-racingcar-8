package racingcar.Service;

import racingcar.Model.Racing;
import racingcar.View.RacingView;

public class RacingService {
    private final Racing racing;
    private final RacingView view;

    public RacingService(Racing racing, RacingView view) {
        this.racing = racing;
        this.view = view;
    }

    public void playRounds(int roundCount) {
        for (int i = 0; i < roundCount; i++) {
            racing.startRound();
            view.printProgress(racing.getCars());
        }
        view.printResult(racing.getWinners());
    }
}
