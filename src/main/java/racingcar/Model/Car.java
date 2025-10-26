package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car implements Comparable<Car> {
    private final StringBuilder state;
    private final String name;
    private int pos;

    public Car(String name) {
        this.name = name;
        state = new StringBuilder();
        this.pos = 0;
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            this.state.append("-");
            pos++;
        }
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.pos, this.pos);
    }

    public String getName() {
        return this.name;
    }

    public StringBuilder getState(){
        return this.state;
    }

    public int getPos() {
        return this.pos;
    }
}
