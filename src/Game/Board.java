
package Game;

import Tile.AbstractTile;
import java.awt.Point;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class Board {

    public AbstractTile[][] mapBoard;
    public int chipsNeeded;
    public abstract void setMap();
    public abstract void move(int x , int y);
        
}
