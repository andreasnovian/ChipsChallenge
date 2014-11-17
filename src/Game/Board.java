package Game;

import GUI.Interface;
import Tile.*;
import java.awt.Point;

/**
 * Kelas yang merepresentasikan papan permainan dalam permainan
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public abstract class Board {

    private Interface view;
    protected int ScriptNeeded;
    protected Player player;
    protected boolean isFinished;
    protected AbstractTile[][] mapBoard;

    public Board(Interface view, int scriptNeeded, String name) {
        this.view = view;
        this.ScriptNeeded = scriptNeeded;
        this.player = new Player(name);
        this.isFinished = false;
        this.mapBoard = new AbstractTile[15][15];
    }

    public void move(int x, int y) {
        int newX = (int) this.player.getPosition().getX() + x;
        int newY = (int) this.player.getPosition().getY() + y;
        Point newPosition = new Point(newX, newY);
        if (this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].canBeStepped()) {
            /**
             * jika posisi sekarang berada di barrier
             */
            if (this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].isBarrier()) {
                /**
                 * jika jumlah chip yang dibutuhkan sama atau tidak dengan chip
                 * yang dibawa
                 */
                if (this.ScriptNeeded == this.player.getScript()) {
                    this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()] = new BlankTile();
                    this.player.setPosition(newPosition);
                } else {

                }
                /**
                 * jika posisi sekarang berada di pintu
                 */
            } else if (this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].isDoor()) {
                Door door = (Door) this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()];
                for (int i = 0; i < this.player.getKeysLength(); i++) {
                    /**
                     * jika warna pintu sama dengan kunci yang dimiliki
                     */
                    if (door.getColor().equalsIgnoreCase(this.player.getKeysIndex(i))) {
                        this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()] = new BlankTile();
                        this.player.setPosition(newPosition);
                    }
                }
                /**
                 * jika yang diinjak itu bahaya atau tidak , jika bahaya ,
                 * lansung kalah
                 */
            } else if (this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].isDanger()) {
                this.player.setLife(false);
                this.player.setPosition(newPosition);
                /**
                 * jika posisi sekarang menginjak di posisi kunci
                 */
            } else if (this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].isKey()) {
                Key newKey = (Key) this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()];
                this.player.setKeys(newKey);
                this.player.setPosition(newPosition);
                this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()] = new Table();
                /**
                 * jika posisi sekarang menginjak di posisi Integrated Circuit
                 */
            } else if (mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].isScript()) {
                this.player.addScript();
                this.player.setPosition(newPosition);
                this.mapBoard[(int) newPosition.getX()][(int) newPosition.getY()] = new Table();
            } else if (mapBoard[(int) newPosition.getX()][(int) newPosition.getY()].isFinish()) {
                this.player.setPosition(newPosition);
                this.isFinished = true;
            } else {
                this.player.setPosition(newPosition);
            }
        }
        printMap();
    }

    public String[][] printMap() {
        String[][] map = new String[this.mapBoard.length][this.mapBoard[0].length];
        int positionX = this.player.getPosition().x;
        int positionY = this.player.getPosition().y;

        for (int i = 0; i < this.mapBoard.length; i++) {
            for (int j = 0; j < this.mapBoard.length; j++) {
                if (positionX == i && positionY == j) {
                    map[i][j] = "Player";
                } else if (this.mapBoard[i][j].isDanger()) {
                    map[i][j] = "Computer";
                } else if (this.mapBoard[i][j].isBarrier()) {
                    map[i][j] = "Barrier";
                } else if (this.mapBoard[i][j].isDoor()) {
                    Door door = (Door) this.mapBoard[i][j];
                    map[i][j] = door.getColor();
                } else if (this.mapBoard[i][j].isFinish()) {
                    map[i][j] = "Finish";
                } else if (this.mapBoard[i][j].isKey()) {
                    Key key = (Key) this.mapBoard[i][j];
                    map[i][j] = key.getColorKey();
                } else if (this.mapBoard[i][j].isWall()) {
                    map[i][j] = "Wall";
                } else if (this.mapBoard[i][j].isScript()) {
                    map[i][j] = "Script";
                } else if (this.mapBoard[i][j].isTable()) {
                    map[i][j] = "Table";
                } else {
                    map[i][j] = "Blank";
                }
            }
            
        }

        return map;
    }

    public boolean isPlayerDead() {
        return !player.isLife();
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinish) {
        isFinished = isFinish;
    }

    public Point getPlayerPosition() {
        return player.getPosition();
    }

    protected void setMapPosition() {
        this.setAllBlankTilePosition();
        this.setWallBorderPosition();
        this.setBarrierPosition();
        this.setComputerPosition();
        this.setDoorPosition();
        this.setFinishPosition();
        this.setKeyPosition();
        this.setScriptPosition();
        this.setTablePosition();
        this.setWallMapPosition();
    }

    private void setAllBlankTilePosition() {
        for (int i = 0; i < mapBoard.length; i++) {
            for (int j = 0; j < mapBoard.length; j++) {
                mapBoard[i][j] = new BlankTile();
            }
        }
    }

    private void setWallBorderPosition() {
        for (int i = 0; i < mapBoard.length; i++) {
            mapBoard[0][i] = new Wall();
            mapBoard[mapBoard.length - 1][i] = new Wall();
        }
        for (int i = 0; i < mapBoard.length; i++) {
            mapBoard[i][0] = new Wall();
            mapBoard[i][mapBoard.length - 1] = new Wall();
        }
    }

    protected abstract void setWallMapPosition();

    protected abstract void setTablePosition();

    protected abstract void setDoorPosition();

    protected abstract void setKeyPosition();

    protected abstract void setComputerPosition();

    protected abstract void setScriptPosition();

    protected abstract void setBarrierPosition();

    protected abstract void setFinishPosition();

}
