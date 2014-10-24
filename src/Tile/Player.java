package Tile;

import java.awt.Point;
import java.util.ArrayList;

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
    private ArrayList<Key> keyList;
    private Point position;
    
    public Player(String name){
        this.name = name;
        this.life = true;
        int chips = 0;
        this.keyList = new ArrayList<>();
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

    public int getKeysLength() {
        return keyList.size();
    }

    public String getKeysIndex(int index){
        return keyList.get(index).toString();
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

    public void setKeys(Key newKey) {
        keyList.add(newKey);
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    
    
}
