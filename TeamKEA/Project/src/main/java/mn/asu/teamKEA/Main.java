package mn.asu.teamKEA;

import mn.asu.aminerdene.ExampleBackground;
import mn.asu.teamKEA.component.MainButton;
import mn.asu.teamKEA.component.MainFrame;
import mn.asu.teamKEA.component.MainPanel;
import mn.asu.teamKEA.component.MainLabel;
import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {
        FirstSide();
    }


    public static ExampleBackground startBackground;

    static {
        try {
            startBackground = new ExampleBackground("static/Pariss.JPG");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void FirstSide() {
        mainButton.buttonAction(mainButton.Button, "Word" /*firstSideLabel.Label*/);
         if(MainButton.nextPanel) {
             MainButton.nextPanel = false;
            SecondSide();
        }

    }



    public static void SecondSide() {

        mainButton.buttonAction(mainButton.Button, "Definition"  /*secondSideLabel.Label*/);
        if(MainButton.nextPanel) {

            MainButton.nextPanel = false;
            FirstSideRepeat();
        }
    }

    public static void FirstSideRepeat()
    {

        mainButton.buttonAction(mainButton.Button, "Word" /*firstSideLabel.Label*/);
        if(MainButton.nextPanel) {
            MainButton.nextPanel = false;
            SecondSide();
        }

    }




























    // Static Fields
    // Static Fields
    // Static Fields
    // Static Fields
    // Static Fields


    public static MainButton mainButton = new MainButton(430, 550, 150, 70, "Start");
   // public static MainLabel startLabel = new MainLabel("Lets learn French", 450, -100, 1000, 700);


    public static MainPanel mainPanel = new MainPanel(mainButton.Button /* startLabel.Label*/, 1600, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,1600, 900, "French Flashcards");

   // public static MainLabel firstSideLabel = new MainLabel("French Word", 450, -100, 1000, 700);

   // public static MainLabel secondSideLabel = new MainLabel("Word Definition", 450, -100, 1000, 700);
    // Static Fields
    // Static Fields
    // Static Fields
    // Static Fields
    // Static Fields
}