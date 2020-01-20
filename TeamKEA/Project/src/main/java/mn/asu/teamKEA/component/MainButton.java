
package mn.asu.teamKEA.component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static mn.asu.teamKEA.Main.mainPanel;
import static mn.asu.teamKEA.component.UsedImageIcons.*;

public class MainButton {

    public JButton Button = new JButton();
    public JButton nextButton = new JButton();
    public JButton backButton = new JButton();
    public MainButton(int x, int y, int width, int height,  ImageIcon imageIcon, int x2, int y2 , int width2, int height2, ImageIcon imageIcon2, int x3, int y3, int width3, int height3, ImageIcon imageIcon3) {
        Button.setBounds(x, y, width, height);
        Button.setIcon(imageIcon);

        Button.setOpaque(false);
        Button.setContentAreaFilled(false);
        Button.setBorderPainted(false);

        nextButton.setBounds(x2,y2,width2,height2);
        nextButton.setIcon(imageIcon2);

        nextButton.setOpaque(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);

        backButton.setBounds(x3,y3,width3,height3);
        backButton.setIcon(imageIcon3);

        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
    }


    public static int i = 2;
    public static int set = 0;

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
                        Button.setIcon(getIcon2(database[set][1]));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                mainPanel.Panel.revalidate();
                mainPanel.Panel.repaint();
                i++;
            }
        });
    }



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

                Button.setText(null);
                    try {
                        Button.setIcon(getIcon2(database[set][1]));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                i=2;
                mainPanel.Panel.revalidate();
                mainPanel.Panel.repaint();

            }
        });


    }


    public void backSet()
    {
        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(set== 0)
                {
                    set=database.length-1;
                }
                else {
                    set--;
                }


                Button.setText(null);
                    try {
                        Button.setIcon(getIcon2(database[set][1]));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                i=2;
                mainPanel.Panel.revalidate();
                mainPanel.Panel.repaint();


            }
        });


    }
}

