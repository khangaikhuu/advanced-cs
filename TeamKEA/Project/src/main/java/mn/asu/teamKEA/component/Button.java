package mn.asu.teamKEA.component;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {

    public JButton Button = new JButton("start");

    public Button(int x, int y, int width , int height)
    {
        Button.setBounds(x, y, width, height);
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                      
            }
        });
    }
}
