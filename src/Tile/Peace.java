package Tile;

/**
 * Kelas yang merepresentasikan komponen tile peace dalam permainan. Tile peace
 * adalah komponen yang akan membuat tile ex girlfriend menjadi tidak berbahaya
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Peace extends AbstractTile {

    public Peace(){
        canBeStepped = true;
        isDanger = false;
    }

}
