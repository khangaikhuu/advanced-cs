package mn.asu.teamKEA.component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class UsedImageIcons {

    public static Image ourImage;
    public static String[][] database = new String[35][2];
    public static Image getImage(String filename) throws IOException {
        File sourceImage = new File(UsedImageIcons.class.getClassLoader().getResource(filename).getFile());

        ourImage = ImageIO.read(sourceImage);
        return ourImage;
    }


    public UsedImageIcons() throws IOException {

    }


    public static ImageIcon paris;

    static {
        try {
            paris = getIcon("static/Pariss.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ImageIcon next;

    static {
        try {
            next = getIcon("Next.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ImageIcon getIcon(String i) throws IOException {
        Image nextTransform = getImage(i);
        Image nextScale = nextTransform.getScaledInstance(700, 500, java.awt.Image.SCALE_SMOOTH);
        ImageIcon next = new ImageIcon(nextScale);
        return next;
    }


    public static void dataBase() throws IOException {
        UsedImageIcons.class.getClassLoader().getResources(".jpg");
        database[0][0] = "Welcome to the French Flashcards. Hope it helps you in your French journey!";
        database[1][0] = "Aimer";
        database[2][0] = "Arriver";
        database[3][0] = "Chercher";
        database[4][0] = "Commencer";
        database[5][0] = "Demander";
        database[6][0] = "Depenser";
        database[7][0] = "Detester";
        database[8][0] = "Diner";
        database[9][0] = "Donner";
        database[10][0] = "Ecouter";
        database[11][0] = "Entrer";
        database[12][0] = "Etudier";
        database[13][0] = "Fermer";
        database[14][0] = "Habiter";
        database[15][0] = "Inviter";
        database[16][0] = "Jouer";
        database[17][0] = "Laver";
        database[18][0] = "Manger";
        database[19][0] = "Monter";
        database[20][0] = "Nager";
        database[21][0] = "Organiser";
        database[22][0] = "Telephoner";
        database[23][0] = "Parler";
        database[24][0] = "Passer";
        database[25][0] = "Penser";
        database[26][0] = "Porter";
        database[27][0] = "Rever";
        database[28][0] = "Travailler";
        database[29][0] = "Trouver";
        database[30][0] = "Visiter";
        database[31][0] = "Voler";
        database[32][0] = "Voyager";
        database[33][0] = "Danser";

        database[0][1]= "static/Pariss.jpg";
        database[1][1]= "static/Aimer.JPG";
        database[2][1]= "static/Arriver.JPG";
        database[3][1]= "static/Chercher.JPG";
        database[4][1]= "static/Commencer.JPG";
        database[5][1]= "static/Depenser.JPG";
        database[6][1]= "static/Demander.JPG";
        database[7][1]= "static/Detester.JPG";
        database[8][1]= "static/Diner.JPG";
        database[9][1]= "static/Donner.JPG";
        database[10][1]= "static/Ecouter.JPG";
        database[11][1]= "static/Entrer.JPG";
        database[12][1]= "static/Etudier.JPG";
        database[13][1]= "static/Fermer.JPG";
        database[14][1]= "static/Habiter.JPG";
        database[15][1]= "static/Inviter.JPG";
        database[16][1]= "static/Jouer.JPG";
        database[17][1]= "static/Laver.JPG";
        database[18][1]= "static/Manger.JPG";
        database[19][1]= "static/Monter.JPG";
        database[20][1]= "static/Nager.JPG";
        database[21][1]= "static/Organiser.JPG";
        database[22][1]= "static/Parler.JPG";
        database[23][1]= "static/Passer.JPG";
        database[24][1]= "static/Penser.JPG";
        database[25][1]= "static/Porter.JPG";
        database[26][1]= "static/Rever.JPG";
        database[27][1]= "static/Telephoner.JPG";
        database[28][1]= "static/Travailler.JPG";
        database[29][1]= "static/Trouver.JPG";
        database[30][1]= "static/Visiter.JPG";
        database[31][1]= "static/Voler.JPG";
        database[32][1]= "static/Voyager.JPG";
        database[33][1] = "static/Danser.JPG";
    }


}


