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
    public boolean canStep() {
        return true;
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
