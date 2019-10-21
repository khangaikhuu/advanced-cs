package mn.asu.teamKEA.startWindow;

import javax.swing.*;

public class Title {

    public String title;
    public void createTitle(String text, int x , int y, int width, int height )
    {
        title.setText(text);
        title.setBounds(x,y,width,height);
    }

    public JLabel getTitle()
    {

}
