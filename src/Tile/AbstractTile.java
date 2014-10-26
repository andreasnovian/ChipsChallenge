
package Tile;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class AbstractTile {
   
    
    /**
     * Method untuk mengecek apakah lantai berbahaya atau tidak.
     * @return 
     */
    public abstract boolean isDanger();
    
    /**
     * Method untuk mengecek apakah lantai dapat diinjak atau tidak.
     * @return 
     */
    public abstract boolean canBeStepped();
    
    /**
     * 
     * @return 
     */
    public abstract boolean isScript();
    
    /**
     * 
     * @return 
     */
    public abstract boolean isBarrier();
    
    /**
     * 
     * @return 
     */
    public abstract boolean isDoor();
    
    /**
     * 
     * @return 
     */
    public abstract boolean isWall();
    
    /**
     * 
     * @return 
     */
    public abstract boolean isKey();
    
    /**
     * Method untuk mengecek apakah sudah berada dilantai finish atau tidak.
     * @return 
     */
    public abstract boolean isFinish();
    
    public abstract boolean isComputer();
    public abstract boolean isTable();
}
