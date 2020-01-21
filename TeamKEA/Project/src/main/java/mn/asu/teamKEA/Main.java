package mn.asu.teamKEA;

import mn.asu.teamKEA.component.*;
import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {
        UsedImageIcons.dataBase();
        mainButton.nextWord();
        mainButton.nextSet();
        mainButton.backSet();
        }

public static MainButton mainButton = new MainButton(0, 0, 800, 500,UsedImageIcons.paris,600,500,200,100,UsedImageIcons.next, 0, 500, 200, 100, UsedImageIcons.back);
public static MainLabel mainLabel = new MainLabel(MainButton.set+1+"/"+UsedImageIcons.database.length,400,500,100,100);
public static MainPanel mainPanel = new MainPanel(mainButton.Button , mainButton.nextButton, mainButton.backButton, mainLabel.Label,800, 640);
public static MainFrame mainFrame = new MainFrame(mainPanel.Panel ,800 , 640 ,"French Flashcards");
        }