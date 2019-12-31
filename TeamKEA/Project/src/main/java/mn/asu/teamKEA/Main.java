package mn.asu.teamKEA;

import mn.asu.teamKEA.component.MainButton;
import mn.asu.teamKEA.component.MainFrame;
import mn.asu.teamKEA.component.MainPanel;
import mn.asu.teamKEA.component.UsedImageIcons;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UsedImageIcons.dataBase();
        mainButton.nextWord();
        mainButton.nextSet();
    }

    public static MainButton mainButton = new MainButton(0, 0, 700, 500,UsedImageIcons.paris,750 ,600,55,114,UsedImageIcons.next);
    public static MainPanel mainPanel = new MainPanel(mainButton.Button , mainButton.nextButton,  800, 900);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,800 , 900 ,"French Flashcards");
}