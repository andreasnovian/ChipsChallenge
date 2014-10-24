package Tile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i13029
 */
public abstract class AbstractTile {
   
    
    /**
     * Method untuk mengecek apakah lantai berbahaya atau tidak.
     */
    public abstract boolean isDanger();
    
    /**
     * Method untuk mengecek apakah lantai dapat diinjak atau tidak.
     */
    public abstract boolean canStep();
    
    /**
     * 
     */
    public abstract boolean isBarrier();
    
    /**
     * 
     * @return 
     */
    public abstract boolean isDoor();
    
    
    /**
     * Method untuk mengecek apakah sudah berada dilantai finish atau tidak.
     */
    public abstract boolean isFinish();
    
}
