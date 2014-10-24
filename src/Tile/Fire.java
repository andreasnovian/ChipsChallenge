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
public class Fire extends AbstractTile{
    
    @Override
    public boolean isDanger() {
        return true;
    }

    @Override
    public boolean canStep() {
        return true;
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
    
    public void setDoorIsOpen(boolean isOpen){
        
    }
}
