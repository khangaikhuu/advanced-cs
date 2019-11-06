package mn.asu.teamKEA.component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class UsedImageIcons {

    public static Image ourImage;
    public static Image getImage(String filename) throws IOException {
        File sourceImage = new File(UsedImageIcons.class.getClassLoader().getResource(filename).getFile());

        ourImage = ImageIO.read(sourceImage);
        return ourImage;
    }



    public UsedImageIcons() throws IOException {

    }

    public static ImageIcon icon1;

    static {
        try {
            icon1 = new ImageIcon(getImage("static/Arriver.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ImageIcon icon2;


    static {
        try {
            icon2 = new ImageIcon(getImage("static/Aimer.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ImageIcon paris;

    static {
        try {
            paris = new ImageIcon(getImage("static/Pariss.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ImageIcon PreImage;

    static {
        try {
            PreImage = new ImageIcon(getImage("static/Danser.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Image transform = PreImage.getImage();
    public static Image scale= transform.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
    public static ImageIcon img  = new ImageIcon(scale);



}



