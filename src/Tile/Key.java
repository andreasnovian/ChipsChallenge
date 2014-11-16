
package Tile;

/**
 * Kelas yang merepresentasikan komponen tile key atau kunci dalam permainan
 * Tile Key atau kunci adalah komponen yang harus dimiliki oleh pemain untuk dapat melewati pintu yang sesuai dengan kunci
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
    public boolean isScript() {
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
