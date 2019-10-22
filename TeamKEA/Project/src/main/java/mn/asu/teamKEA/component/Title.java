package mn.asu.teamKEA.component;

import javax.swing.*;
public class Title {

    public JLabel Title = new JLabel();



    public Title(String text, int x, int y, int width, int height)
    {
        Title.setText(text);
        Title.setBounds(x,y,width,height);
    }

}
