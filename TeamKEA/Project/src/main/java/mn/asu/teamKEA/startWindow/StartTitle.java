package mn.asu.teamKEA.startWindow;

import javax.swing.*;
public class StartTitle {

    public JLabel Title = new JLabel();



    public StartTitle(String text, int x, int y, int width, int height)
    {
        Title.setText(text);
        Title.setBounds(x,y,width,height);
    }

}
