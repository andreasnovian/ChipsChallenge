
package Game;

import Tile.*;
import java.awt.Point;

/**
 * Kelas Stage1 yang merepresentasikan level 1 dalam permainan ini
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage3 extends Board {
 
    /**
     * 
     * @param name
     */
    public Stage3(String name){
        super(8,name);
        mapBoard = new AbstractTile[15][15];
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
        /**
         * Membuat Blank Tile 
         */
        for(int i=0 ;i<20;i++){
            for(int j = 0 ; j<20 ;j++){
                mapBoard[i][j]= new BlankTile();
            }
        }
        
        
        /**
         * Buat Wall
         */
        for(int i=0;i<20;i+=19){
            for(int j = 0;j<20;j++){
                mapBoard[i][j] = new Wall();
            }
        }
        
        for(int i=0;i<20;i++){
            mapBoard[i][0] = new Wall();
            mapBoard[i][19] = new Wall();
        }
        
        mapBoard[1][2] = new Wall();
        mapBoard[1][4] = new Wall();
        mapBoard[2][2] = new Wall();
        mapBoard[2][4] = new Wall();
        mapBoard[2][11] = new Wall();
        mapBoard[2][12] = new Wall();
        mapBoard[2][13] = new Wall();
        mapBoard[3][11] = new Wall();
        mapBoard[4][4] = new Wall();
        mapBoard[5][4] = new Wall();
        mapBoard[5][11] = new Wall();
        mapBoard[5][12] = new Wall();
        mapBoard[5][13] = new Wall();
        mapBoard[6][1] = new Wall();
        mapBoard[6][2] = new Wall();
        mapBoard[6][3] = new Wall();
        mapBoard[6][4] = new Wall();
        mapBoard[7][11] = new Wall();
        mapBoard[7][12] = new Wall();
        mapBoard[8][1] = new Wall();
        mapBoard[8][2] = new Wall();
        mapBoard[8][3] = new Wall();
        mapBoard[8][4] = new Wall();
        mapBoard[8][8] = new Wall();
        mapBoard[8][9] = new Wall();
        mapBoard[8][10] = new Wall();
        mapBoard[8][11] = new Wall();
        mapBoard[8][12] = new Wall();
        mapBoard[8][13] = new Wall();
        mapBoard[9][3] = new Wall();
        mapBoard[9][8] = new Wall();
        mapBoard[9][11] = new Wall();
        mapBoard[11][1] = new Wall();
        mapBoard[11][2] = new Wall();
        mapBoard[11][3] = new Wall();
        mapBoard[11][11] = new Wall();
        mapBoard[11][12] = new Wall();
        mapBoard[11][13] = new Wall();
        mapBoard[13][3] = new Wall();
        mapBoard[13][11] = new Wall();

        /**
         * Buat Pintu
         */
        mapBoard[1][1] = new Door("8");
        mapBoard[1][11] = new Door("4");
        mapBoard[3][4] = new Door("3");
        mapBoard[4][11] = new Door("5");
        mapBoard[10][3] = new Door("1");
        mapBoard[10][11] = new Door("6");
        mapBoard[12][3] = new Door("2");
        mapBoard[12][11] = new Door("7");
        
        
    }
     
     
}
