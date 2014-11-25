package Tile;

/**
 * Kelas yang merepresentasikan komponen tile finish dalam permainan. Tile
 * finish adalah komponen yang akan mengakhiri permainan dan membuat pemain
 * menang jika diinjak
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Finish extends AbstractTile {

    public Finish(){
        canBeStepped = true;
        isDanger = false;
    }

}
