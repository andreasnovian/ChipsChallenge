package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class welcomePanel extends JPanel {

    private URL imageUrl;
    private Image img;

    public welcomePanel() {
        this.imageUrl = getClass().getClassLoader().getResource("GUI/Rooms/welcome.png");
        try {
            this.img = ImageIO.read(imageUrl);
        } catch (IOException ex) {
            Logger.getLogger(welcomePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        setPreferredSize(new Dimension(600, 600));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.drawImage(img, 0, 0, null);
    }
}
