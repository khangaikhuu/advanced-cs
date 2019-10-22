package mn.asu.aminerdene;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ExampleText  extends JFrame implements ActionListener {

    public static void main(String[] args) throws IOException {
        ExampleText ex = new ExampleText();
        //ex.createSelectionFrame();
        JFrame f = new JFrame();

        ExampleBackground ok = new ExampleBackground("C:\\Users\\G12\\Desktop\\paris.jpg");
        f.getContentPane().add(ok);
        f.show();
        f.setSize(1600,900);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JTextField t;

        JFrame f;

        JButton b;

        JLabel l;
        text();
    }
        public void createSelectionFrame()
        {
            JFrame f =new JFrame("Let's Learn French!");
            JTextField t1,t2;
            t1=new JTextField("Welcome to KEA");
            t1.setBounds(50,100, 200,30);
            t2=new JTextField("Let's Learn French!l");
            t2.setBounds(50,150, 200,30);
            f.add(t1); f.add(t2);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
        }

        public void text()
        {

        }

}
