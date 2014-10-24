/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tile;

/**
 *
 * @author Dell
 */
public class Door extends AbstractTile{
    
    private String doorColor;
    
    
    public Door(String color){
        this.doorColor = color;
        this.doorIsOpen = false;
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
    
    public void setDoorIsOpen(boolean isOpen){
        doorIsOpen = true;
    }

    
}
