package Game;

import GUI.Interface;
import Tile.*;
import java.awt.Point;

/**
 * Kelas yang merepresentasikan stage 2 pada papan permainan
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Stage2 extends Board {

    public Stage2(Interface view){
        super(view, 7, new Point(11, 1));
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
        mapBoard[6][3] = new Barrier();
    }

    @Override
    protected void setComputer() {
        mapBoard[2][1] = new Computer();
        mapBoard[13][3] = new Computer();
        mapBoard[13][9] = new Computer();
        mapBoard[10][5] = new Computer();
    }

    @Override
    protected void setDeadElectricity() {
        mapBoard[6][6] = new DeadElectricity();
    }

    @Override
    protected void setDoor() {
        mapBoard[3][6] = new Door("M");
        mapBoard[3][13] = new Door("L");
        mapBoard[4][2] = new Door("A");
        mapBoard[4][12] = new Door("N");
        mapBoard[5][13] = new Door("K");
        mapBoard[7][3] = new Door("F");
        mapBoard[7][7] = new Door("C");
        mapBoard[7][9] = new Door("J");
        mapBoard[8][12] = new Door("I");
        mapBoard[9][7] = new Door("D");
        mapBoard[9][9] = new Door("G");
        mapBoard[11][2] = new Door("B");
        mapBoard[12][5] = new Door("E");
        mapBoard[13][11] = new Door("H");
    }

    @Override
    protected void setExGirlfriend() {
        mapBoard[2][6] = new ExGirlfriend();
        mapBoard[8][11] = new ExGirlfriend();
    }

    @Override
    protected void setFinish() {
        mapBoard[6][4] = new Finish();
    }

    @Override
    protected void setKey() {
        mapBoard[1][1] = new Key("m");
        mapBoard[4][3] = new Key("c");
        mapBoard[4][2] = new Key("b");
        mapBoard[4][6] = new Key("n");
        mapBoard[6][7] = new Key("d");
        mapBoard[6][10] = new Key("k");
        mapBoard[6][11] = new Key("l");
        mapBoard[10][6] = new Key("e");
        mapBoard[10][9] = new Key("j");
        mapBoard[10][10] = new Key("h");
        mapBoard[13][1] = new Key("a");
        mapBoard[12][12] = new Key("i");
        mapBoard[12][4] = new Key("f");
        mapBoard[13][10] = new Key("g");
    }

    @Override
    protected void setPeace() {
        mapBoard[12][10] = new Peace();
    }

    @Override
    protected void setScript() {
        mapBoard[1][6] = new Script();
        mapBoard[4][8] = new Script();
        mapBoard[4][10] = new Script();
        mapBoard[6][9] = new Script();
        mapBoard[10][11] = new Script();
        mapBoard[12][1] = new Script();
        mapBoard[12][9] = new Script();
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
        mapBoard[1][4] = new Wall();
        mapBoard[1][8] = new Wall();
        mapBoard[1][12] = new Wall();
        mapBoard[1][13] = new Wall();
        mapBoard[2][2] = new Wall();
        mapBoard[2][10] = new Wall();
        for (int i = 1; i < 6; i++) {
            mapBoard[3][i] = new Wall();
        }
        for (int i = 7; i < 13; i++) {
            mapBoard[3][i] = new Wall();
        }
        mapBoard[4][5] = new Wall();
        mapBoard[4][9] = new Wall();
        for (int i = 2; i < 13; i++) {
            mapBoard[5][i] = new Wall();
        }
        mapBoard[6][2] = new Wall();
        mapBoard[6][5] = new Wall();
        mapBoard[6][8] = new Wall();
        mapBoard[6][12] = new Wall();
        mapBoard[7][2] = new Wall();
        mapBoard[7][4] = new Wall();
        mapBoard[7][5] = new Wall();
        mapBoard[7][6] = new Wall();
        mapBoard[7][8] = new Wall();
        mapBoard[7][10] = new Wall();
        mapBoard[7][11] = new Wall();
        mapBoard[7][12] = new Wall();
        mapBoard[8][2] = new Wall();
        mapBoard[9][2] = new Wall();
        mapBoard[9][4] = new Wall();
        mapBoard[9][5] = new Wall();
        mapBoard[9][6] = new Wall();
        mapBoard[9][8] = new Wall();
        mapBoard[9][10] = new Wall();
        mapBoard[9][11] = new Wall();
        mapBoard[9][12] = new Wall();
        mapBoard[10][2] = new Wall();
        mapBoard[10][4] = new Wall();
        mapBoard[10][8] = new Wall();
        mapBoard[10][12] = new Wall();
        for (int i = 4; i < 13; i++) {
            mapBoard[11][i] = new Wall();
        }
        mapBoard[12][2] = new Wall();
        mapBoard[12][6] = new Wall();
        mapBoard[12][11] = new Wall();
        mapBoard[13][2] = new Wall();
        mapBoard[13][4] = new Wall();
        mapBoard[13][8] = new Wall();
    }

}
