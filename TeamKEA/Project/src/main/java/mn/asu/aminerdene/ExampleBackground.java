package mn.asu.aminerdene;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExampleBackground extends JPanel {
    public Image backgroundImage;

    public ExampleBackground(String fileName) throws IOException {
<<<<<<< HEAD
        backgroundImage = ImageIO.read(new File(fileName));
        Dimension size = new Dimension(300, 300);
=======
        File file = new File(getClass().getClassLoader().getResource(fileName).getFile());
        backgroundImage = ImageIO.read(file);
        Dimension size = new Dimension(1600, 900);
>>>>>>> 4b2fe8a1e15cfdd02f8556c51e3e72491e12f184
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(1600, 900);
        setLayout(null);
        setBackground(null);
    }


        @Override
        public void paintComponent(Graphics G) {
            super.paintComponent(G);
            G.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
        }
}