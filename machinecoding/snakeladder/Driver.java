package machinecoding.snakeladder;

import machinecoding.snakeladder.model.Player;
import machinecoding.snakeladder.service.GameService;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter game inputs:");
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        // 3 dchheda,fkamdar,dhagarg 2 50
        int diceCount = Integer.parseInt(input[2]);
        int boxes = Integer.parseInt(input[3]);
        String[] players = input[1].split(",");
        Queue<Player> playerQueue = new LinkedList<>();
        for(String playerName:players){
            Player player = new Player(playerName,0);
            playerQueue.add(player);
        }
        GameService gameService = GameService.getInstance();
        gameService.initializeAndStartGame(diceCount,playerQueue,boxes);
    }
}
