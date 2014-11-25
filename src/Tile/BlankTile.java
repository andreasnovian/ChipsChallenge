package Tile;

/**
 * Kelas yang merepresentasikan komponen blank tile dalam permainan. Blank tile
 * adalah komponen yang selalu bisa dilewati oleh player
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class BlankTile extends AbstractTile {

    public BlankTile(){
        canBeStepped = true;
        isDanger = false;
    }
}
