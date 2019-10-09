package mn.asu.teamKEA;

import javax.swing.*;

public class Frame {

    private JFrame startFrame = new JFrame();
    public void createStartFrame(JButton button , JLabel label )
    {
        startFrame.setSize(1599, 900);
        startFrame.setLayout(null);
        startFrame.setVisible(true);
        startFrame.add(button);
        startFrame.add(label);
    }

    public JFrame getStartFrame()
    {
        return startFrame;
    }

}
