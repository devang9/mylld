package machinecoding.snakeladder.model;

import java.util.Random;

public class Dice {
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int total = 0;
        for(int i =0;i<diceCount;i++){
            total+= 1 + new Random().nextInt(6);
        }
        return total;
    }
}
