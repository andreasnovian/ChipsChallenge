
package Game;

import Tile.*;
import java.awt.Point;
import java.util.ArrayList;

/**
 * Kelas yang merepresentasikan objek pemain pada papan permainan
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Player {
    private final String name;
    private boolean life;
    private int script;
    private ArrayList<Key> keyList;
    private Point position;
    
    public Player(String name){
        this.name = name;
        this.life = true;
        this.script = 0;
        this.keyList = new ArrayList<>();
        this.position = new Point(10 , 10);
    }

    public String getName() {
        return name;
    }

    public boolean isLife() {
        return life;
    }

    public int getScript() {
        return script;
    }
    
    public void addScript(){
        this.script++;
    }

    public int getKeysLength() {
        return keyList.size();
    }

    public String getKeysIndex(int index){
        return keyList.get(index).getColorKey();
    }
    
    public Point getPosition() {
        return position;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public void setKeys(Key newKey) {
        keyList.add(newKey);
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    
    
}
