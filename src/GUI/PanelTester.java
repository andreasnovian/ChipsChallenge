package GUI;

import Game.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Andreas Novian
 */
public class PanelTester extends JPanel implements KeyListener {

    public static final int CANVAS_WIDTH = 600;
    public static final int CANVAS_HEIGHT = 600;
    private Image[][] img = new Image[15][15];
    private Board board;
    private URL[] brianUrl, candraUrl, mantanUrl, mariskaUrl, pascalUrl, chairUrl, doorUrl, keyUrl, pcUrl, scriptUrl, tableUrl, wallUrl, blankUrl;

    public PanelTester() {
        this.board = new Stage1("Kevin");
        this.loadImage();
        this.setImage();
        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    }

    private void loadImage() {
        //Load image untuk Brian
        brianUrl = new URL[4];
        brianUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/brianUp.png");
        brianUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/brianDown.png");
        brianUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/brianRight.png");
        brianUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/brianLeft.png");

        //Load image untuk Candra
        candraUrl = new URL[4];
        candraUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/candraDown.png");
        candraUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/candraDown.png");
        candraUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/candraRight.png");
        candraUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/candraLeft.png");

        //Load image untuk mantan
        mantanUrl = new URL[4];
        mantanUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/mantanDown.png");
        mantanUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/mantanDown.png");
        mantanUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/mantanRight.png");
        mantanUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/mantanLeft.png");

        //Load image untuk Mariska
        mariskaUrl = new URL[4];
        mariskaUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/mariskaDown.png");
        mariskaUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/mariskaDown.png");
        mariskaUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/mariskaRight.png");
        mariskaUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/mariskaLeft.png");

        //Load image untuk Pascal
        pascalUrl = new URL[4];
        pascalUrl[0] = getClass().getClassLoader().getResource("GUI/Characters/pascalDown.png");
        pascalUrl[1] = getClass().getClassLoader().getResource("GUI/Characters/pascalDown.png");
        pascalUrl[2] = getClass().getClassLoader().getResource("GUI/Characters/pascalRight.png");
        pascalUrl[3] = getClass().getClassLoader().getResource("GUI/Characters/pascalLeft.png");

        //Load image untuk chair
        chairUrl = new URL[1];
        chairUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/chair.png");

        //Load image untuk door
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

        //Load image untuk key
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

        //Load image untuk PC
        pcUrl = new URL[4];
        pcUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/pcUp.png");
        pcUrl[1] = getClass().getClassLoader().getResource("GUI/Rooms/pcDown.png");
        pcUrl[2] = getClass().getClassLoader().getResource("GUI/Rooms/pcRight.png");
        pcUrl[3] = getClass().getClassLoader().getResource("GUI/Rooms/pcLeft.png");

        //Load image untuk script
        scriptUrl = new URL[1];
        scriptUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/script.png");

        //Load image untuk table
        tableUrl = new URL[1];
        tableUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/table.png");

        //Load image untuk wall
        wallUrl = new URL[1];
        wallUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/wall.png");

        //Load image untuk blankTile
        blankUrl = new URL[1];
        blankUrl[0] = getClass().getClassLoader().getResource("GUI/Rooms/blankTile.png");
    }

    private void setImage() {
        String[][] map = this.board.printMap();

        //Proses memasukkan gambar yang sudah diload ke array tile
        try {
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 15; j++) {
                    switch (map[i][j]) {
                        case "Player":
                            img[i][j] = ImageIO.read(brianUrl[1]);
                            break;
                        case "Computer":
                            img[i][j] = ImageIO.read(pcUrl[1]);
                            break;
                        case "Barrier":
                            img[i][j] = ImageIO.read(tableUrl[0]);
                            break;
                        case "Finish":
                            img[i][j] = ImageIO.read(chairUrl[0]);
                            break;
                        case "Wall":
                            img[i][j] = ImageIO.read(wallUrl[0]);
                            break;
                        case "Script":
                            img[i][j] = ImageIO.read(scriptUrl[0]);
                            break;
                        case "Table":
                            img[i][j] = ImageIO.read(tableUrl[0]);
                            break;
                        case "Blank":
                            img[i][j] = ImageIO.read(blankUrl[0]);
                            break;
                        case "A":
                            img[i][j] = ImageIO.read(doorUrl[0]);
                            break;
                        case "B":
                            img[i][j] = ImageIO.read(doorUrl[1]);
                            break;
                        case "C":
                            img[i][j] = ImageIO.read(doorUrl[2]);
                            break;
                        case "D":
                            img[i][j] = ImageIO.read(doorUrl[3]);
                            break;
                        case "E":
                            img[i][j] = ImageIO.read(doorUrl[4]);
                            break;
                        case "F":
                            img[i][j] = ImageIO.read(doorUrl[5]);
                            break;
                        case "G":
                            img[i][j] = ImageIO.read(doorUrl[6]);
                            break;
                        case "H":
                            img[i][j] = ImageIO.read(doorUrl[7]);
                            break;
                        case "I":
                            img[i][j] = ImageIO.read(doorUrl[8]);
                            break;
                        case "J":
                            img[i][j] = ImageIO.read(doorUrl[9]);
                            break;
                        case "a":
                            img[i][j] = ImageIO.read(keyUrl[0]);
                            break;
                        case "b":
                            img[i][j] = ImageIO.read(keyUrl[1]);
                            break;
                        case "c":
                            img[i][j] = ImageIO.read(keyUrl[2]);
                            break;
                        case "d":
                            img[i][j] = ImageIO.read(keyUrl[3]);
                            break;
                        case "e":
                            img[i][j] = ImageIO.read(keyUrl[4]);
                            break;
                        case "f":
                            img[i][j] = ImageIO.read(keyUrl[5]);
                            break;
                        case "g":
                            img[i][j] = ImageIO.read(keyUrl[6]);
                            break;
                        case "h":
                            img[i][j] = ImageIO.read(keyUrl[7]);
                            break;
                        case "i":
                            img[i][j] = ImageIO.read(keyUrl[8]);
                            break;
                        case "j":
                            img[i][j] = ImageIO.read(keyUrl[9]);
                            break;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
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
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int code = ke.getKeyCode();

        if (code == KeyEvent.VK_LEFT) {
            board.move(0, -1);
        } else if (code == KeyEvent.VK_UP) {
            board.move(-1, 0);
        } else if (code == KeyEvent.VK_RIGHT) {
            board.move(0, 1);
        } else if (code == KeyEvent.VK_DOWN) {
            board.move(1, 0);
        }
        setImage();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
