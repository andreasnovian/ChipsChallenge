package Tile;

/**
 * Kelas yang merepresentasikan komponen tile computer dalam permainan. Tile
 * computer adalah komponen yang akan mengakhiri permainan dan membuat pemain
 * kalah jika diinjak
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Computer extends AbstractTile {

    public Computer() {
        canBeStepped = true;
        isDanger = true;
    }

    /**
     * Method untuk membuat atribut isDanger menjadi false
     */
    public void makeItSafe() {
        isDanger = false;
    }

}
