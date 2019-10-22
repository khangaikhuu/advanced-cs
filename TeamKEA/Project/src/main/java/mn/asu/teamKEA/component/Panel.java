package mn.asu.teamKEA.component;


import javax.swing.*;

public class Panel {

    public JPanel Panel = new JPanel();
    public Panel(JButton button , JLabel label , int width , int height)
    {
        Panel.setSize(width, height);
        Panel.setLayout(null);
        Panel.setVisible(true);
        Panel.add(button);
        Panel.add(label);
    }
    public void setVisible(boolean tf)
    {
        Panel.setVisible(tf);
    }

}
