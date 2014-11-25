package Game;

import GUI.Interface;
import Tile.*;
import java.awt.Point;

/**
 * Kelas abstract yang digunakan untuk menginstansiasi papan permainan. Kelas
 * ini beserta turunannya merupakan Controller dalam project ini
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class Board {

    /**
     * Atribut view yang merupakan objek dari kelas Interface. Atribut ini akan
     * diberitahu jika terjadi perubahan pada papan permainan yang mengharuskan
     * perubahan pada tampilan visual
     */
    private Interface view;

    /**
     * Atribut scriptNeeded untuk menyimpan jumlah script yang harus dikumpulkan
     * oleh pemain pada setiap stage
     */
    protected int scriptNeeded;

    /**
     * Atribut scriptLeft untuk menyimpan jumlah script yang tersisa setiap kali
     * pemain mendapatkan sebuah script
     */
    protected int scriptLeft;

    /**
     * Atribut player untuk menyimpan pemain yang bermain dalam papan permainan
     */
    protected Player player;

    private String playerNowOn;

    /**
     * Atribut mapBoard untuk menyimpan komponen penyusun papan permainan yang
     * merupakan objek dari turunan kelas AbstractTile
     */
    protected AbstractTile[][] mapBoard;

    public Board(Interface view, int scriptNeeded, Point playerPosition) {
        this.view = view;
        this.scriptNeeded = scriptNeeded;
        this.scriptLeft = scriptNeeded;
        this.player = new Player(playerPosition);
        this.playerNowOn = "";
        this.mapBoard = new AbstractTile[15][15];
        this.view.printScriptLeft(scriptNeeded);
        this.setMap();
    }

    /**
     * Method untuk menggerakkan pemain dalam papan permainan
     *
     * @param x jumlah pergerakan dalam sumbu x
     * @param y jumlah pergerakan dalam sumbu y
     */
    public void move(int x, int y) {
        /**
         * Membuat atribut Lokal bertipe data int yang berupa posisi baru
         * setelah menerima input terbaru (axis X)
         */
        int newX = (int) this.player.getPosition().getX() + x;

        /**
         * Membuat atribut Lokal bertipe data int yang berupa posisi baru
         * setelah menerima input terbaru (axis Y)
         */
        int newY = (int) this.player.getPosition().getY() + y;

        /**
         * Membuat atribut Lokal bertipe data point dengan parameter newX dan
         * newY yang sudah dibuat
         */
        Point newPosition = new Point(newX, newY);

        /**
         *
         */
        String tileName = mapBoard[newX][newY].getClass().getName();
        /**
         * Cek apakah mapboard[newX][newY] dapat dilewati atau tidak Jika dapat
         * dilewati cek kemungkinan selanjutnya Jika tidak posisi player tetap
         */
        if (this.mapBoard[newX][newY].canBeStepped()) {
            /**
             * Cek apakah mapboard[newX][newY] berbahaya atau tidak isDanger >>
             * Computer dan ExGirlFriend jika bahaya posisi player ditempatkan
             * di posisi yang baru , dan player mati
             */
            if (this.mapBoard[newX][newY].isDanger()) {
                this.player.setPosition(newPosition);
                this.player.kill();
                this.playerNowOn="Danger";
            } else {
                /**
                 * Cek player berada di posisi Barrier Player dapat menembus
                 * barrier jika jumlah script yang dibutuhkan sudah terpenuhi
                 * jika tidak , posisi player tidak berubah
                 */
                if (tileName.equalsIgnoreCase("Tile.Barrier")) {
                    if (this.player.getScript() == scriptNeeded) {
                        this.mapBoard[newX][newY] = new BlankTile();
                        this.player.setPosition(newPosition);
                        this.playerNowOn="Barrier";
                    }
                } /**
                 * Cek player berada di posisi BlankTile Posisi player diset ke
                 * posisi yang baru
                 */
                else if (tileName.equalsIgnoreCase("Tile.BlankTile")) {
                    this.player.setPosition(newPosition);
                    this.playerNowOn="BlankTile";
                } /**
                 * Cek player berada di DeadElectricity Semua komputer yang
                 * sebelumnya berbahaya jika dilewati , akan menjadi tidak
                 * berbahaya
                 */
                else if (tileName.equalsIgnoreCase("Tile.DeadElectricity")) {
                    for (int i = 0; i < this.mapBoard.length; i++) {
                        for (int j = 0; j < this.mapBoard[i].length; j++) {
                            if (this.mapBoard[i][j].getClass().getName().equalsIgnoreCase("Tile.Computer")) {
                                Computer temp = (Computer) this.mapBoard[i][j];
                                temp.makeItSafe();
                                this.mapBoard[i][j] = temp;
                                this.playerNowOn="Computer";
                            }
                        }
                    }
                    this.player.setPosition(newPosition);
                    this.mapBoard[newX][newY] = new BlankTile();
                    this.playerNowOn="DeadElectricity";
                } /**
                 * Cek player berada di posisi door Player dapat membuka pintu
                 * jika kunci yang dimiliki sesuai dengan pintu
                 */
                else if (tileName.equalsIgnoreCase("Tile.Door")) {
                    Door tempDoor = (Door) this.mapBoard[newX][newY];
                    for (int i = 0; i < this.player.getNumOfKey(); i++) {
                        if (tempDoor.getColor().equalsIgnoreCase(this.player.getKey(i).getColor())) {
                            this.mapBoard[newX][newY] = new BlankTile();
                            this.player.setPosition(newPosition);
                            this.playerNowOn="Door";
                        }
                    }
                } /**
                 * Cek player berada diposisi Finish Player melanjutkan ke stage
                 * berikutnya
                 */
                else if (tileName.equalsIgnoreCase("Tile.Finish")) {
                    if (this.player.getScript() == scriptNeeded) {
                        this.player.setPosition(newPosition);
                        this.player.win();
                        this.playerNowOn="Finish";
                    }
                } /**
                 * Cek player jika berada di Key Key akan ditambahkan ke
                 * ArrayList<Key> dikelas Player
                 */
                else if (tileName.equalsIgnoreCase("Tile.Key")) {
                    Key tempKey = (Key) mapBoard[newX][newY];
                    this.player.addKey(tempKey);
                    this.mapBoard[newX][newY] = new BlankTile();
                    this.player.setPosition(newPosition);
                    view.printPlayerKeys(player.getAllKey());
                    this.playerNowOn="Key";
                } /**
                 * Cek player berada di Peace Semua ExGirlFriend yang sebelumnya
                 * berbahaya jika dilewati , akan menjadi tidak berbahaya
                 */
                else if (tileName.equalsIgnoreCase("Tile.Peace")) {
                    for (int i = 0; i < this.mapBoard.length; i++) {
                        for (int j = 0; j < this.mapBoard[i].length; j++) {
                            if (this.mapBoard[i][j].getClass().getName().equalsIgnoreCase("Tile.ExGirlFriend")) {
                                ExGirlfriend tempEG = (ExGirlfriend) this.mapBoard[i][j];
                                tempEG.makeItSafe();
                                this.mapBoard[i][j] = tempEG;
                                this.playerNowOn="Peace";
                            }
                        }
                    }
                    this.player.setPosition(newPosition);
                    this.mapBoard[newX][newY] = new BlankTile();
                } /**
                 * Cek player berada di Script Jika berada di Script , jumlah
                 * script yang dimiliki player akan bertambah
                 */
                else if (tileName.equalsIgnoreCase("Tile.Script")) {
                    Script tempScript = (Script) mapBoard[newX][newY];
                    this.player.addScript();
                    this.player.setPosition(newPosition);
                    this.mapBoard[newX][newY] = new BlankTile();
                    this.scriptLeft--;
                    this.view.printScriptLeft(this.scriptLeft);
                    this.playerNowOn="Script";
                } else if (tileName.equalsIgnoreCase("Tile.ExGirlfriend")) {
                    this.player.setPosition(newPosition);
                    this.playerNowOn="ExGirlfriend";
                } else if (tileName.equalsIgnoreCase("Tile.Computer")) {
                    this.player.setPosition(newPosition);
                    this.playerNowOn="ExGirlfriend";
                }
            }
            /**
             * Jika tidak dapat dilewati , maka posisi player tetap
             */
        } else {

        }
    }

    /**
     * Method untuk mencetak papan permainan
     *
     * @return array 2 dimensi bertipe String yang berisi papan permainan dalam
     * bentuk string
     */
    public String[][] printMap() {
        String[][] map = new String[15][15];

        for (int i = 0; i < this.mapBoard.length; i++) {
            for (int j = 0; j < this.mapBoard[0].length; j++) {
                map[i][j] = this.mapBoard[i][j].getClass().getName();
                if (map[i][j].equalsIgnoreCase("Tile.Door")) {
                    Door door = (Door) this.mapBoard[i][j];
                    map[i][j] = door.getColor();
                }
                if (map[i][j].equalsIgnoreCase("Tile.Key")) {
                    Key key = (Key) this.mapBoard[i][j];
                    map[i][j] = key.getColor();
                }
            }
        }
        map[player.getPosition().x][player.getPosition().y] = "Player";

        return map;
    }

    /**
     * Method untuk mengetahui kondisi pemain yang bermain dalam papan permainan
     * apakah pemain dalam keadaan hidup atau tidak
     *
     * @return true jika hidup dan false jika tidak
     */
    public boolean isPlayerAlive() {
        return player.isAlive();
    }

    public String getPlayerNow(){
        return this.playerNowOn;
    }
    
    /**
     * Method untuk mengetahui kondisi pemain apakah pemain sudah mencapai
     * kemenangan atau belum
     *
     * @return true jika menang dan false jika belum
     */
    public boolean isPlayerWin() {
        return player.isWin();
    }

    /**
     * Method untuk mengetahui posisi pemain dalam papan permainan
     *
     * @return objek Point yang menyimpan koordinat posisi pemain
     */
    public Point getPlayerPosition() {
        return player.getPosition();
    }

    /**
     * Method untuk melakukan inisialisasi papan permainan dengan komponen
     * berupa objek dari turunan kelas AbstractTile
     */
    private void setMap() {
        setBlankTile();
        setBarrier();
        setComputer();
        setDoor();
        setFinish();
        setKey();
        setScript();
        setWall();
        setDeadElectricity();
        setExGirlfriend();
        setPeace();
    }

    /**
     * Set posisi BlankTile
     */
    protected abstract void setBlankTile();

    /**
     * Set posisi Barrier
     *
     */
    protected abstract void setBarrier();

    /**
     * Set posisi Computer
     *
     */
    protected abstract void setComputer();

    /**
     * Set posisi DeadElectricity
     *
     */
    protected abstract void setDeadElectricity();

    /**
     * Set posisi Door
     *
     */
    protected abstract void setDoor();

    /**
     * Set posisi ExGirlfriend
     *
     */
    protected abstract void setExGirlfriend();

    /**
     * Set posisi Finish
     *
     */
    protected abstract void setFinish();

    /**
     * Set posisi Key
     *
     */
    protected abstract void setKey();

    /**
     * Set posisi Peace
     *
     */
    protected abstract void setPeace();

    /**
     * Set posisi Script
     *
     */
    protected abstract void setScript();

    /**
     * Set posisi Wall
     *
     */
    protected abstract void setWall();

}
