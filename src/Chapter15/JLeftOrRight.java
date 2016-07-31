package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JLeftOrRight extends JFrame implements MouseListener {

    JLabel l1 = new JLabel("Click for the mouse number.");
    private Container con = getContentPane();
    private Font med = new Font("Ariel", Font.BOLD, 40);

    public JLeftOrRight(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,125);
        con.setLayout(new FlowLayout());
        l1.setFont(med);
        add(l1);
        addMouseListener(this);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent a){
        int num = a.getButton();
        l1.setText("You clicked button " + num);
        con.validate();
        con.repaint();
    }

    public void mouseEntered(MouseEvent a){}
    public void mouseExited(MouseEvent a){}
    public void mousePressed(MouseEvent a){}
    public void mouseReleased(MouseEvent a){}


    public static void main(String[] args){

        JLeftOrRight frame = new JLeftOrRight();
    }
}