package Tile;

/**
 * Kelas yang merepresentasikan komponen tile key atau kunci dalam permainan.
 * Tile Key atau kunci adalah komponen yang harus dimiliki oleh pemain untuk
 * dapat melewati pintu yang sesuai dengan kunci
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Key extends AbstractTile {

    /**
     * Atribut color yang merupakan identitas untuk setiap objek Key
     */
    private final String color;

    public Key(String color){
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
