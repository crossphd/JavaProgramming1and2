package Chapter17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JPasswordB extends JApplet implements ActionListener {

    JLabel l1 = new JLabel("Enter your password");
    Font f1 = new Font("Arial", Font.PLAIN, 20);
    JTextField pw = new JTextField(20);
    JButton b1 = new JButton("Submit");
    JLabel l2 = new JLabel("Access Granted");
    Container con = getContentPane();

    public void init(){
        con.setLayout(new FlowLayout());
        l1.setFont(f1);
        l2.setFont(f1);
        b1.setFont(f1);
        con.add(l1);
        con.add(pw);
        con.add(b1);
        b1.addActionListener(this);
        pw.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String pwd = pw.getText().toLowerCase();
        con.remove(l1);
        con.remove(pw);
        con.remove(b1);
        if(!"rosebud".equals(pwd)) {
            l2.setText("Access Denied");
        }
        con.add(l2);
        validate();
        repaint();

    }
}