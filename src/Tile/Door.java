
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile door atau pintu dalam permainan
 * Tile Door atau pintu adalah komponen yang hanya bisa dilewati setelah pemain mempunyai kunci yang sesuai untuk pintu yang akan dilewati
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
    public boolean canBeStepped() {
        return true;
    }

    @Override
    public boolean isScript() {
        return false;
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

    @Override
    public boolean isComputer() {
        return true;
    }

    @Override
    public boolean isTable() {
        return false;
    }
       
}
