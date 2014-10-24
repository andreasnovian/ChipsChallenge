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
public class Player {
    private String name;
    private boolean life;
    private int chips;
    private Object[] keys;
    private Point position;
    
    public Player(String name){
        this.name = name;
        this.life = true;
        int chips = 0;
        this.keys= new Object[5];
        this.position = new Point(10 , 10);
    }

    public String getName() {
        return name;
    }

    public boolean isLife() {
        return life;
    }

    public int getChips() {
        return chips;
    }

    public Object[] getKeys() {
        return keys;
    }

    public String getKeysIndex(int index){
        return keys[index].toString();
    }
    
    public Point getPosition() {
        return position;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public void setKeys(Object[] keys) {
        this.keys = keys;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    
    
}
