package mn.asu.teamKEA;

import mn.asu.aminerdene.ExampleBackground;
import mn.asu.teamKEA.component.MainButton;
import mn.asu.teamKEA.component.MainFrame;
import mn.asu.teamKEA.component.MainPanel;
import mn.asu.teamKEA.component.MainLabel;

import javax.swing.*;
<<<<<<< HEAD
import java.awt.*;
=======
>>>>>>> 8c91623c7507b561c5eb5c8c7ddea080a24bfc11
import java.io.IOException;

















public class Main {

<<<<<<< HEAD
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel title = new JLabel("Let's Learn French");
        title.setBounds(450, -100, 1000, 700);
        frame.add(title);
        JButton startButton = new JButton("Start");
        startButton.setBounds(430, 550, 150, 70);
        frame.add(startButton);
        frame.setSize(1600, 900);
        frame.setLayout(null);
    }






=======
1g


    public static void main(String[] args) throws IOException {
        mainButton.buttonAction(mainButton.Button, "Word", "Definition");
    }

>>>>>>> 970e113cb8dd13df5a0c137457298e61cc35679b





    public static void FirstSide() {
         if(MainButton.nextPanel) {
             MainButton.nextPanel = false;
            SecondSide();
        }

    }



    public static void SecondSide() {


        if(MainButton.nextPanel) {

            MainButton.nextPanel = false;
            FirstSide();
        }
    }
















    public static ImageIcon paris = new ImageIcon("C:\\Users\\G12\\Pictures\\paris.jpg");



    public static ExampleBackground startBackground;

    static {
        try {
            startBackground = new ExampleBackground("static/Pariss.JPG");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static MainButton mainButton = new MainButton(0, 0, 1600, 900, "Start", paris);

   // public static MainLabel startLabel = new MainLabel("Lets learn French", 450, -100, 1000, 700);


    public static MainPanel mainPanel = new MainPanel(mainButton.Button /* startLabel.Label*/, 1600, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,1600, 900, "French Flashcards");

   // public static MainLabel firstSideLabel = new MainLabel("French Word", 450, -100, 1000, 700);

   // public static MainLabel secondSideLabel = new MainLabel("Word Definition", 450, -100, 1000, 700);
}