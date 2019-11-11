package mn.asu.teamKEA.component;

import mn.asu.teamKEA.Main;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static mn.asu.teamKEA.Main.mainPanel;

public class MainButton {

    public static boolean nextPanel = false;
    public JButton Button = new JButton();

    public MainButton(int x, int y, int width, int height, String name, ImageIcon imageIcon) {
        Button.setBounds(x, y, width, height);
        Button.setText(name);
        Button.setIcon(imageIcon);
    }


    public static int i = 2;

    public void nextWord(JButton button, String text1, String text2, ImageIcon imageIcon1, ImageIcon imageIcon2) {


        Button.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {

                if (i % 2 == 0) {
                    nextPanel = true;
                    button.setText(text1);
                    button.setIcon(imageIcon1);
                    mainPanel.Panel.revalidate();
                    mainPanel.Panel.repaint();
                } else {

                    nextPanel = true;
                    button.setText(text2);
                    button.setIcon(imageIcon2);
                    mainPanel.Panel.revalidate();
                    mainPanel.Panel.repaint();
                }
                i++;
            }
        });
    }


    public int set = 0;

    public void nextSet()
    {
        set++;
        Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(set==1)
                {

                    nextWord(Main.nextButton.Button, "Next", "NExt2",UsedImageIcons.next, UsedImageIcons.next);
                }
            }
        });


    }

}
