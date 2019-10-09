package mn.asu.teamKEA;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        TextField textField = new TextField();
        Button button = new Button();
        Frame frame = new Frame();

        textField.createTitle("Let's learn French", 450, -100 , 1000, 700);
        button.createStartButton(430,550,150,70);
        frame.createStartFrame(button.getStartButton(), textField.getTitle(), 1599, 900, "Welcome to French Flashcards!");
    }





}
