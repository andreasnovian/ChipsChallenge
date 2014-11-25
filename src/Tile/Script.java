package Tile;

/**
 * Kelas yang merepresentasikan komponen tile script dalam permainan. Tile
 * Script adalah komponen yang harus dikumpulkan oleh pemain untuk dapat
 * melewati barrier
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Script extends AbstractTile {

    public Script(){
        canBeStepped = true;
        isDanger = false;
    }

}
