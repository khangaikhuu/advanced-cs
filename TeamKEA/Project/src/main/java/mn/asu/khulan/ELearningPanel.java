<<<<<<< HEAD
package mn.asu.khulan;
=======
/*package mn.asu.khulan;

import sun.awt.HToolkit;

>>>>>>> 777b6f37a79b2d4d81ef7602daec18ea350f5c82
import javax.swing.*;

import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
<<<<<<< HEAD

public class ELearningPanel extends JFrame {

        Image img = Toolkit.getDefaultToolkit().getImage("eiffel.jpg");

        public ELearningPanel() throws IOException {
=======
import javax.swing.JPanel;
import javax.swing.JFrame;
public class ELearningPanel {
    public class SwingDemo extends javax.swing.JFrame {

        Image img = Toolkit.getDefaultToolkit().getImage("eiffel.jpg");

        public SwingDemo() throws IOException {
>>>>>>> 777b6f37a79b2d4d81ef7602daec18ea350f5c82
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
<<<<<<< HEAD
        public static void main(String[] args) throws Exception {
            ELearningPanel s1 = new ELearningPanel();
            s1.show();
        }

}

=======

        public static void main(String[] args) throws Exception;

        {
            new SwingDemo();
        }
    }
}
*/
>>>>>>> 777b6f37a79b2d4d81ef7602daec18ea350f5c82