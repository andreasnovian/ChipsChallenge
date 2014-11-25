package Game;

import GUI.Interface;
import Tile.*;
import java.awt.Point;

/**
 * Kelas yang merepresentasikan stage 3 pada papan permainan
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage3 extends Board {

    public Stage3(Interface view) {
        super(view, 8, new Point(7, 1));
    }

    @Override
    protected void setBlankTile() {
        for (int i = 0; i < mapBoard.length; i++) {
            for (int j = 0; j < mapBoard.length; j++) {
                mapBoard[i][j] = new BlankTile();
            }
        }
    }

    @Override
    protected void setBarrier() {
        mapBoard[6][12] = new Barrier();
    }

    @Override
    protected void setComputer() {
        mapBoard[2][5] = new Computer();
        mapBoard[4][5] = new Computer();
        mapBoard[9][4] = new Computer();
        mapBoard[9][10] = new Computer();
        mapBoard[10][4] = new Computer();
        mapBoard[11][10] = new Computer();
        mapBoard[11][4] = new Computer();
        mapBoard[12][4] = new Computer();
        mapBoard[13][4] = new Computer();
        mapBoard[13][10] = new Computer();
    }

    @Override
    protected void setDeadElectricity() {
        mapBoard[7][10] = new DeadElectricity();
    }

    @Override
    protected void setDoor() {
        mapBoard[2][1] = new Door("H");
        mapBoard[1][11] = new Door("D");
        mapBoard[3][4] = new Door("C");
        mapBoard[4][11] = new Door("E");
        mapBoard[10][3] = new Door("A");
        mapBoard[10][11] = new Door("F");
        mapBoard[12][3] = new Door("B");
        mapBoard[12][11] = new Door("G");
    }

    @Override
    protected void setExGirlfriend() {
        mapBoard[4][12] = new ExGirlfriend();
        mapBoard[5][2] = new ExGirlfriend();
    }

    @Override
    protected void setFinish() {
        mapBoard[6][13] = new Finish();
    }

    @Override
    protected void setKey() {
        mapBoard[1][1] = new Key("e");
        mapBoard[2][3] = new Key("b");
        mapBoard[3][13] = new Key("d");
        mapBoard[10][1] = new Key("c");
        mapBoard[9][9] = new Key("a");
        mapBoard[9][13] = new Key("g");
        mapBoard[13][1] = new Key("f");
        mapBoard[12][13] = new Key("h");
    }

    @Override
    protected void setPeace() {
        mapBoard[13][12] = new Peace();
    }

    @Override
    protected void setScript() {
        mapBoard[1][3] = new Script();
        mapBoard[1][13] = new Script();
        mapBoard[5][1] = new Script();
        mapBoard[6][11] = new Script();
        mapBoard[9][1] = new Script();
        mapBoard[10][13] = new Script();
        mapBoard[12][1] = new Script();
        mapBoard[13][13] = new Script();
    }

    @Override
    protected void setWall() {
        for (int i = 0; i < mapBoard.length; i++) {
            mapBoard[0][i] = new Wall();
            mapBoard[mapBoard.length - 1][i] = new Wall();
        }
        for (int i = 0; i < mapBoard.length; i++) {
            mapBoard[i][0] = new Wall();
            mapBoard[i][mapBoard.length - 1] = new Wall();
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
        mapBoard[7][13] = new Wall();
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
    }

}
