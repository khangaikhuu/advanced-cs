package mn.asu.teamKEA.startWindow;

import mn.asu.erkhembaatar.flashCard.firstPage.FirstPageFrame;

import javax.swing.*;

public class StartFrame {

    public JFrame Frame = new JFrame();
    public StartFrame(JButton button , JLabel label , int width , int height, String title )
    {
        Frame.setTitle(title);
        Frame.setSize(width, height);
        Frame.setLayout(null);
        Frame.setVisible(true);
        Frame.add(button);
        Frame.add(label);
    }

}
