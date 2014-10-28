
package GUI;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Andreas Novian
 */
public class PanelTester extends JPanel {
    public static final int CANVAS_WIDTH = 750;
    public static final int CANVAS_HEIGHT = 750;
    
    private Image[][] img;
    private URL[] brianUrl,candraUrl,mantanUrl,mariskaUrl,pascalUrl;
    
    public PanelTester(){
        loadImage();
        setImage();
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    }
    
    private void loadImage(){
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
    }
    
    private void setImage(){
        img  = new Image[15][15];
        
        //Proses memasukkan gambar yang sudah diload ke array tile
        try{
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                if (i%5==0){
                    img[i][j] = ImageIO.read(brianUrl[1]);
                }
                else if (i%5==1){
                    img[i][j] = ImageIO.read(candraUrl[1]);
                }
                else if (i%5==2){
                    img[i][j] = ImageIO.read(mantanUrl[1]);
                }
                else if (i%5==3){
                    img[i][j] = ImageIO.read(mariskaUrl[1]);
                }
                else {
                    img[i][j] = ImageIO.read(pascalUrl[1]);
                }
            }
        }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        int x=0;
        int y=0;
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                g.drawImage(img[i][j],x,y,null);
                x+=50;
            }
            y+=50;
            x=0;
        }
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Coba");
        frame.setContentPane(new PanelTester());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
