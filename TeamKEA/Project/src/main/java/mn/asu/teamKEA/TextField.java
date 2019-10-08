package mn.asu.teamKEA;

import javax.swing.*;

public class TextField {

    private JLabel title = new JLabel();
    public void createTitle(String text, int x , int y, int width, int height )
    {
        title.setText(text);
        title.setBounds(x,y,width,height);
    }

    public JLabel getTitle()
    {
        return title;
    }

}
