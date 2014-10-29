
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile dalam permainan
 * Komponen yang dimaksud adalah komponen yang menyusun papan permainan kecuali pemain
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class AbstractTile {
   
    /**
     * Method untuk menentukan apakah tile ini berbahaya atau tidak
     * Berbahaya berarti dapat membuat pemain mati jika menginjak tile ini
     * @return true jika bahaya dan false jika tidak
     */
    public abstract boolean isDanger();
    
    /**
     * Method untuk menentukan apakah tile dapat diinjak atau tidak
     * Jika dapat diinjak berarti pemain dapat menempati posisi tile ini
     * @return true jika dapat diinjak dan false jika tidak
     */
    public abstract boolean canBeStepped();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile script atau bukan
     * Tile Script adalah komponen yang harus dikumpulkan oleh pemain untuk dapat melewati barrier
     * @return true jika merupakan script dan false jika bukan
     */
    public abstract boolean isScript();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile barrier atau bukan
     * Tile Barrier adalah komponen yang hanya bisa dilewati setelah player mengumpulkan semua script yang ada pada papan permainan
     * @return true jika merupakan barrier dan false jika bukan
     */
    public abstract boolean isBarrier();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile pintu atau bukan
     * Tile Door atau pintu adalah komponen yang hanya bisa dilewati setelah pemain mempunyai kunci yang sesuai untuk pintu yang akan dilewati
     * @return true jika merupakan pintu dan false jika bukan
     */
    public abstract boolean isDoor();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile kunci atau bukan
     * Tile Key atau kunci adalah komponen yang harus dimiliki oleh pemain untuk dapat melewati pintu yang sesuai dengan kunci
     * @return true jika merupakan kunci dan false jika bukan
     */
    public abstract boolean isKey();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile dinding atau bukan
     * Tile Wall atau dinding adalah komponen yang tidak akan bisa dilewati oleh pemain
     * @return true jika merupakan dinding dan false jika bukan
     */
    public abstract boolean isWall();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile finish atau bukan
     * Tile finish adalah komponen yang akan mengakhiri permainan dan membuat pemain menang jika diinjak
     * @return true jika merupakan tile finish dan false jika bukan
     */
    public abstract boolean isFinish();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile computer atau bukan
     * Tile computer adalah komponen yang akan mengakhiri permainan dan membuat pemain kalah jika diinjak
     * @return true jika merupakan tile computer dan false jika bukan
     */
    public abstract boolean isComputer();
    
    /**
     * Method untuk menentukan apakah tile merupakan tile table atau bukan
     * Tile table atau meja adalah komponen yang bisa dilewati dan akan menggantikan komponen key dan script ketika kedua komponen itu diinjak oleh pemain
     * @return true jika merupakan tile table dan false jika bukan
     */
    public abstract boolean isTable();
}
