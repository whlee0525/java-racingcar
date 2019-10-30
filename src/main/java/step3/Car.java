package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {

    private final static int START_POSITION = 0;
    private final static int FIRST_ROUND = 0;
    private final static int RANDOM_BOUND = 10;
    private final static int RANDOM_BASE = 3;

    private List<Integer> positions = new ArrayList<>();
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        int position = START_POSITION;
        int latestRound = positions.size() - 1;

        if (isNotFirstRound(latestRound)) {
            position = getPosition(latestRound);
        }

        if (getRandom() > RANDOM_BASE) {
            position++;
        }

        positions.add(position);
    }

    public int getPosition(int roundNum) {
        return positions.get(roundNum);
    }

    public String getName() {
        return name;
    }

    private boolean isNotFirstRound(int latestRound) {
        if (latestRound >= FIRST_ROUND) {
            return true;
        }
        return false;
    }

    private int getRandom() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUND);
    }


}
