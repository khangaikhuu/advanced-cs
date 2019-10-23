package mn.asu.teamKEA.component;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {

    public JButton Button = new JButton();
    public boolean nextPanel = false;
    public Button(int x, int y, int width , int height, String name)
    {
        Button.setBounds(x, y, width, height);
        Button.setText(name);
    }

    public void buttonAction(JFrame offFrame)
    {
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                offFrame.setVisible(false);
                nextPanel= true;

            }
        });
    }
}
