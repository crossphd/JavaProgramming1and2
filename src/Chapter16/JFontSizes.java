package Chapter16;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JFontSizes extends JFrame {

    JLabel[] labels = new JLabel[15];
    String text = "I'm a witty phrase.";
    int fontSize = 6;

    public void makeLabels(){
        for(int i = 0; i < labels.length; i++){
            labels[i] = new JLabel(text);
            labels[i].setFont(new Font("Arial", Font.PLAIN, fontSize));
            fontSize++;
        }
    }


    public JFontSizes(){

        super("Fonts galore");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(15,1));
        setSize(300, 800);
        makeLabels();
        for(int i = 0; i < labels.length; i++){
            add(labels[i]);
        }
        setVisible(true);

    }

    public static void main(String[] args){
        JFontSizes frame = new JFontSizes();
    }
}
