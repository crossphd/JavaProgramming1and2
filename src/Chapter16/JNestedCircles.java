package Chapter16;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JNestedCircles extends JFrame {

    int xy= 285;
    int lw = 30;


    public void paint(Graphics g){
        super.paint(g);
        for(int i = 0; i < 15; i++){
            g.drawOval(xy, xy, lw, lw);
            xy -= 15;
            lw += 30;
        }
    }

    public static void main(String[] args){
        JNestedCircles frame = new JNestedCircles();
        frame.setSize(600,600);
        frame.setVisible(true);

    }
}