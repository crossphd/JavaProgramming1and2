package Chapter17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JRiddle extends JApplet implements ActionListener {

    JLabel riddle1 = new JLabel("I'm alive without breath,");
    JLabel riddle2 = new JLabel(" cold as death,");
    JLabel riddle3 = new JLabel("     ever drinking,     ");
    JLabel riddle4 = new JLabel("never thirsty.");
    JLabel riddle5 = new JLabel("     What am I?     ");
    JLabel ans = new JLabel("A Fish");
    JButton but = new JButton("Get Answer");
    Container con = getContentPane();
    Font ridF = new Font("Teen", Font.BOLD, 30);

    public void init(){
        riddle1.setFont(ridF);
        riddle2.setFont(ridF);
        riddle3.setFont(ridF);
        riddle4.setFont(ridF);
        riddle5.setFont(ridF);
        but.setFont(ridF);
        con.setLayout(new FlowLayout());
        con.add(riddle1);
        con.add(riddle2);
        con.add(riddle3);
        con.add(riddle4);
        con.add(riddle5);
        con.add(but);
        but.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        con.remove(but);
        con.remove(riddle1);
        con.remove(riddle2);
        con.remove(riddle3);
        con.remove(riddle4);
        con.remove(riddle5);
        con.add(ans);
        ans.setFont(new Font("Teen", Font.BOLD, 50));
        validate();
        repaint();
    }
}
