
package Tile;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Key extends AbstractTile{

    private String colorKey;
    
    public Key(String name){
        colorKey = name;
    }
    public String getColorKey(){
        return colorKey;
    }
    
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
    public boolean isBarrier() {
        return false;
    }

    @Override
    public boolean isDoor() {
        return false;
    }

    @Override
    public boolean isKey() {
        return true;
    }

    @Override
    public boolean isFinish() {
        return false; 
    }

    @Override
    public boolean isWall() {
        return false;
    }
    
}
