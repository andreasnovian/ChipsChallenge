package Tile;

/**
 * Kelas yang merepresentasikan komponen tile dead electricity dalam permainan.
 * Tile dead electricity adalah komponen yang akan membuat tile computer menjadi
 * tidak berbahaya
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class DeadElectricity extends AbstractTile {

    public DeadElectricity() {
        canBeStepped = true;
        isDanger = false;
    }

}
