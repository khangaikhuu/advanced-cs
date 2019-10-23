package mn.asu.teamKEA.component;


import mn.asu.aminerdene.ExampleBackground;

import javax.swing.*;
import java.io.IOException;

public class MainPanel {

    public JPanel Panel = new JPanel();
    public MainPanel(JButton button , JLabel label , int width , int height) throws IOException {
        Panel.setSize(width, height);
        Panel.setLayout(null);
        Panel.setVisible(true);

        Panel.add(button);
        Panel.add(label);
        ExampleBackground pic = new ExampleBackground("C:\\Users\\G12\\Pictures\\paris.jpg\\");
        Panel.add(pic);
        Panel.setComponentZOrder(pic, 2);
        Panel.setComponentZOrder(button, 1);
        Panel.setComponentZOrder(label, 0);
    }

    public MainPanel(int width , int height) {
        Panel.setSize(width, height);
        Panel.setLayout(null);
        Panel.setVisible(true);
    }


   public void redraw(JButton button , JLabel Label, ExampleBackground picture) throws IOException {
       Panel.removeAll();
       Panel.add(picture);
       Panel.add(button , Label);

       Panel.setComponentZOrder(picture, 2);
       Panel.setComponentZOrder(button, 1);
       Panel.setComponentZOrder(Label, 0);
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
