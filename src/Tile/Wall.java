/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tile;

import javax.swing.text.AbstractDocument;

/**
 *
 * @author i13029
 */
public class Wall extends AbstractTile{
   
    @Override
    public boolean isDanger() {
        return false;
    }

    @Override
    public boolean canStep() {
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
        return true;
    }
    
}
