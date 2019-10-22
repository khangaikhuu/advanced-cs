package mn.asu.teamKEA;

import mn.asu.teamKEA.component.Button;
import mn.asu.teamKEA.component.Frame;
import mn.asu.teamKEA.component.Panel;
import mn.asu.teamKEA.component.Title;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
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
        StartWindow();
    }

    public static Frame frame = new Frame(1600, 900, "French Flashcards");
>>>>>>> 777b6f37a79b2d4d81ef7602daec18ea350f5c82

    public static void StartWindow() {
        Button startButton = new Button(430, 550, 150, 70, "Start");
        Title startTitle = new Title("Lets learn French", 450, -100, 1000, 700);
        Panel startPanel = new Panel(startButton.Button, startTitle.Title, 1600, 900);
        frame.changePanel(startPanel.Panel);

        startButton.buttonAction(startPanel);
        if (startButton.nextPanel == true) {
            FirstSide();
        }
    }

    public static void FirstSide() {
        Button firstSideButton = new Button(430, 550, 150, 70, "French Word");
        Title firstSideTitle = new Title("French Word", 450, -100, 1000, 700);
        Panel firstSidePanel = new Panel(firstSideButton.Button, firstSideTitle.Title, 1600, 900);
        frame.changePanel(firstSidePanel.Panel);

        firstSideButton.buttonAction(firstSidePanel);
        if (firstSideButton.nextPanel == false) {
            SecondSide();
        }
    }

    public static void SecondSide() {
        Button secondSideButton = new Button(430, 550, 150, 70, "French Definition");
        Title secondSideTitle = new Title("Word Definition", 450, -100, 1000, 700);
        Panel secondSidePanel = new Panel(secondSideButton.Button, secondSideTitle.Title, 1600, 900);
        frame.changePanel(secondSidePanel.Panel);

        secondSideButton.buttonAction(secondSidePanel);
        if (secondSideButton.nextPanel == false) {
            FirstSide();
        }

    }
}