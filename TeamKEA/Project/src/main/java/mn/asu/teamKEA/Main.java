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

public static MainButton mainButton = new MainButton(0, 0, 800, 500,UsedImageIcons.paris,600,500,200,100,UsedImageIcons.next, 0, 500, 200, 100, UsedImageIcons.back);
public static MainPanel mainPanel = new MainPanel(mainButton.Button , mainButton.nextButton, mainButton.backButton, 800, 640);
public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,800 , 640 ,"French Flashcards");
        }