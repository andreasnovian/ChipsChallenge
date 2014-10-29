
package Game;

import Tile.*;
import java.awt.Point;

/**
 * Kelas yang merepresentasikan objek stage 1 pada papan permainan
 * 
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage1 extends Board{

    public Stage1(String name) {
        super(6, name);
        player.setPosition(new Point(9, 1));
        this.setMapPosition();
    }

    @Override
    protected void setWallMapPosition() {
        mapBoard[1][3] = new Wall();mapBoard[1][6] = new Wall();
        mapBoard[2][2] = new Wall();mapBoard[2][3] = new Wall();mapBoard[2][6] = new Wall();mapBoard[2][7] = new Wall();mapBoard[2][8] = new Wall();mapBoard[2][10] = new Wall();mapBoard[2][12] = new Wall();
        mapBoard[3][6] = new Wall();mapBoard[3][10] = new Wall();mapBoard[3][12] = new Wall();
        mapBoard[4][2] = new Wall();mapBoard[4][3] = new Wall();mapBoard[4][6] = new Wall();mapBoard[4][7] = new Wall();mapBoard[4][8] = new Wall();mapBoard[4][9] = new Wall();mapBoard[4][10] = new Wall();mapBoard[4][11] = new Wall();mapBoard[4][12] = new Wall();
        mapBoard[5][3] = new Wall();mapBoard[5][6] = new Wall();mapBoard[5][10] = new Wall();mapBoard[5][12] = new Wall();
        mapBoard[6][1] = new Wall();mapBoard[6][2] = new Wall();mapBoard[6][3] = new Wall();mapBoard[6][6] = new Wall();mapBoard[6][7] = new Wall();mapBoard[6][8] = new Wall();mapBoard[6][10] = new Wall();mapBoard[6][12] = new Wall();
        mapBoard[8][6] = new Wall();
        mapBoard[9][6] = new Wall();mapBoard[9][7] = new Wall();mapBoard[9][8] = new Wall();mapBoard[9][9] = new Wall();mapBoard[9][11] = new Wall();mapBoard[9][12] = new Wall();mapBoard[9][13] = new Wall();
        mapBoard[10][6] = new Wall();mapBoard[10][8] = new Wall();mapBoard[10][12] = new Wall();
        mapBoard[11][6] = new Wall();mapBoard[11][12] = new Wall();
        mapBoard[12][6] = new Wall();mapBoard[12][6] = new Wall();mapBoard[12][8] = new Wall();mapBoard[12][9] = new Wall();mapBoard[12][10] = new Wall();mapBoard[12][11] = new Wall();mapBoard[12][12] = new Wall();
        mapBoard[13][6] = new Wall();
        
        
        
        
    }

    @Override
    protected void setDoorPosition() {
        mapBoard[2][1] = new Door("D");
        mapBoard[2][9] = new Door("F");
        mapBoard[2][11] = new Door("G");
        mapBoard[4][1] = new Door("C");
        mapBoard[6][9] = new Door("B");
        mapBoard[6][11] = new Door("I");
        mapBoard[7][6] = new Door("A");
        mapBoard[9][10] = new Door("E");
        mapBoard[11][8] = new Door("H");
        mapBoard[13][11] = new Door("J");
    }

    @Override
    protected void setKeyPosition() {
        mapBoard[1][2] = new Key("e");
        mapBoard[3][9] = new Key("g");
        mapBoard[3][11] = new Key("h");
        mapBoard[5][2] = new Key("d");
        mapBoard[5][8] = new Key("c");
        mapBoard[5][11] = new Key("j");
        mapBoard[7][2] = new Key("b");
        mapBoard[11][11] = new Key("f");
        mapBoard[12][5] = new Key("a");
        mapBoard[13][10] = new Key("i");
    }

    @Override
    protected void setBarrierPosition() {
        mapBoard[11][13] = new Barrier();
    }

    @Override
    protected void setFinishPosition() {
        mapBoard[10][13] = new Finish();
    }

    @Override
    protected void setTablePosition() {
        
    }

    @Override
    protected void setComputerPosition() {
        mapBoard[1][7] = new Computer(0);
        mapBoard[3][7] = new Computer(0);
        mapBoard[7][1] = new Computer(0);
        mapBoard[8][1] = new Computer(0);
        mapBoard[8][2] = new Computer(0);
        mapBoard[10][7] = new Computer(0);
        mapBoard[10][9] = new Computer(0);
        mapBoard[11][2] = new Computer(0);
        mapBoard[11][3] = new Computer(0);
        mapBoard[11][4] = new Computer(0);
        mapBoard[11][5] = new Computer(0);
        mapBoard[12][2] = new Computer(0);
        mapBoard[12][4] = new Computer(0);
    }

    @Override
    protected void setScriptPosition() {
        mapBoard[1][1] = new Script();
        mapBoard[3][8] = new Script();
        mapBoard[5][7] = new Script();
        mapBoard[11][10] = new Script();
        mapBoard[12][3] = new Script();
        mapBoard[13][12] = new Script();
    }
    
}
