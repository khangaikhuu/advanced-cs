
package mn.asu.teamKEA.component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static mn.asu.teamKEA.Main.mainPanel;
import static mn.asu.teamKEA.component.UsedImageIcons.database;
import static mn.asu.teamKEA.component.UsedImageIcons.getIcon;

public class MainButton {

    public JButton Button = new JButton();
    public JButton nextButton = new JButton();

    public MainButton(int x, int y, int width, int height,  ImageIcon imageIcon, int x2, int y2 , int width2, int height2, ImageIcon imageIcon2) {
        Button.setBounds(x, y, width, height);
        Button.setIcon(imageIcon);
        nextButton.setBounds(x2,y2,width2,height2);
        nextButton.setIcon(imageIcon2);
    }


    public static int i = 1;

    public void nextWord( ) {


        Button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(i % 2 ==0) {

                    Button.setIcon(null);
                    Button.setText(database[set][0]);
                }
                else
                {
                    Button.setText(null);
                    try {
                        Button.setIcon(getIcon(database[set][1]));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                i++;
                mainPanel.Panel.revalidate();
                mainPanel.Panel.repaint();
            }
        });
    }



    public static int set = 0;
    public void nextSet()
    {
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(set== database.length-1)
                {
                    set=0;
                }
                else {
                    set++;
                }
                mainPanel.Panel.revalidate();
                mainPanel.Panel.repaint();

            }
        });


    }


}

