
package Game;

import Tile.AbstractTile;
import Tile.Player;
import java.awt.Point;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class Board {

    protected int chipsNeeded;
    protected Player player;
    protected AbstractTile[][] mapBoard;

    public Board(int chipsNeeded, String name){
        this.chipsNeeded = chipsNeeded;
        this.player = new Player(name);
        mapBoard = new AbstractTile[20][20];
    }
    
    /**
     * 
     */
    public abstract void setMap();
    
    /**
     * 
     * @param x
     * @param y 
     */
    public abstract void move(int x , int y);
        
    /**
     * 
     */
    public void printMap(){
        int positionX = player.getPosition().x;
        int positionY = player.getPosition().y;
        
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if (positionX==i && positionY==j){
                    System.out.print("P ");
                }
                else if(mapBoard[i][j].isDanger()){
                    System.out.print("A ");
                }
                else if(mapBoard[i][j].isBarrier()){
                    System.out.print("B ");
                }
                else if(mapBoard[i][j].isDoor()){
                    System.out.print("D ");
                }
                else if(mapBoard[i][j].isFinish()){
                    System.out.print("F ");
                }
                else if(mapBoard[i][j].isKey()){
                    System.out.print("K ");
                }
                else if(mapBoard[i][j].isWall()){
                    System.out.print("W ");
                }
                else if(mapBoard[i][j].isIntegratedCircuit()){
                    System.out.print("I ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println("");
        }
        
    }
}
