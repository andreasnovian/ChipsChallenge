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
 * Kelas yang digunakan untuk membantu kelas Interface melakukan visualisasi
 * papan permainan. Kelas ini membantu menampilkan tampilan awal permainan.
 * Kelas ini merupakan View dalam project ini.
 *
 * @author Kevin Rizkhy, Andreas Novian, Dimas Nathanael
 */
public class welcomePanel extends JPanel {

    /**
     * Atribut untuk menyimpan alamat gambar untuk halaman awal
     */
    private URL imageUrl;

    /**
     * Atribut untuk menyimpan objek Image gambar untuk halaman awal
     */
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
