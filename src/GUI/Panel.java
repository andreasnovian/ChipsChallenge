package GUI;

import Game.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

/**
 * Kelas yang digunakan untuk membantu kelas Interface melakukan visualisasi
 * papan permainan. Kelas ini merupakan View dalam project ini
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class Panel extends JPanel implements KeyListener {

    /**
     * Atribut untuk menyimpan lebar kanvas
     */
    public static final int CANVAS_WIDTH = 600;

    /**
     * Atribut untuk menyimpan tinggi kanvass
     */
    public static final int CANVAS_HEIGHT = 600;

    /**
     * Atribut untuk menyimpan objek dari kelas Interface yang akan menampilkan
     * isi dari objek kelas ini
     */
    private Interface view;

    /**
     * Atribut untuk menyimpan objek Image yang akan ditampilkan
     */
    private Image[][] img = new Image[15][15];

    /**
     * Atribut untuk menyimpan objek Board
     */
    private Board board;

    /**
     * Atribut untuk menyimpan objek Graphics yang digunakan untuk menggambar
     * isi panel
     */
    private Graphics g;

    /**
     * Atribut untuk menyimpan posisi menghadap player
     */
    private int posPlayer;

    /**
     * Atribut untuk menyimpan posisi stage yang sedang dimainkan
     */
    private int stage;

    /**
     * Atribut bertipe array of URL untuk menyimpan alamat tempat menyimpan tiap
     * komponen
     */
    private URL[] playerUrl, barrierUrl, blankTileUrl, computerUrl, deadElectricityUrl, doorUrl, exGirlfriendUrl, finishUrl, keyUrl, peaceUrl, scriptUrl, wallUrl;

    public Panel(Interface view, int stage) {
        this.view = view;
        this.stage = stage;
        switch (stage) {
            case 1:
                this.board = new Stage1(view);
                break;
            case 2:
                this.board = new Stage2(view);
                break;
            case 3:
                this.board = new Stage3(view);
                break;
        }
        addKeyListener(this);
        this.posPlayer = 1;
        this.loadImage();
        this.setImage();
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    }

    /**
     * Method untuk melakukan inisialisasi pada tiap atribut
     */
    private void loadImage() {
        playerUrl = new URL[10];
        playerUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/brianStandUp.png");
        playerUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/brianStandDown.png");
        playerUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/brianUp.png");
        playerUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/brianDown.png");
        playerUrl[4] = getClass().getClassLoader().getResource("GUI/Characters/brianRight.png");
        playerUrl[5] = getClass().getClassLoader().getResource("GUI/Characters/brianLeft.png");
        playerUrl[6] = getClass().getClassLoader().getResource("GUI/Characters/brianSitUp.png");
        playerUrl[7] = getClass().getClassLoader().getResource("GUI/Characters/brianSitDown.png");
        playerUrl[8] = getClass().getClassLoader().getResource("GUI/Characters/brianSitRight.png");
        playerUrl[9] = getClass().getClassLoader().getResource("GUI/Characters/brianSitLeft.png");

        barrierUrl = new URL[1];
        barrierUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/table.png");

        blankTileUrl = new URL[1];
        blankTileUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/blankTile.png");

        computerUrl = new URL[4];
        computerUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/computerUp.png");
        computerUrl[1] = getClass().getClassLoader().getResource("GUI/Rooms/computerDown.png");
        computerUrl[2] = getClass().getClassLoader().getResource("GUI/Rooms/computerRight.png");
        computerUrl[3] = getClass().getClassLoader().getResource("GUI/Rooms/computerLeft.png");

        deadElectricityUrl = new URL[1];
        deadElectricityUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/deadElectricity.png");

        doorUrl = new URL[14];
        doorUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/doorA.png");
        doorUrl[1] = getClass().getClassLoader().getResource("GUI/Rooms/doorB.png");
        doorUrl[2] = getClass().getClassLoader().getResource("GUI/Rooms/doorC.png");
        doorUrl[3] = getClass().getClassLoader().getResource("GUI/Rooms/doorD.png");
        doorUrl[4] = getClass().getClassLoader().getResource("GUI/Rooms/doorE.png");
        doorUrl[5] = getClass().getClassLoader().getResource("GUI/Rooms/doorF.png");
        doorUrl[6] = getClass().getClassLoader().getResource("GUI/Rooms/doorG.png");
        doorUrl[7] = getClass().getClassLoader().getResource("GUI/Rooms/doorH.png");
        doorUrl[8] = getClass().getClassLoader().getResource("GUI/Rooms/doorI.png");
        doorUrl[9] = getClass().getClassLoader().getResource("GUI/Rooms/doorJ.png");
        doorUrl[10] = getClass().getClassLoader().getResource("GUI/Rooms/doorK.png");
        doorUrl[11] = getClass().getClassLoader().getResource("GUI/Rooms/doorL.png");
        doorUrl[12] = getClass().getClassLoader().getResource("GUI/Rooms/doorM.png");
        doorUrl[13] = getClass().getClassLoader().getResource("GUI/Rooms/doorN.png");

        exGirlfriendUrl = new URL[4];
        exGirlfriendUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/exGirlfriendUp.png");
        exGirlfriendUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/exGirlfriendDown.png");
        exGirlfriendUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/exGirlfriendRight.png");
        exGirlfriendUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/exGirlfriendLeft.png");

        finishUrl = new URL[12];
        finishUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/candraUp.png");
        finishUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/candraDown.png");
        finishUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/candraRight.png");
        finishUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/candraLeft.png");
        finishUrl[4] = getClass().getClassLoader().getResource("GUI/Characters/paskalUp.png");
        finishUrl[5] = getClass().getClassLoader().getResource("GUI/Characters/paskalDown.png");
        finishUrl[6] = getClass().getClassLoader().getResource("GUI/Characters/paskalRight.png");
        finishUrl[7] = getClass().getClassLoader().getResource("GUI/Characters/paskalLeft.png");
        finishUrl[8] = getClass().getClassLoader().getResource("GUI/Characters/mariskaUp.png");
        finishUrl[9] = getClass().getClassLoader().getResource("GUI/Characters/mariskaDown.png");
        finishUrl[10] = getClass().getClassLoader().getResource("GUI/Characters/mariskaRight.png");
        finishUrl[11] = getClass().getClassLoader().getResource("GUI/Characters/mariskaLeft.png");

        keyUrl = new URL[14];
        keyUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/keyA.png");
        keyUrl[1] = getClass().getClassLoader().getResource("GUI/Rooms/keyB.png");
        keyUrl[2] = getClass().getClassLoader().getResource("GUI/Rooms/keyC.png");
        keyUrl[3] = getClass().getClassLoader().getResource("GUI/Rooms/keyD.png");
        keyUrl[4] = getClass().getClassLoader().getResource("GUI/Rooms/keyE.png");
        keyUrl[5] = getClass().getClassLoader().getResource("GUI/Rooms/keyF.png");
        keyUrl[6] = getClass().getClassLoader().getResource("GUI/Rooms/keyG.png");
        keyUrl[7] = getClass().getClassLoader().getResource("GUI/Rooms/keyH.png");
        keyUrl[8] = getClass().getClassLoader().getResource("GUI/Rooms/keyI.png");
        keyUrl[9] = getClass().getClassLoader().getResource("GUI/Rooms/keyJ.png");
        keyUrl[10] = getClass().getClassLoader().getResource("GUI/Rooms/keyK.png");
        keyUrl[11] = getClass().getClassLoader().getResource("GUI/Rooms/keyL.png");
        keyUrl[12] = getClass().getClassLoader().getResource("GUI/Rooms/keyM.png");
        keyUrl[13] = getClass().getClassLoader().getResource("GUI/Rooms/keyN.png");

        peaceUrl = new URL[1];
        peaceUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/rose.png");

        scriptUrl = new URL[1];
        scriptUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/script.png");

        wallUrl = new URL[1];
        wallUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/wall.png");
    }

    private void setImage() {
        String[][] map = board.printMap();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                switch (map[i][j]) {
                    case "Player":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(playerUrl[this.posPlayer]);
                        break;
                    case "Tile.Computer":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(computerUrl[0]);
                        break;
                    case "Tile.Barrier":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(barrierUrl[0]);
                        break;
                    case "Tile.Finish":
                        if (this.stage == 1) {
                            img[i][j] = Toolkit.getDefaultToolkit().getImage(finishUrl[5]);
                        } else if (this.stage == 2) {
                            img[i][j] = Toolkit.getDefaultToolkit().getImage(finishUrl[3]);
                        } else if (this.stage == 3) {
                            img[i][j] = Toolkit.getDefaultToolkit().getImage(finishUrl[11]);
                        }
                        break;
                    case "Tile.Wall":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(wallUrl[0]);
                        break;
                    case "Tile.Script":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(scriptUrl[0]);
                        break;
                    case "Tile.BlankTile":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(blankTileUrl[0]);
                        break;
                    case "Tile.DeadElectricity":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(deadElectricityUrl[0]);
                        break;
                    case "Tile.ExGirlfriend":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(exGirlfriendUrl[0]);
                        break;
                    case "Tile.Peace":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(peaceUrl[0]);
                        break;
                    case "A":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[0]);
                        break;
                    case "B":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[1]);
                        break;
                    case "C":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[2]);
                        break;
                    case "D":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[3]);
                        break;
                    case "E":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[4]);
                        break;
                    case "F":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[5]);
                        break;
                    case "G":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[6]);
                        break;
                    case "H":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[7]);
                        break;
                    case "I":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[8]);
                        break;
                    case "J":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[9]);
                        break;
                    case "K":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[10]);
                        break;
                    case "L":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[11]);
                        break;
                    case "M":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[12]);
                        break;
                    case "N":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(doorUrl[13]);
                        break;
                    case "a":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[0]);
                        break;
                    case "b":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[1]);
                        break;
                    case "c":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[2]);
                        break;
                    case "d":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[3]);
                        break;
                    case "e":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[4]);
                        break;
                    case "f":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[5]);
                        break;
                    case "g":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[6]);
                        break;
                    case "h":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[7]);
                        break;
                    case "i":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[8]);
                        break;
                    case "j":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[9]);
                        break;
                    case "k":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[10]);
                        break;
                    case "l":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[11]);
                        break;
                    case "m":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[12]);
                        break;
                    case "n":
                        img[i][j] = Toolkit.getDefaultToolkit().getImage(keyUrl[13]);
                        break;
                }
            }
        }

    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        this.g = g;
        setBackground(Color.WHITE);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                g.drawImage(img[i][j], x, y, null);
                x += 40;
            }
            y += 40;
            x = 0;
        }
        setImage();
        repaint();
        if (board.isPlayerAlive()) {
            if (board.isPlayerWin()) {
                this.g.setColor(Color.black);
                this.g.fillRect(0, 0, 600, 600);
                Font font = new Font("Trebuchet MS", Font.PLAIN, 30);
                this.g.setFont(font);
                this.g.setColor(Color.white);
                this.g.drawString("LEVEL COMPLETED !", 175, 300);
                font = new Font("Trebuchet MS", Font.PLAIN, 30);
                this.g.setFont(font);
                this.g.drawString("PRESS [ENTER] TO EXIT", 155, 330);
            }
        }
        if (!board.isPlayerAlive()) {
            this.g.setColor(Color.black);
            this.g.fillRect(0, 0, 600, 600);
            Font font = new Font("Trebuchet MS", Font.PLAIN, 60);
            this.g.setFont(font);
            this.g.setColor(Color.white);
            this.g.drawString("GAME OVER !", 125, 300);
            font = new Font("Trebuchet MS", Font.PLAIN, 30);
            this.g.setFont(font);
            this.g.drawString("PRESS [ENTER] TO EXIT", 145, 360);
        }
    }

    /**
     *
     * @param ke
     */
    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param ke
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        int code = ke.getKeyCode();

        if (code == KeyEvent.VK_LEFT) {
            board.move(0, -1);
            if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
                posPlayer = 9;
            } else {
                posPlayer = 5;
            }
        } else if (code == KeyEvent.VK_UP) {
            board.move(-1, 0);
            if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
                posPlayer = 6;
            } else {
                posPlayer = 2;
            }
        } else if (code == KeyEvent.VK_RIGHT) {
            board.move(0, 1);
            if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
                posPlayer = 8;
            } else {
                posPlayer = 4;
            }
        } else if (code == KeyEvent.VK_DOWN) {
            board.move(1, 0);
            if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
                posPlayer = 7;
            } else {
                posPlayer = 3;
            }
        }
        if (code == KeyEvent.VK_ENTER) {
            view.dispose();
        }
        setImage();
        repaint();
    }

    /**
     *
     * @param ke
     */
    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public void move(int code) {
//        switch (code) {
//            case 0: //up
//                board.move(-1, 0);
//                if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
//                    posPlayer = 6;
//                } else {
//                    posPlayer = 2;
//                }
//                setImage();
//                repaint();
//                break;
//            case 1: //down
//                board.move(1, 0);
//                if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
//                    posPlayer = 7;
//                } else {
//                    posPlayer = 3;
//                }
//                setImage();
//                repaint();
//                break;
//            case 2: //right
//                board.move(0, 1);
//                if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
//                    posPlayer = 8;
//                } else {
//                    posPlayer = 4;
//                }
//                setImage();
//                repaint();
//                break;
//            case 3: //left
//                board.move(0, -1);
//                if (board.getPlayerNow().equalsIgnoreCase("Barrier")) {
//                    posPlayer = 9;
//                } else {
//                    posPlayer = 5;
//                }
//                setImage();
//                repaint();
//                break;
//        }
//    }
}
