package Stage;


import Tile.Barrier;
import Tile.BlankTile;
import Tile.Board;
import Tile.Door;
import Tile.Player;
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
public class Stage1 extends Board {
    private boolean barrierOpened;
    private Player player;
    private Door door;
    
    /**
     * 
     */
    public Stage1(String name){
        player = new Player(name);
        this.chipsNeeded = 3;
        this.barrierOpened = false;
        setMap();
    }

    /**
     * 
     */
    @Override
    public void setMap() {
        for(int i=0;i<mapBoard.length;i++){
            for(int j=0;j<mapBoard[i].length;i++){
                mapBoard[i][j] = new BlankTile();
            }
        }
    }

    @Override
    public void move(Point newPosition) {
        if (mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].canStep()==true){
            /**
             * jika posisi sekarang berada dibarrier
             */
            if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isBarrier()==true){
                /**
                 * jika jumlah chip yang dibutuhkan sama atau tidak dengan chip yang dibawa
                 */
                if(this.chipsNeeded == player.getChips()){
                    mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
                    player.setPosition(newPosition);
                }
            /**
             * jika posisi sekarang berada dipintu
             */    
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDoor()==true){
                Door door = (Door)mapBoard[(int)newPosition.getX()][(int)newPosition.getY()];
                for(int i=0;i<player.getKeys().length;i++){
                    /**
                     * jika jumlah chip yang dibutuhkan sama atau tidak dengan chip yang dibawa
                     */
                    if(door.getColor().equals(player.getKeys())){
                        mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
                        player.setPosition(newPosition);
                    }
                }
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDanger()==true){
                player.setLife(false);
            }
        }else{
            
        }
    }
    
    public void newGame()
    {
        
    }
}
