package mn.asu.crud.khulan;

import javax.swing.*;

public class BackgroundFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TitleLessJFrame");
        JButton al = new JButton("Exit");
        frame.getContentPane().add(new JLabel("Let's Learn French!"));
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
