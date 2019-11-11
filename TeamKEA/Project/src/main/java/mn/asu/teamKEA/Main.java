package mn.asu.teamKEA;
<<<<<<< HEAD
import mn.asu.persistence.Words;
import mn.asu.teamKEA.component.*;

import javax.swing.*;
=======
import mn.asu.teamKEA.component.*;
>>>>>>> 30ff0b385d2f07aebe8eca47cd6e5daa3df3cc22
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       mainButton.nextWord( "Danser",allIcons.danser);
       mainButton.nextSet();
    }

    public static UsedImageIcons allIcons;
    static {
        try {
            allIcons = new UsedImageIcons();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static MainButton mainButton = new MainButton(0, 0, 715, 536, allIcons.paris,750 ,600,55,114,allIcons.next);
    public static MainPanel mainPanel = new MainPanel(mainButton.Button , mainButton.nextButton,  800, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,800 , 900 ,"French Flashcards");
}