package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JDisappearingFriends extends JFrame
implements ActionListener{

//    creating a string array of friends names to display randomly
    String f1 = new String("Bob");
    String f2 = new String("Mike");
    String f3 = new String("Doug");
    String f4 = new String("Sally");
    String f5 = new String("Mary");
    String[] friends = new String[]{f1, f2, f3, f4, f5};
    JLabel label = new JLabel(friends[0]);

    Font large = new Font("Ariel", Font.BOLD, 18);
    JButton b1 = new JButton("Change Friend");
    Random rand = new Random();


    public JDisappearingFriends(){
        JFrame frame = new JFrame("Disappearing Friends");
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 110);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

//        added below to center upper left corner of frame on screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        b1.setFont(large);
        label.setFont(large);
        frame.add(b1);
        frame.add(label);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {

//        generate random number 0 - 4 to pick a name from friends name array above
        int x = rand.nextInt(5);
        label.setText(friends[x]);


    }
    public static void main(String[] args){
        JDisappearingFriends frame = new JDisappearingFriends();

    }








}
