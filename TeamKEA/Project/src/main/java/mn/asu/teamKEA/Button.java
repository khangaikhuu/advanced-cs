package mn.asu.teamKEA;

import javax.swing.*;

public class Button {
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