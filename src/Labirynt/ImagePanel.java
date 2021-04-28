package Labirynt;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {


        private BufferedImage image;

        public ImagePanel(String path) {
            System.out.println(path);
            try {
                image = ImageIO.read(new File(path));
            } catch (IOException ex) {
                // handle exception...
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 30, 30, this); // see javadoc for more info on the parameters
        }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
    }
}
