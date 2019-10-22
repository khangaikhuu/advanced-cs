package mn.asu.teamKEA.component;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {

    public JButton Button = new JButton("start");
    public boolean nextPanel = true;
    public Button(int x, int y, int width , int height)
    {
        Button.setBounds(x, y, width, height);
    }

    public void buttonAction(final Panel offPanel)
    {
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                offPanel.setVisible(false);
                nextPanel= false;

            }
        });
    }
}
