package mn.asu.teamKEA.component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public abstract class UsedImageIcons {

    public static Image ourImage;
    public static Image getImage(String filename) throws IOException {
        File sourceImage = new File(UsedImageIcons.class.getClassLoader().getResource(filename).getFile());

        ourImage = ImageIO.read(sourceImage);
        return ourImage;
    }



    public UsedImageIcons() throws IOException {

    }

    public static ImageIcon chanter;

    static {
        try {
            chanter = new ImageIcon(getImage("static/Pariss.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    ImageIcon imageIcon = new ImageIcon("static/Aimer.JPG");
    Image image = imageIcon.getImage();
    Image newing = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
    imageIcon = new ImageIcon(newing);
        }
