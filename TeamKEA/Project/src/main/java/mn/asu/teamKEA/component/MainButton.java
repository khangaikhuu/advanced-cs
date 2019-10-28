package mn.asu.teamKEA.component;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static mn.asu.teamKEA.Main.mainPanel;

public class MainButton {

    public static boolean nextPanel = false;
    public JButton Button = new JButton();
    public MainButton(int x, int y, int width , int height, String name)
    {
        Button.setBounds(x, y, width, height);
        Button.setText(name);
        Button.setOpaque(false);
    }





    public void buttonAction(JButton button , JLabel label)
    {
        Button.addActionListener(
                actionEvent -> mainPanel.redraw(button , label)
        );
    }

    public void buttonAction(JButton button, String text ) {
        Button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                button.setText(text);
                mainPanel.redraw();
                nextPanel = true;
            }
        });
    }


}
