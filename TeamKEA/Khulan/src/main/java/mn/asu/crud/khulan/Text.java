package mn.asu.crud.khulan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame implements ActionListener {
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;

    public static void main(String[] args) {
        f = new JFrame("textfield");
        l = new JLabel("nothing entered");
        b = new JButton("submit");
        Text te = new Text();
        b.addActionListener(te);
        t = new JTextField("enter the text", 16);
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