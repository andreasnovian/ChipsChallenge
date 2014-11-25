package Tile;

/**
 * Kelas yang merepresentasikan komponen tile ex girlfriend dalam permainan.
 * Tile ex girlfriend adalah komponen yang akan mengakhiri permainan dan membuat
 * pemain kalah jika diinjak
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class ExGirlfriend extends AbstractTile {

    public ExGirlfriend(){
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
