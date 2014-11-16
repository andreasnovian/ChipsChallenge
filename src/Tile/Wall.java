
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile wall atau dinding dalam permainan
 * Tile wall atau dinding adalah komponen yang tidak akan bisa dilewati oleh pemain
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Wall extends AbstractTile{
   
    @Override
    public boolean isDanger() {
        return false;
    }

    @Override
    public boolean canBeStepped() {
        return false;
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
        return true;
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
