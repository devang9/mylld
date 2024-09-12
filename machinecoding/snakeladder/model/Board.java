package machinecoding.snakeladder.model;

import java.util.HashMap;
import java.util.Queue;

public class Board {
    HashMap<Integer,Integer> ladders;
    HashMap<Integer,Integer> snakes;
    int boxes;

    public Board(HashMap<Integer, Integer> ladders, HashMap<Integer, Integer> snakes, int boxes) {
        this.ladders = ladders;
        this.snakes = snakes;
        this.boxes = boxes;
    }

    public HashMap<Integer, Integer> getLadders() {
        return ladders;
    }

    public void setLadders(HashMap<Integer, Integer> ladders) {
        this.ladders = ladders;
    }

    public HashMap<Integer, Integer> getSnakes() {
        return snakes;
    }

    public void setSnakes(HashMap<Integer, Integer> snakes) {
        this.snakes = snakes;
    }

    public int getBoxes() {
        return boxes;
    }

    public void setBoxes(int boxes) {
        this.boxes = boxes;
    }
}
