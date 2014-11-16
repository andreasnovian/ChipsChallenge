
package Tile;

/**
 * Kelas yang merepresentasikan komponen blank tile dalam permainan
 * Blank tile adalah komponen yang selalu bisa dilewati oleh player
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
    
    @Override
    public boolean isWater() {
        return false;
    }
    
}
