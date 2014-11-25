package Game;

import Tile.Key;
import java.awt.Point;
import java.util.ArrayList;

/**
 * Kelas yang merepresentasikan objek pemain pada papan permainan
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Player {

    /**
     * Atribut live untuk menyimpan kondisi pemain apakah pemain dalam keadaan
     * hidup atau tidak
     */
    private boolean alive;

    /**
     * Atribut win untuk menyimpan kondisi pemain apakah pemain sudah mencapai
     * kemenangan atau belum
     */
    private boolean win;

    /**
     * Atribut script untuk menyimpan jumlah script yang dimiliki oleh pemain
     */
    private int script;

    /**
     * Atribut keyList untuk menyimpan kunci yang dimiliki oleh pemain
     */
    private ArrayList<Key> keyList;

    /**
     * Atribut position untuk menyimpan posisi pemain dalam papan permainan
     */
    private Point position;

    public Player(Point position) {
        this.alive = true;
        this.win = false;
        this.script = 0;
        this.keyList = new ArrayList();
        this.position = position;
    }

    /**
     * Method untuk mendapatkan daftar kunci yang dimiliki oleh pemain dalam
     * bentuk String
     *
     * @return String berisi kunci milik pemain
     */
    public String getAllKey() {
        String result="";
        for (int i=0;i<keyList.size();i++){
            result+=keyList.get(i).getColor()+", ";
        }
        return result;
    }

    /**
     * Method untuk mengetahui kondisi pemain apakah pemain dalam keadaan hidup
     * atau tidak
     *
     * @return true jika hidup dan false jika tidak
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Method untuk mengetahui kondisi pemain apakah pemain sudah mencapai
     * kemenangan atau belum
     *
     * @return true jika menang dan false jika belum
     */
    public boolean isWin() {
        return win;
    }

    /**
     * Method untuk menambahkan jumlah script yang dimiliki oleh pemain sebanyak
     * 1
     */
    public void addScript() {
        script++;
    }

    /**
     * Method untuk mengetahui jumlah script yang dimiliki oleh pemain
     *
     * @return jumlah script milik pemain
     */
    public int getScript() {
        return script;
    }

    /**
     * Method untuk mengubah isi dari atribut position
     *
     * @param position objek Point yang merupakan posisi baru pemain
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * Method untuk mengetahui posisi pemain dalam papan permainan
     *
     * @return objek Point yang menyimpan koordinat posisi pemain
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Method untuk menambahkan objek Key baru ke dalam list keyList
     *
     * @param key objek Key yang akan ditambahkan
     */
    public void addKey(Key key) {
        keyList.add(key);
    }

    /**
     * Method untuk mengetahui jumlah kunci yang dimiliki oleh pemain
     *
     * @return jumlah kunci yang dimiliki oleh pemain
     */
    public int getNumOfKey() {
        return keyList.size();
    }

    /**
     * Method untuk mendapatkan objek Key dari atribut keyList pada posisi index
     *
     * @param index posisi kunci yang ingin diambil
     * @return objek Key pada posisi index dalam atribut keyList
     */
    public Key getKey(int index) {
        return keyList.get(index);
    }

    /**
     * Method untuk mendapatkan warna dari objek Key dari atribut keyList pada
     * posisi index
     *
     * @param index posisi kunci yang ingin diambil
     * @return warna dari objek Key pada posisi index dalam atribut keyList
     */
    public String getKeyColor(int index) {
        return keyList.get(index).getColor();
    }

    /**
     * Method move untuk menggerakkan pemain supaya menghadap sesuai pergerakan
     * yang dilakukan
     *
     * @param direction
     */
    public void move(int direction) {

    }

    /**
     * Method untuk membuat atribut alive menjadi false
     */
    public void kill() {
        alive = false;
    }

    /**
     * Method untuk membuat atribut win menjadi true
     */
    public void win() {
        win = true;
    }

}
