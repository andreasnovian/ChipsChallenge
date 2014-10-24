
package Tile;

import javax.swing.text.AbstractDocument;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Wall extends AbstractTile{
   
    @Override
    public boolean isDanger() {
        return false;
    }

    @Override
    public boolean canStep() {
        return false;
    }

    @Override
    public boolean isFinish() {
        return false;
    }

    @Override
    public boolean isBarrier() {
        return false;
    }

    @Override
    public boolean isDoor() {
        return false;
    }
    
    @Override
    public boolean isKey() {
        return false;
    }

    @Override
    public boolean isWall() {
        return true;
    }
    
}
