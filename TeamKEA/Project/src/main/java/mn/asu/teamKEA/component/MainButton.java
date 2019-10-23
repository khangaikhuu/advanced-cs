package mn.asu.teamKEA.component;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static mn.asu.teamKEA.Main.mainPanel;

public class MainButton {

    public JButton Button = new JButton();
    public boolean nextPanel = false;
    public MainButton(int x, int y, int width , int height, String name)
    {
        Button.setBounds(x, y, width, height);
        Button.setText(name);
    }

    public void buttonAction(JButton button , JLabel label)
    {
        Button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        mainPanel.redraw(button , label);
                    }
                }
        );
    }
}
