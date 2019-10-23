package mn.asu.teamKEA;

import mn.asu.teamKEA.component.MainButton;
import mn.asu.teamKEA.component.MainFrame;
import mn.asu.teamKEA.component.MainPanel;
import mn.asu.teamKEA.component.MainLabel;


public class Main {
    public static void main(String[] args) {
        StartWindow();
    }

    public static MainPanel mainPanel = new MainPanel(1600, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,1600, 900, "French Flashcards");


    public static MainButton startButton = new MainButton(430, 550, 150, 70, "Start");
    public static MainLabel startLabel = new MainLabel("Lets learn French", 450, -100, 1000, 700);


    public static MainButton firstSideButton = new MainButton(430, 550, 150, 70, "French Word");
    public static MainLabel firstSideLabel = new MainLabel("French Word", 450, -100, 1000, 700);


    public static MainButton secondSideButton = new MainButton(430, 550, 150, 70, "French Definition");
    public static MainLabel secondSideLabel = new MainLabel("Word Definition", 450, -100, 1000, 700);


    public static void StartWindow() {


        mainPanel.redraw(startButton.Button , startLabel.Label);

        FirstSide();
    }

    public static void FirstSide() {
        startButton.buttonAction(firstSideButton.Button, firstSideLabel.Label);

        SecondSide();
    }

    public static void SecondSide() {


        firstSideButton.buttonAction(secondSideButton.Button, secondSideLabel.Label);

        FirstSideRepeat();

    }

    public static void FirstSideRepeat()
    {
        secondSideButton.buttonAction(firstSideButton.Button, firstSideLabel.Label);
        SecondSide();
    }

}