import javax.swing.*;
/**
 * Write a description of class FrameButton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FrameButton
{
     public static void main(String[] args)
     {
        JFrame a = new JFrame();
         JButton b = new JButton("Start");
         a.add(b);
         a.setSize(500,500);
         a.setLayout(null);
         a.setVisible(true);
         b.setBounds(160,150,150,100);
    }
}
