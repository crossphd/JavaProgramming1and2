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
public class JColorFrame extends JFrame implements ActionListener {

    Random rand = new Random();

    JButton button = new JButton("Change Colors");
    JButton p1 = new JButton("     ");
    JButton p2 = new JButton("     ");
    JButton p3 = new JButton("     ");
    JButton p4 = new JButton("     ");
    private Container con = getContentPane();
    private BorderLayout lay = new BorderLayout();
    private Font large = new Font("Ariel", Font.BOLD, 100);
    private Font med = new Font("Ariel", Font.BOLD, 20);

    public JColorFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(lay);
        button.setFont(med);
        con.add(button, lay.CENTER);
        p1.setFont(large);
        p2.setFont(large);
        p3.setFont(large);
        p4.setFont(large);
        con.add(p1, lay.EAST);
        con.add(p2, lay.SOUTH);
        con.add(p3, lay.NORTH);
        con.add(p4, lay.WEST);
        button.addActionListener(this);
        setSize(600,600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a){

        int num = rand.nextInt(4);
        int num2 = rand.nextInt(8);
        Color[] colors = {Color.RED, Color.BLACK, Color.YELLOW, Color.GREEN, Color.CYAN,
                Color.MAGENTA, Color.ORANGE, Color.PINK};
        if(num == 0) p1.setBackground(colors[num2]);
        else if (num == 1) p2.setBackground(colors[num2]);
        else if (num == 2) p3.setBackground(colors[num2]);
        else if (num == 3) p4.setBackground(colors[num2]);

    }

    public static void main(String[] args){

        JColorFrame frame = new JColorFrame();
    }
}
