package mn.asu.teamKEA;

import mn.asu.aminerdene.ExampleBackground;
import mn.asu.teamKEA.component.MainButton;
import mn.asu.teamKEA.component.MainFrame;
import mn.asu.teamKEA.component.MainPanel;
import mn.asu.teamKEA.component.MainLabel;
import java.io.IOException;

















public class Main {
<<<<<<< HEAD
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
=======


    public static void main(String[] args) throws IOException {
        mainButton.buttonAction(mainButton.Button, "Word", "Definition"/*firstSideLabel.Label*/);
        FirstSide();
    }

>>>>>>> 24c2b9caf4ce9e0e89f209ecd5a6053f0acab2e8





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



















    public static ExampleBackground startBackground;

    static {
        try {
            startBackground = new ExampleBackground("static/Pariss.JPG");
        } catch (IOException e) {
            e.printStackTrace();
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