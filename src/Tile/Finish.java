
package Tile;

/**
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
    public boolean isIntegratedCircuit() {
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
    
}

