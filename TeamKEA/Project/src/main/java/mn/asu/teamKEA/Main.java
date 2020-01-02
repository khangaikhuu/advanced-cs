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
        mainButton.backSet();
    }

    public static MainButton mainButton = new MainButton(0, 0, 800, 400,UsedImageIcons.paris,700 ,400,100,200,UsedImageIcons.next, 0, 400, 100, 200, UsedImageIcons.back);
    public static MainPanel mainPanel = new MainPanel(mainButton.Button , mainButton.nextButton, mainButton.backButton, 800, 600);
    public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,800 , 600 ,"French Flashcards");
}