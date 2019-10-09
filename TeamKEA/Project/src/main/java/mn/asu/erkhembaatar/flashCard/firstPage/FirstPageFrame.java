package mn.asu.erkhembaatar.flashCard.firstPage;

import javax.swing.*;

public class FirstPageFrame {
    private JFrame firstPageFrame = new JFrame();

    public void createFirstPageFrame(JButton button , JLabel label, int width , int height, String title )
    {
        firstPageFrame.setTitle(title);
        firstPageFrame.setSize(width , height);
        firstPageFrame.add(button);
        firstPageFrame.add(label);
        firstPageFrame.setLayout(null);
        firstPageFrame.setVisible(true);
    }
    public JFrame getFirstPageFrame()
    {
        return firstPageFrame;
    }

}
