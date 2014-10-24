
package Tile;

/**
 * Kelas yang merepresentasikan tile Pintu 
 * Tile ini hanya dapat dilewati dengan kunci yang tepat
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Door extends AbstractTile{
    
    private String doorColor;
    
    public Door(String color){
        this.doorColor = color;
    }
    
    public String getColor(){
        return this.doorColor;
    }

    @Override
    public boolean isDanger() {
        return false;
    }

    @Override
    public boolean canStep() {
        return true;
    }

    @Override
    public boolean isBarrier() {
        return false;
    }

    @Override
    public boolean isDoor() {
        return true;
    }

    @Override
    public boolean isFinish() {
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
