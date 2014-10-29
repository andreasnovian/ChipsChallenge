
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile finish dalam permainan
 * Tile finish adalah komponen yang akan mengakhiri permainan dan membuat pemain menang jika diinjak
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Finish extends AbstractTile{

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
        return true;
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

