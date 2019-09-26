/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttontest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author justaguy
 */
public class ButtonTest {

    /**
     * @param args the command line arguments
     */
    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    private File file;
    private File file2;
    private BufferedImage image;
    private BufferedImage image2;
    private JLabel label1; 
    private ImageIcon icon;
    private JLabel label2;
    private ImageIcon icon2;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ButtonTest ex = new ButtonTest();
        ex.doStuff();
    }
    public void doStuff()
{
    frame = new JFrame("frame");
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        panel = new JPanel();
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.add(panel,BorderLayout.CENTER);
        file = new File("/home/justaguy/Pictures/git_hub_profile.jpeg");
        try
        {
        image = ImageIO.read(file);
        }
        catch(IOException e)
        {
        e.printStackTrace();
        } 
        
        file2 = new File("/home/justaguy/Pictures/proxy.duckduckgo.com.jpeg");
        try
        {
        image2 = ImageIO.read(file2);
        }
        catch(IOException e)
        {
        e.printStackTrace();
        } 
        
        icon2 = new ImageIcon(image2);
        
        icon = new ImageIcon(image);
        label2 = new JLabel();
        label1 = new JLabel(icon);
        panel.add(label1);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        button1.addActionListener(new button1Listener());
        button2.addActionListener(new button2Listener());
        frame.repaint();
}
    class button1Listener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label1.setIcon(icon2);
        
    }
}
    class button2Listener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label1.setIcon(icon);
    }
}
    }


