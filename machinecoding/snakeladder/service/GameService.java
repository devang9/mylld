package machinecoding.snakeladder.service;

import machinecoding.snakeladder.model.Board;
import machinecoding.snakeladder.model.Dice;
import machinecoding.snakeladder.model.Game;
import machinecoding.snakeladder.model.Player;

import java.util.HashMap;
import java.util.Queue;
import java.util.Random;

public class GameService {
    private static GameService gameService;
    public GameService(){

    }
    public static GameService getInstance(){
        if(gameService==null){
            gameService = new GameService();
        }
        return gameService;
    }

    public void initializeAndStartGame(int diceCount, Queue<Player> playerQueue, int boxes) {
        HashMap<Integer,Integer> snakes = new HashMap<>();
        HashMap<Integer,Integer> ladders = new HashMap<>();
        generateSnakes(snakes,boxes);
        generateLadders(ladders,boxes);
        Dice dice = new Dice(diceCount);
        Board board = new Board(ladders,snakes,boxes);
        Game game = new Game(board,playerQueue,dice);
        startGame(game);
    }

    private void generateLadders(HashMap<Integer, Integer> ladders, int boxes) {
        int numberOfLadders = boxes/10;
        for(int i =0;i<numberOfLadders;i++){
            int ladderEnd= 1 + new Random().nextInt(6);
            int ladderStart= 1 + new Random().nextInt(ladderEnd-1);
            ladders.put(ladderStart,ladderEnd);
        }
    }

    private void generateSnakes(HashMap<Integer, Integer> snakes, int boxes) {
        int numberOfSnakes = boxes/10;
        for(int i =0;i<numberOfSnakes;i++){
            int snakeStart= 1 + new Random().nextInt(6);
            int snakeEnd= 1 + new Random().nextInt(snakeStart-1);
            snakes.put(snakeStart,snakeEnd);
        }
    }

    private void startGame(Game game) {
        Queue<Player> playerQueue = game.getPlayers();
        while (true) {
            Player currentPlayer = playerQueue.remove();
            int diceOutput = game.getDice().rollDice();
            int newPosition = currentPlayer.getPosition()+diceOutput;
            if(newPosition>game.getBoard().getBoxes()){
                System.out.println("Cannot move. Out of range");
            }
            if(newPosition==game.getBoard().getBoxes()){
                System.out.println(currentPlayer.getName()+" has won the game");
            }
            if(game.getBoard().getSnakes().containsKey(newPosition)){
                newPosition = game.getBoard().getSnakes().get(newPosition);
            }
            if(game.getBoard().getLadders().containsKey(newPosition)){
                newPosition = game.getBoard().getLadders().get(newPosition);
            }
            currentPlayer.setPosition(newPosition);
            playerQueue.add(currentPlayer);
        }
    }
}
