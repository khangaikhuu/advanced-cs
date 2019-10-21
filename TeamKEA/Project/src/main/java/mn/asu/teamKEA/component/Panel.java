package mn.asu.teamKEA.component;



import javax.swing.*;
import java.awt.*;

public class Panel {

    public JPanel Panel = new JPanel();
    public Panel(JButton button , JLabel label , int width , int height)
    {
        Panel.setSize(width, height);
        Panel.setLayout(CardLayout);
        Panel.setVisible(true);
        Panel.add(button);
        Panel.add(label);
    }

}
