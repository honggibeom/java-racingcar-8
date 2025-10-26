package racingcar.View;

import racingcar.Model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class RacingView {
    public void printProgress(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getState());
        }
    }

    public void printResult(List<Car> winners) {
        if (winners.isEmpty()) {
            System.out.println("우승자가 없습니다.");
            return;
        }
        String winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + winnerNames);
    }
}
