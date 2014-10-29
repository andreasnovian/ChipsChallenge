
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile computer dalam permainan
 * Tile computer adalah komponen yang akan mengakhiri permainan dan membuat pemain kalah jika diinjak
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Computer extends AbstractTile{
    private int computerPosition;
    public Computer(int pos){
        this.computerPosition=pos;
    }
    @Override
    public boolean isDanger() {
        return true;
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
    
    public int getPost(){
        return computerPosition;
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
