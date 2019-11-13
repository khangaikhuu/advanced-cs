package mn.asu.teamKEA.component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

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
    public static Image scale = transform.getScaledInstance(715, 536, java.awt.Image.SCALE_SMOOTH);
    public static ImageIcon danser = new ImageIcon(scale);


    public static ImageIcon PreImage1;

    static {
        try {
            PreImage1 = new ImageIcon(getImage("static/Demander.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Image transform2 = PreImage1.getImage();
    public static Image scale2 = transform2.getScaledInstance(715, 536, java.awt.Image.SCALE_SMOOTH);
    public static ImageIcon demander = new ImageIcon(scale2);

    public static ImageIcon nextPre;

    static {
        try {
            nextPre = new ImageIcon(getImage("Next.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

<<<<<<< HEAD

    public static Image nextTransform = nextPre.getImage();
    public static Image nextScale = nextTransform.getScaledInstance(55, 114, java.awt.Image.SCALE_SMOOTH);
    public static ImageIcon next = new ImageIcon(nextScale);

    public static ImageIcon getIcon(Image i)
    {
        Image nextTransform =nextPre.getImage();
        Image nextScale = nextTransform.getScaledInstance(54, 114,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon next= new ImageIcon(nextScale);
=======
    public static ImageIcon getIcon(String i) {
        Image nextTransform = nextPre.getImage();
        Image nextScale = nextTransform.getScaledInstance(54, 114, java.awt.Image.SCALE_SMOOTH);
        ImageIcon next = new ImageIcon(nextScale);
>>>>>>> 153caf5b1f81a5fe4c212756d8817119fc2af706
        return next;
    }


<<<<<<< HEAD


    public void addValues() throws IOException {
        UsedImageIcons.class.getClassLoader().getResources("*.jpg");
        HashMap<String , ImageIcon> hm = new HashMap();
        hm.put("danser", danser);
        hm.put("demander", demander);
=======
    public static String[][] database = new String[19][2];
    public static void dataBase()
    {
        database[1][0] = "Danser";
>>>>>>> 153caf5b1f81a5fe4c212756d8817119fc2af706
    }


}


