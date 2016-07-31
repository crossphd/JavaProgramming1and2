package Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JSmileFace extends JFrame{



    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillOval(100,100,400,400);
        g.setColor(Color.BLACK);
        g.drawOval(100,100,400,400);
        g.fillOval(200,200,60,60);
        g.fillOval(340,200,60,60);
        g.drawArc(200, 300, 200, 100, 200, 140);
    }

    public static void main(String[] args){
        JSmileFace frame = new JSmileFace();
        frame.setSize(600,600);
        frame.setVisible(true);

    }

}
