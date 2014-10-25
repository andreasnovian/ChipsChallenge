
package Game;

import Tile.*;
import java.awt.Point;

/**
 * Kelas Stage1 yang merepresentasikan level 1 dalam permainan ini
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage1 extends Board {
    private boolean isFinished;
 
    /**
     * 
     * @param name
     */
    public Stage1(String name){
        super(3,name);
        isFinished =false;
        mapBoard = new AbstractTile[20][20];
        setMap();
    }
    
    public Point getPlayerPosition(){
        return player.getPosition();
    }
    
    /**
     * 
     */
    @Override
    public void setMap() {
        for(int i=0 ;i<20;i++){
            for(int j = 0 ; j<20 ;j++){
                mapBoard[i][j]= new BlankTile();
            }
        }
        
        for(int i=0;i<20;i+=19){
            for(int j = 0;j<20;j++){
                mapBoard[i][j] = new Wall();
            }
        }
        
        for(int i=0;i<20;i++){
            mapBoard[i][0] = new Wall();
            mapBoard[i][19] = new Wall();
        }
        
        for(int i=5 ; i<15 ; i+=9){
            for(int j = 5;j<15;j++){
                mapBoard[i][j] = new Wall();
            }
        }
        
        for(int i=5;i<14;i++){
            mapBoard[i][5] = new Wall();
            mapBoard[i][14] = new Wall();
        }
        
        mapBoard[4][10] = new Finish();
        mapBoard[11][6] = new Key("Red");
        mapBoard[12][6] = new Fire();
        mapBoard[5][10] = new Barrier();
        mapBoard[5][13] = new Door("Red");
        mapBoard[6][7] = new IntegratedCircuit();
        mapBoard[6][8] = new IntegratedCircuit();
        mapBoard[6][9] = new IntegratedCircuit();
        
        
    }

    @Override
     public void move(int x,int y) {
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
     
     public boolean getIsFinished(){
         return isFinished;
     }
}
