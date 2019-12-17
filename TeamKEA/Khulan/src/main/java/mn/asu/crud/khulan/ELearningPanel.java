package mn.asu.crud.khulan;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ELearningPanel extends JFrame {

    Image img = Toolkit.getDefaultToolkit().getImage("eiffel.jpg");

    public ELearningPanel() throws IOException {
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

    public static void main(String[] args) throws Exception {
        ELearningPanel s1 = new ELearningPanel();
        s1.show();
    }
}

