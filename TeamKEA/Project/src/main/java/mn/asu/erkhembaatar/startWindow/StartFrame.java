package mn.asu.erkhembaatar.startWindow;

import mn.asu.erkhembaatar.flashCard.firstPage.FirstPageFrame;

import javax.swing.*;

public class StartFrame extends FirstPageFrame {

    private JFrame startFrame = new JFrame();
    public void createStartFrame(JButton button , JLabel label , int width , int height, String title )
    {
        startFrame.setTitle(title);
        startFrame.setSize(width, height);
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
