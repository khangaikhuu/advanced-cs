package mn.asu.teamKEA;
import mn.asu.persistence.Words;
import mn.asu.teamKEA.component.*;

import javax.swing.*;
import java.io.IOException;

import static mn.asu.teamKEA.component.UsedImageIcons.dataBase;

public class Main {
    public static UsedImageIcons allIcons;
    public static MainButton mainButton = new MainButton(0, 0, 715, 536, allIcons.paris,750 ,600,55,114,allIcons.danser);
    public static MainPanel mainPanel = new MainPanel(mainButton.Button , mainButton.nextButton,  800, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,800 , 900 ,"French Flashcards");

    public static void main(String[] args) throws IOException {
        dataBase();
        mainButton.nextWord( "Danser",allIcons.danser);
        mainButton.nextSet();
    }
}