
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile script dalam permainan
 * Tile Script adalah komponen yang harus dikumpulkan oleh pemain untuk dapat melewati barrier
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Script extends AbstractTile{
    
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
        return true;
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
