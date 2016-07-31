package Chapter17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JPasswordC extends JApplet implements ActionListener {

    JLabel l1 = new JLabel("Enter your password");
    Font f1 = new Font("Arial", Font.PLAIN, 20);
    JTextField pw = new JTextField(20);
    JButton b1 = new JButton("Submit");
    JLabel l2 = new JLabel("Access Denied");
    Container con = getContentPane();
    String[] passwords = new String[]{"rosebud", "redrum", "jason", "surrender", "dorothy"};


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
        for(String p : passwords){
            if(p.equals(pwd)){
                l2.setText("Access Granted");
            }
        }
        con.add(l2);
        validate();
        repaint();

    }
}