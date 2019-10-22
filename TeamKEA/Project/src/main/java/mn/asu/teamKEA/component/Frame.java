package mn.asu.teamKEA.component;


import javax.swing.*;
import java.awt.*;

public class Frame {

    public JFrame Frame = new JFrame();
    public Frame(JPanel p ,int width , int height, String title )
    {
        Frame.setTitle(title);
        Frame.setSize(width, height);
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.add(p);
    }

}
