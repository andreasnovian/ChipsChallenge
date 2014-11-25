package Tile;

/**
 * Kelas yang merepresentasikan komponen tile Barrier dalam permainan Tile.
 * Barrier adalah komponen yang hanya bisa dilewati setelah player mengumpulkan
 * semua script yang ada pada papan permainan
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Barrier extends AbstractTile {

    public Barrier() {
        canBeStepped = true;
        isDanger = false;
    }

}
