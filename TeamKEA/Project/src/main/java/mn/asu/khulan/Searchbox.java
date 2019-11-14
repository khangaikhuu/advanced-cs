package mn.asu.khulan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Searchbox extends JFrame implements ActionListener {
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;

    public static void main(String[] args) {
        f = new JFrame("textfield");
        l = new JLabel("nothing entered");
        b = new JButton("submit");
        Searchbox te = new Searchbox();
        b.addActionListener(te);
        t = new JTextField("enter the word", 16);
        JPanel p = new JPanel();
        p.add(t);
        p.add(b);
        p.add(l);
        f.add(p);
        f.setSize(300, 300);

        f.show();
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String s = actionEvent.getActionCommand();
        if (s.equals("submit")) {
            l.setText(t.getText());
            t.setText("  ");
        }
    }
}