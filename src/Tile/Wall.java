package Tile;

/**
 * Kelas yang merepresentasikan komponen tile wall atau dinding dalam permainan.
 * Tile wall atau dinding adalah komponen yang tidak akan bisa dilewati oleh
 * pemain
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Wall extends AbstractTile {

    public Wall(){
        canBeStepped = false;
        isDanger = false;
    }
    
}
