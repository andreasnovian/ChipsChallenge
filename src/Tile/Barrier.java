/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tile;

/**
 *
 * @author i13029
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
    
    public void setDoorIsOpen(boolean isOpen){
        
    }

}
