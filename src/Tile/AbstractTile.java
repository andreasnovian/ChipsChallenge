package Tile;

/**
 * Kelas abstract yang digunakan untuk menginstansiasi setiap komponen tile
 * dalam permainan. Kelas ini beserta turunannya merupakan Model dalam project
 * ini
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class AbstractTile {

    /**
     * Atribut canBeStepped yang menentukan apakah objek tile dapat diinjak
     */
    protected boolean canBeStepped;

    /**
     * Atribut isDanger yang menentukan apakah objek tile berbahaya bagi pemain
     */
    protected boolean isDanger;

    /**
     * Method untuk mengetahui apakah objek tile dapat diinjak oleh pemain atau
     * tidak
     *
     * @return true jika dapat diinjak atau false jika tidak
     */
    public boolean canBeStepped() {
        return canBeStepped;
    }

    /**
     * Method untuk mengetahui apakah objek tile berbahaya bagi pemain atau
     * tidak. Objek tile yang berbahaya dapat mematikan pemain jika terinjak
     *
     * @return true jika berbahaya atau false jika tidak
     */
    public boolean isDanger() {
        return isDanger;
    }
}
