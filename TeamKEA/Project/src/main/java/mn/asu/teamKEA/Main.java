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

    public static void StartWindow() {
        Button startButton = new Button(430, 550, 150, 70);
        Title startTitle = new Title("Lets learn French", 450, -100, 1000, 700);
        Panel startPanel = new Panel(startButton.Button, startTitle.Title, 1600, 900);
        Frame startFrame = new Frame (startPanel.Panel ,1600 , 900, "Welcome to French Flashcards");
    }

    public static void FirstSide()
    {
        Button firstSideButton = new Button(430, 550, 150, 70);
        Title firstSideTitle = new Title("Lets learn French", 450, -100, 1000, 700);
        Panel firstSidePanel= new Panel(firstSideButton.Button, firstSideTitle.Title, 1600, 900);
    }

}
