package Chapter15;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JLandmarkFrame extends JFrame{

    private JButton n = new JButton("Rainbow Bridge");
    private JButton s = new JButton("Disney World");
    private JButton e = new JButton("Niagra Falls");
    private JButton w = new JButton("Golden Gate Bridge");
    private JButton c = new JButton("Red Rocks");
    private Container con = getContentPane();
    private BorderLayout lay = new BorderLayout();

    public JLandmarkFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(lay);
        con.add(n, lay.NORTH);
        con.add(s, lay.SOUTH);
        con.add(e, lay.EAST);
        con.add(w, lay.WEST);
        con.add(c, lay.CENTER);
        setSize(400,250);
        n.setBackground(Color.MAGENTA);
        s.setBackground(Color.ORANGE);
        e.setBackground(Color.BLUE);
        e.setForeground(Color.WHITE);
        w.setBackground(Color.YELLOW);
        c.setBackground(Color.red);
        setVisible(true);

    }

    public static void main(String[] args){

        JLandmarkFrame frame = new JLandmarkFrame();
    }
}
