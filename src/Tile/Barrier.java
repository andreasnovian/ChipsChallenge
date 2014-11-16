
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile Barrier dalam permainan
 * Tile Barrier adalah komponen yang hanya bisa dilewati setelah player mengumpulkan semua script yang ada pada papan permainan
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Barrier extends AbstractTile{

    @Override
    public boolean isDanger() {
        return false;
    }
    
    @Override
    public boolean isFinish() {
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
    public boolean isBarrier() {
        return true;
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
