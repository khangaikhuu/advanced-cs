package mn.asu.aminerdene;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExampleBackground extends JPanel {
    private Image backgroundImage;

    ExampleBackground(String fileName) throws IOException {
        backgroundImage = ImageIO.read(new File(fileName));
        Dimension size = new Dimension(1600, 900);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
        setBackground(null);
    }


        @Override
        public void paintComponent(Graphics G) {
            super.paintComponent(G);
            G.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
        }
}