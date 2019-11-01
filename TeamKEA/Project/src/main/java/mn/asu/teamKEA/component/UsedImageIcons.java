package mn.asu.teamKEA.component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class UsedImageIcons {

    public static Image ourImage;
    public static Image getImage(String filename)
    {
        File sourceImage = new File(getClass().getClassLoader().getResource("static/Pariss.JPG").getFile());
       // File sourceImage = new File("resources/static/Pariss.jpg");
        ourImage = ImageIO.read(sourceImage);
        return ourImage;
    }



    public UsedImageIcons() throws IOException {

    }

    public static ImageIcon chanter = new ImageIcon(getImage());

    public static ImageIcon penser = new ImageIcon("C:\\Users\\G12\\Pictures\\slide_3.jpg");//C:\Users\G12\Downloads\TEAMKEA RESOURCES
}
