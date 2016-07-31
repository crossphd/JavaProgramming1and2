package Java2_finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JCatchTheMouse extends JFrame implements ActionListener {

    Random rand = new Random();
    JLabel gl1 = new JLabel("Click the X");
    JLabel gl2 = new JLabel();
    JLabel gl3 = new JLabel();
    JLabel gl4 = new JLabel();
    JButton[] buttons = new JButton[48];
    JPanel p1 = new JPanel(new FlowLayout());
    JPanel p2 = new JPanel(new GridLayout(8,6));
    JPanel p3 = new JPanel(new FlowLayout());
    Font f1 = new Font("Arial", Font.PLAIN, 30);
    Font f2 = new Font("Arial", Font.PLAIN, 50);
    Font f3 = new Font("Arial", Font.PLAIN, 25);
    Container con = getContentPane();
    double clicks = 0;
    int correct = 0;
    int xLoc =  rand.nextInt(48);

    public void generateButtons(){
        for(int i = 0; i < 48; i++){
            buttons[i] = new JButton();
        }
    }

    public JCatchTheMouse(){
        super("Catch the Mouse");
        generateButtons();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        setSize(800, 800);
        gl1.setFont(f2);
        gl2.setFont(f3);
        gl3.setFont(f3);
        gl4.setFont(f3);
        p1.add(gl1);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setFont(f1);
            p2.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        p3.add(gl2);
        p3.add(gl3);
        p3.add(gl4);
        add(p1);
        add(p2);
        add(p3);
        setVisible(true);
    }

    public void paint(Graphics g){
        buttons[xLoc].setText("X");
        con.validate();
        con.repaint();
    }

    public void actionPerformed(ActionEvent e){
        clicks++;
        Object o = e.getSource();
        if(correct < 10 && o == buttons[xLoc]){
            buttons[xLoc].setText("");
            xLoc =  rand.nextInt(48);
            buttons[xLoc].setText("X");
            correct++;
        }
        if(correct == 10){
            gl2.setText("Congratulations, you got 10 right!");
            gl3.setText("You got " + (correct/clicks*100)+ "% of them right.");
            gl4.setText("Christopher Ross - CHR2261492 - CIS263AA - Class #15222");

        }
        validate();
        repaint();
    }

    public static void main(String[] args){
        JCatchTheMouse frame = new JCatchTheMouse();
    }
}
