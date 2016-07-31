package Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JSmileFace2 extends JFrame implements ActionListener {

    JButton button = new JButton("Click me");
    int face = 0;
    int arc1 = 200;
    int arc2 = 140;


    public JSmileFace2(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(button, BorderLayout.SOUTH);
        button.setFont(new Font("Arial", Font.BOLD, 35));
        button.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(face == 0){
            arc1 = 20;
            arc2 = 140;
            face = 1;
        }
        else{
            arc1 = 200;
            arc2 = 140;
            face = 0;
        }
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillOval(100,100,400,400);
        g.setColor(Color.BLACK);
        g.drawOval(100,100,400,400);
        g.fillOval(200,200,60,60);
        g.fillOval(340,200,60,60);
        g.drawArc(200, 320, 200, 100, arc1, arc2);
    }

    public static void main(String[] args){
        JSmileFace2 frame = new JSmileFace2();
        frame.setSize(600,600);
        frame.setVisible(true);

    }


}
