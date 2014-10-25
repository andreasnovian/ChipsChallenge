
package Game;

import Tile.*;
import java.awt.Point;

/**
 * Kelas Stage1 yang merepresentasikan level 1 dalam permainan ini
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage1 extends Board {
 
    /**
     * 
     * @param name
     */
    public Stage1(String name){
        super(5,name);
        mapBoard = new AbstractTile[15][15];
        setMap();
    }
    
    public Point getPlayerPosition(){
        return player.getPosition();
    }
    
    /**
     * 
     */
    @Override
    public void setMap() {
        
    }
     
     public boolean getIsFinished(){
         return isFinished;
     }
}
