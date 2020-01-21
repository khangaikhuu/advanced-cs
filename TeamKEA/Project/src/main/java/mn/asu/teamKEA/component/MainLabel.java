package mn.asu.teamKEA.component;

import javax.swing.*;
import java.awt.*;

public class MainLabel {

    public JLabel Label = new JLabel();


    public MainLabel(String text, int x, int y, int width, int height) {
        Label.setText(text);
        Label.setBounds(x, y, width, height);
        Label.setFont(new Font("Arial", Font.ITALIC, 30));
    }
}
