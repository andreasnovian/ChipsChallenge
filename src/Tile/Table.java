
package Tile;

import javax.swing.text.AbstractDocument;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Table extends AbstractTile{
   
    @Override
    public boolean isDanger() {
        return false;
    }

    @Override
    public boolean canBeStepped() {
        return true;
    }
    
    @Override
    public boolean isScript() {
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
        return false;
    }

    @Override
    public boolean isComputer() {
        return false;
    }

    @Override
    public boolean isTable() {
        return true;
    }
    
}
