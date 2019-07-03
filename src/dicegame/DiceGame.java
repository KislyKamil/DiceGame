package dicegame;

/**
 *
 * @author Kamil
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game game = new Game();

        Player player = new PlayerComp("Kot");


        game.addPlayer(new PlayerComp("Kamil"));
        game.addPlayer(new PlayerHuman("Piotr"));


        game.printPlayers();

        game.play();
    }

}
