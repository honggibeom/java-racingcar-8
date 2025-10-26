package racingcar.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Collections;

public class Racing {
    private final List<Car> racingCars;
    private final PriorityQueue<Car> ranking;

    public Racing(String cars) {
        this.racingCars = new ArrayList<>();
        this.ranking = new PriorityQueue<>(Collections.reverseOrder());
        for (String car : cars.split(",")) {
            Car racingCar = new Car(car);
            racingCars.add(racingCar);
            ranking.add(racingCar);
        }
    }

    public void startRound() {
        for (Car car : racingCars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return racingCars;
    }

    public List<Car> getWinners() {
        if (ranking.isEmpty()) {
            return Collections.emptyList();
        }
        List<Car> winners = new ArrayList<>();
        int max = ranking.peek().getPos();
        while (!ranking.isEmpty()) {
            Car car = ranking.poll();
            if (car.getPos() == max) {
                winners.add(car);
            } else {
                break;
            }
        }
        return winners;
    }
}
