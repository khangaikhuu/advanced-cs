package mn.asu.erkhembaatar.startWindow;

import javax.swing.*;

public class Title {

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
