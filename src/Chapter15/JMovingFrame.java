package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JMovingFrame extends JFrame implements ActionListener {

    Random rand = new Random();

    JButton button = new JButton("Mystery Button");
    JPanel p1 = new JPanel(new FlowLayout());
    JPanel p2 = new JPanel(new FlowLayout());
    JPanel p3 = new JPanel(new FlowLayout());
    JPanel p4 = new JPanel(new FlowLayout());
    JLabel l1 = new JLabel("Where will I go if you click the button?");
    private Container con = getContentPane();
    private GridLayout lay = new GridLayout(2,2,5,5);
    private Font med = new Font("Ariel", Font.BOLD, 20);

    public JMovingFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,300);
        con.setLayout(lay);
        button.setFont(med);
        con.add(button);
        l1.setFont(med);
        p1.add(l1);
        con.add(p1);
        con.add(p2);
        con.add(p3);
        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent a){
        int num = rand.nextInt(3);


        Container parent = l1.getParent();
        parent.remove(l1);
        parent.validate();
        parent.repaint();

        if(num == 0) {
            p1.add(l1);
            p1.validate();
            p1.repaint();
        }
        else if (num == 1) {
            p2.add(l1);
            p2.validate();
            p2.repaint();
        }
        else if (num == 2) {
            p3.add(l1);
            p3.validate();
            p3.repaint();
        }
    }

    public static void main(String[] args){

        JMovingFrame frame = new JMovingFrame();
    }
}
