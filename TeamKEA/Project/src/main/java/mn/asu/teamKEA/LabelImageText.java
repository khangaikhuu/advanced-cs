package mn.asu.teamKEA;

import mn.asu.aminerdene.ExampleBackground;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.text.*;

public class LabelImageText extends JPanel
{
    public LabelImageText() throws IOException {
        JLabel label1 = new JLabel( new ColorIcon(Color.ORANGE, 100, 100) );
        label1.setText( "Easy Way" );
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        add( label1 );

        //

        JLabel label2 = new JLabel( new ColorIcon(Color.YELLOW, 200, 150) );
        label2.setLayout( new BoxLayout(label2, BoxLayout.Y_AXIS) );
        add( label2 );

        JLabel text = new JLabel( "More Control" );
        text.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label2.add( Box.createVerticalGlue() );
        label2.add( text );
        label2.add( Box.createVerticalStrut(10) );

        //

        JLabel label3 = new JLabel( new ColorIcon(Color.GREEN, 200, 150) );
        label3.setLayout( new GridBagLayout() );
        add( label3 );

        JLabel text3 = new JLabel();
        text3.setText("<html><center>Text<br>over<br>Image<center></html>");
        text3.setLocation(20, 20);
        text3.setSize(text3.getPreferredSize());
        label3.add( text3 );

        //

        JLabel label4 = new JLabel( new ColorIcon(Color.CYAN, 200, 150) );
        add( label4 );

        JTextPane textPane = new JTextPane();
        textPane.setText("Add some text that will wrap at your preferred width");
        textPane.setEditable( false );
        textPane.setOpaque(false);
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        StyledDocument doc = textPane.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        textPane.setBounds(20, 20, 75, 100);
        label4.add( textPane );

        JButton b = new JButton("About Me");
        b.setSize(200, 200);
        add(b);

        ExampleBackground bg = new ExampleBackground("C:\\Users\\G12\\Pictures\\paris.jpg\\");
        add(bg);
    }

    public static class ColorIcon implements Icon
    {
        private Color color;
        private int width;
        private int height;

        public ColorIcon(Color color, int width, int height)
        {
            this.color = color;
            this.width = width;
            this.height = height;
        }

        public int getIconWidth()
        {
            return width;
        }

        public int getIconHeight()
        {
            return height;
        }

        public void paintIcon(Component c, Graphics g, int x, int y)
        {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }
    }

    private static void createAndShowUI() throws IOException {
        JFrame frame = new JFrame("LabelImageText");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new LabelImageText() );
//        JButton b = new JButton("Add Me");
//        b.setSize(300, 300);
//        frame.add(b);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try {
                    createAndShowUI();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}