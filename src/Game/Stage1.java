
package Game;

import Tile.*;
import java.awt.Point;

/**
 * Kelas Stage1 yang merepresentasikan level 1 dalam permainan ini
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage1 extends Board {
    private Player player;
    
    /**
     * 
     * @param name
     */
    public Stage1(String name){
        player = new Player(name);
        mapBoard = new AbstractTile[20][20];
        this.chipsNeeded = 3;
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
        mapBoard[5][10] = new Barrier();
        mapBoard[5][13] = new Door("Red");
        mapBoard[11][7] = new IntegratedCircuit();
        mapBoard[11][8] = new IntegratedCircuit();
        mapBoard[11][9] = new IntegratedCircuit();
        
        
    }

    @Override
     public void move(int x,int y) {
        int xNow = (int)player.getPosition().getX()+x;
        int yNow = (int)player.getPosition().getY()+y;
        Point newPosition = new Point(xNow , yNow);
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
                else{
                    
                }
            /**
             * jika posisi sekarang berada di pintu
             */    
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDoor()==true){
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
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isDanger()==true){
                player.setLife(false);
            /**
             * jika posisi sekarang menginjak di posisi kunci
             */
            }else if(mapBoard[(int)newPosition.getX()][(int)newPosition.getY()].isKey()==true){
                Key newKey = (Key)mapBoard[(int)newPosition.getX()][(int)newPosition.getY()];
                player.setKeys(newKey);
                player.setPosition(newPosition);
                mapBoard[(int)newPosition.getX()][(int)newPosition.getY()] = new BlankTile();
            }else{
            player.setPosition(newPosition);
            }
        }
        printMap();
    }
    
     
     
     
     
     
     
    public void printMap(){
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if(mapBoard[i][j].isBarrier()){
                    if(player.getPosition().getX()==i && player.getPosition().getY()==j){
                        System.out.print("P ");
                    }else{
                        System.out.print("B ");
                    }
                }
                else if(mapBoard[i][j].isDoor()){
                    if(player.getPosition().getX()==i && player.getPosition().getY()==j){
                        System.out.print("P ");
                    }else{
                        System.out.print("D ");
                    }
                }
                else if(mapBoard[i][j].isFinish()){
                    if(player.getPosition().getX()==i && player.getPosition().getY()==j){
                        System.out.print("P ");
                    }else{
                        System.out.print("F ");
                    }
                }
                else if(mapBoard[i][j].isKey()){
                    if(player.getPosition().getX()==i && player.getPosition().getY()==j){
                        System.out.print("P ");
                    }else{
                        System.out.print("K ");
                    }
                }
                else if(mapBoard[i][j].isWall()){
                    if(player.getPosition().getX()==i && player.getPosition().getY()==j){
                        System.out.print("P ");
                    }else{
                        System.out.print("W ");
                    }
                }else if(player.getPosition().getX()==i && player.getPosition().getY()==j){
                    System.out.print("P ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println("");
        }
        
    }
}
