
package Game;

import Tile.AbstractTile;
import Tile.BlankTile;
import Tile.Door;
import Tile.Key;
import Tile.Player;
import java.awt.Point;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class Board {

    protected int chipsNeeded;
    protected Player player;
    protected boolean isFinished;
    protected AbstractTile[][] mapBoard;

    public Board(int chipsNeeded, String name){
        this.chipsNeeded = chipsNeeded;
        this.player = new Player(name);
        this.isFinished =false;
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
    public void move(int x , int y){
        int newX = (int)player.getPosition().getX()+x;
        int newY = (int)player.getPosition().getY()+y;
        Point newPosition = new Point(newX , newY);
        if (mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].canBeStepped()){
            /**
             * jika posisi sekarang berada di barrier
             */
            if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isBarrier()){
                /**
                 * jika jumlah chip yang dibutuhkan sama atau tidak dengan chip yang dibawa
                 */
                if(this.chipsNeeded == player.getIntegratedCircuit()){
                    mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
                    player.setPosition(newPosition);
                }
                else{
                    
                }
            /**
             * jika posisi sekarang berada di pintu
             */    
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDoor()){
                Door door = (Door)mapBoard[(int)newPosition.getX()][(int)newPosition.getY()];
                for(int i=0;i<player.getKeysLength();i++){
                    /**
                     * jika warna pintu sama dengan kunci yang dimiliki
                     */
                    if(door.getColor().equalsIgnoreCase(player.getKeysIndex(i))){
                        mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
                        player.setPosition(newPosition);
                    }
                }
            /**
             * jika yang diinjak itu bahaya atau tidak , jika bahaya , lansung kalah
             */
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDanger()){
                player.setLife(false);
                player.setPosition(newPosition);
            /**
             * jika posisi sekarang menginjak di posisi kunci
             */
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isKey()){
                Key newKey = (Key)mapBoard[(int)newPosition.getX()][(int)newPosition.getY()];
                player.setKeys(newKey);
                player.setPosition(newPosition);
                mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
            /**
             * jika posisi sekarang menginjak di posisi Integrated Circuit
             */
            } else if (mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isIntegratedCircuit()){
                player.addIntegratedCircuit();
                player.setPosition(newPosition);
                mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
            }else if (mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isFinish()){
                player.setPosition(newPosition);
                isFinished = true;
            }
            else{
            player.setPosition(newPosition);
            }
        }
        printMap();
    }
        
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
    
    public boolean isPlayerDead(){
        return !player.isLife();
    }
    
    public boolean getIsFinished(){
         return isFinished;
     }
    
}
