package dicegame;

import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public class PlayerHuman extends Player {

    Scanner cin = new Scanner(System.in);

    public PlayerHuman() {

    }

    public PlayerHuman(String name) {
        super(name);
    }

    @Override
    public int guess() {
        System.out.print("Wpisz liczbę (1-6): ");
        return cin.nextInt();
    }
}
