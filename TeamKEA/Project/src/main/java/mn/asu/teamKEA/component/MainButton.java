package mn.asu.teamKEA.component;

import mn.asu.teamKEA.Main;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import static mn.asu.teamKEA.Main.allIcons;
import static mn.asu.teamKEA.Main.mainPanel;

public class MainButton {

    public JButton Button = new JButton();
    public JButton nextButton = new JButton();

    public MainButton(int x, int y, int width, int height,  ImageIcon imageIcon, int x2, int y2 , int width2, int height2, ImageIcon imageIcon2) {
        Button.setBounds(x, y, width, height);
        Button.setIcon(imageIcon);
        nextButton.setBounds(x2,y2,width2,height2);
        nextButton.setIcon(imageIcon2);
    }


    public static int i = 0;

    public void nextWord( String text,   ImageIcon imageIcon, ArrayList words) {


        Button.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                Random number = new Random();
                int index = number.nextInt(words.size()-1);
                if (i == 1) {
                    Button.setIcon(null);
                    Button.setText(text);
                    mainPanel.Panel.revalidate();
                    mainPanel.Panel.repaint();
                    i=1;
                } else if(i==1) {

                    Button.setText(null);
                    Button.setIcon(imageIcon);
                    mainPanel.Panel.revalidate();
                    mainPanel.Panel.repaint();
                    i=0;
                }
                else if(i==2)
                {
                    Button.setIcon(null);
                    Button.setText("Demander");
                    mainPanel.Panel.revalidate();
                    mainPanel.Panel.repaint();
                    i=3;
                }
                else if(i==3)
                {
                    Button.setText(null);
                    Button.setIcon(allIcons.demander);
                    mainPanel.Panel.revalidate();
                    mainPanel.Panel.repaint();
                    i=2;
                }



            }
        });
    }


    public int set = 0;

    public void nextSet()
    {
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                set++;
                if(set==1)
                {

                    i=2;
                }
            }
        });


    }


}
