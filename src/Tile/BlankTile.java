
package Tile;

/**
 * Kelas yang merepresentasikan tile lantai
 * Tile ini dapat dilewati tanpa syarat apapun
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class BlankTile extends AbstractTile{

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
        return false;
    }
    
}
