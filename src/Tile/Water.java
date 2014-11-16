package Tile;

/**
 * Kelas yang merepresentasikan komponen tile water dalam permainan Tile water
 * adalah komponen yang akan mengakhiri permainan dan membuat pemain kalah jika
 * diinjak
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Water extends AbstractTile {

    private int waterPosition;

    public Water(int pos) {
        this.waterPosition = pos;
    }

    @Override
    public boolean isDanger() {
        return true;
    }

    @Override
    public boolean canBeStepped() {
        return true;
    }

    @Override
    public boolean isScript() {
        return false;
    }

    @Override
    public boolean isFinish() {
        return false;
    }

    @Override
    public boolean isBarrier() {
        return false;
    }

    @Override
    public boolean isDoor() {
        return false;
    }

    @Override
    public boolean isKey() {
        return false;
    }

    @Override
    public boolean isWall() {
        return false;
    }

    public int getPost() {
        return waterPosition;
    }

    @Override
    public boolean isComputer() {
        return true;
    }

    @Override
    public boolean isTable() {
        return false;
    }

    @Override
    public boolean isWater() {
        return true;
    }
}
