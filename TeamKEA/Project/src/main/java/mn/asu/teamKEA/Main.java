package mn.asu.teamKEA;

import mn.asu.aminerdene.ExampleBackground;
import mn.asu.teamKEA.component.*;

import javax.swing.*;

import java.awt.*;

import java.io.IOException;

















public class Main {

    public static void main(String[] args) throws IOException {
        mainButton.buttonAction(mainButton.Button, "Word", "Definition");
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

    static {
        try {
            allIcons = new UsedImageIcons();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static MainButton mainButton = new MainButton(0, 0, 960, 720, "Start", allIcons.chanter);
    public static MainPanel mainPanel = new MainPanel(mainButton.Button /* startLabel.Label*/, 1600, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,1600 , 900 ,"French Flashcards");












   // public static MainLabel firstSideLabel = new MainLabel("French Word", 450, -100, 1000, 700);


    // public static MainLabel startLabel = new MainLabel("Lets learn French", 450, -100, 1000, 700);
   // public static MainLabel secondSideLabel = new MainLabel("Word Definition", 450, -100, 1000, 700);
}