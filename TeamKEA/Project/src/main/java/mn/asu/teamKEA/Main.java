package mn.asu.teamKEA;

import mn.asu.teamKEA.startWindow.StartButton;
import mn.asu.teamKEA.startWindow.StartFrame;
import mn.asu.teamKEA.startWindow.StartTitle;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        StartWindow();
    }






    public static void StartWindow() {
        StartButton startButton = new StartButton(430, 550, 150, 70);
        StartTitle startTitle = new StartTitle("Lets learn French", 450, -100, 1000, 700);
        StartFrame startFrame = new StartFrame(startButton.Button, startTitle.Title, 1600, 900, "Welcome to French Flashcards!");
    }
}
