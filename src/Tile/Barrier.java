
package Tile;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Barrier extends AbstractTile{

    /**
     * 
     * @return 
     */
    @Override
    public boolean isDanger() {
        return false;
    }
        
    /**
     * 
     * @param requireChip
     * @param chips
     * @return 
     */
    public boolean canStepBarrier(int level , int chips) {
        if(level+2 == chips){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public boolean isFinish() {
        return false;
    }

    @Override
    public boolean canStep() {
        return true;
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

}
