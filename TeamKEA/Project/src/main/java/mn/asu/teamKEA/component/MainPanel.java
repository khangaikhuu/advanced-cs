package mn.asu.teamKEA.component;


import mn.asu.aminerdene.ExampleBackground;

import javax.swing.*;
import java.io.IOException;

public class MainPanel {

    public JPanel Panel = new JPanel();
    public MainPanel(JButton button1  , JButton button2,JButton button3, int width , int height)  {
        Panel.setSize(width, height);
        Panel.setLayout(null);
        Panel.add(button3);
        Panel.add(button1);
        Panel.add(button2);
        Panel.setVisible(true);


    }
}
