package mn.asu.khulan;

import sun.awt.HToolkit;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class ELearningPanel {
    public class SwingDemo extends javax.swing.JFrame {

        Image img = Toolkit.getDefaultToolkit().getImage("eiffel.jpg");

        public SwingDemo() throws IOException {
            this.setContentPane(new JLabel() {
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(img, 0, 0, null
                    );
                }
            });
            pack();
            setVisible(true);
        }

        public static void main(String[] args) throws Exception;

        {
            new SwingDemo();
        }
    }
}
