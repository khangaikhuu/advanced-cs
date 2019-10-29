package mn.asu.teamKEA.component;


import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public JFrame Frame = new JFrame();
    public MainFrame(JPanel p , int width , int height, String title )
    {
        Frame.setTitle(title);
        Frame.setSize(width, height);
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.add(p);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MainFrame(int width , int height, String title )
    {
        Frame.setTitle(title);
        Frame.setSize(width, height);
        Frame.setLayout(null);
        Frame.setVisible(true);
    }




    public void changePanel(JPanel p)
    {
        Frame.add(p);
    }



}
