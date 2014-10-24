package Tile;

import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i13029
 */
public abstract class Board {

    public AbstractTile[][] mapBoard;
    public int chipsNeeded;
    public abstract void setMap();
    public abstract void move(Point newPosition);
    
    public Board(int chipsNeeded){
        this.chipsNeeded = chipsNeeded;
    }
    
}
