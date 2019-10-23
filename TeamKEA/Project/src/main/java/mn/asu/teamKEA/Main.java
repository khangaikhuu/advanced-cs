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
        StartWindow();
    }



    public static void StartWindow() {
        Button startButton = new Button(430, 550, 150, 70, "Start");
        Title startTitle = new Title("Lets learn French", 450, -100, 1000, 700);
        Panel startPanel = new Panel(startButton.Button, startTitle.Title, 1600, 900);
        Frame startFrame = new Frame(startPanel.Panel ,1600, 900, "French Flashcards");

        startButton.buttonAction(startFrame.Frame);
        if (startButton.nextPanel == true) {
            FirstSide();
        }
    }

    public static void FirstSide() {
        Button firstSideButton = new Button(430, 550, 150, 70, "French Word");
        Title firstSideTitle = new Title("French Word", 450, -100, 1000, 700);
        Panel firstSidePanel = new Panel(firstSideButton.Button, firstSideTitle.Title, 1600, 900);
        Frame firstFrame = new Frame(firstSidePanel.Panel , 1600 , 900 , "French Word");


        firstSideButton.buttonAction(firstFrame.Frame);
        if (firstSideButton.nextPanel == true) {
            SecondSide();
        }
    }

    public static void SecondSide() {
        Button secondSideButton = new Button(430, 550, 150, 70, "French Definition");
        Title secondSideTitle = new Title("Word Definition", 450, -100, 1000, 700);
        Panel secondSidePanel = new Panel(secondSideButton.Button, secondSideTitle.Title, 1600, 900);

        Frame secondFrame = new Frame(secondSidePanel.Panel , 1600 , 900 , "French Word");

        secondSideButton.buttonAction(secondFrame.Frame);
        if (secondSideButton.nextPanel == true) {
            FirstSide();
        }

    }
}