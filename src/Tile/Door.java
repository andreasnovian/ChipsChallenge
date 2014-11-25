package Tile;

/**
 * Kelas yang merepresentasikan komponen tile door atau pintu dalam permainan.
 * Tile Door atau pintu adalah komponen yang hanya bisa dilewati setelah pemain
 * mempunyai kunci yang sesuai untuk pintu yang akan dilewati
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Door extends AbstractTile {

    /**
     * Atribut color yang merupakan identitas untuk setiap objek Door
     */
    private final String color;

    public Door(String color){
        canBeStepped = true;
        isDanger = false;
        this.color = color;
    }

    /**
     * Method getter untuk variabel color
     *
     * @return string warna
     */
    public String getColor() {
        return color;
    }

}
