package mn.asu.teamKEA;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JLabel title = new JLabel("Let's Learn French");
        title.setBounds(450, -100, 1000, 700);
        frame.add(title);
        JButton startButton = new JButton("Start");
        startButton.setBounds(430,550,150,70);
        frame.add(startButton);
        frame.setSize(1600, 900);
        frame.setLayout(null);

        frame.setVisible(true);


    }
}
