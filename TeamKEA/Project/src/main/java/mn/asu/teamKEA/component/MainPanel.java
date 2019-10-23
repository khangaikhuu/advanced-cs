package mn.asu.teamKEA.component;


import mn.asu.aminerdene.ExampleBackground;

import javax.swing.*;
import java.io.IOException;

public class MainPanel {

    public JPanel Panel = new JPanel();
    public MainPanel(JButton button , JLabel label , int width , int height)
    {
        Panel.setSize(width, height);
        Panel.setLayout(null);
        Panel.setVisible(true);
        Panel.add(button);
        Panel.add(label);
    }

    public MainPanel(int width , int height) {
        Panel.setSize(width, height);
        Panel.setLayout(null);
        Panel.setVisible(true);
    }


   public void redraw(JButton Button , JLabel Label, ExampleBackground picture) throws IOException {
       Panel.removeAll();
       Panel.add(picture);
       Panel.add(Button , Label);


       Panel.revalidate();
       Panel.repaint();
   }

    public void redraw(JButton Button , JLabel Label)
    {
        Panel.removeAll();
        Panel.add(Button , Label);
        Panel.revalidate();
        Panel.repaint();
    }

    public void setVisible(boolean tf)
    {
        Panel.setVisible(tf);
    }


}
