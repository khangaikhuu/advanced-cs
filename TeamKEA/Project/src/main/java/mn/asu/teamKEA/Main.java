package mn.asu.teamKEA;

import mn.asu.aminerdene.ExampleBackground;
import mn.asu.persistence.Words;
import mn.asu.teamKEA.component.*;

import javax.swing.*;

import java.awt.*;

import java.io.IOException;

















public class Main {

    public static void main(String[] args) throws IOException {
        mainButton.buttonAction(mainButton.Button, "Word", "Definition", allIcons.demander , allIcons.danser);
    }




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

















    public static UsedImageIcons allIcons;
    private static Words word1 = new Words(1, "hello", "bonjour", "greeting", "/static/Pariss.JPG");
    private static Words word2 = new Words(2, "Good morning", "bonjour", "greeting", "/static/Pariss.JPG");
    private static Words word3 = new Words(3, "Test", "bonjour", "greeting", "/static/Pariss.JPG");

    static {
        try {
            allIcons = new UsedImageIcons();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static MainButton mainButton = new MainButton(0, 0, 715, 536, "Start", allIcons.paris);
    public static MainPanel mainPanel = new MainPanel(mainButton.Button /* startLabel.Label*/, 715, 536);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,735 , 650 ,"French Flashcards");












   // public static MainLabel firstSideLabel = new MainLabel("French Word", 450, -100, 1000, 700);


    // public static MainLabel startLabel = new MainLabel("Lets learn French", 450, -100, 1000, 700);
   // public static MainLabel secondSideLabel = new MainLabel("Word Definition", 450, -100, 1000, 700);
}