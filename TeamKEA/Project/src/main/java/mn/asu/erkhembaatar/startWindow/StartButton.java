package mn.asu.erkhembaatar.startWindow;

import javax.swing.*;

public class StartButton {

    private JButton startButton = new JButton("start");

    public void createStartButton(int x, int y, int width , int height)
    {
        startButton.setBounds(x, y, width, height);
    }
    public JButton getStartButton()
    {
        return startButton;
    }
}
