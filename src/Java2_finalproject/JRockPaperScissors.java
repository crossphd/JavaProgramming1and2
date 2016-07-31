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
public class JRockPaperScissors extends JApplet implements ActionListener {

    Random rand = new Random();
    JLabel gl1 = new JLabel("Rock, Paper, Scissors");
    JLabel gl2 = new JLabel("Choose one button");
    JLabel gl3 = new JLabel("              ------Results------               ");
    JLabel gl4 = new JLabel();
    JLabel gl5 = new JLabel();
    JLabel gl6 = new JLabel();
    JButton rock = new JButton("Rock");
    JButton paper = new JButton("Paper");
    JButton scissors = new JButton("Scissors");
    JPanel p1 = new JPanel(new FlowLayout());
    JPanel p2 = new JPanel(new FlowLayout());
    JPanel p3 = new JPanel(new FlowLayout());
    Font f1 = new Font("Arial", Font.BOLD, 30);
    Font f2 = new Font("Arial", Font.BOLD, 50);
    Font f3 = new Font("Arial", Font.BOLD, 20);
    Container con = getContentPane();
    int compGuess = 0;
    int compScore = 0;
    int playerScore = 0;
    int tieScore = 0;
    String[] options = {"Rock", "Paper", "Scissors"};


    public void init() {
        setLayout(new GridLayout(7, 1));
        setSize(800, 500);
        gl1.setFont(f2);
        gl2.setFont(f1);
        gl3.setFont(f1);
        gl4.setFont(f3);
        gl5.setFont(f3);
        gl6.setFont(f3);
        rock.setFont(f1);
        paper.setFont(f1);
        scissors.setFont(f1);
        p2.add(gl1);
        p1.add(gl2);
        p1.add(rock);
        p1.add(paper);
        p1.add(scissors);
        add(p2);
        add(p1);
        add(gl3);
        add(gl4);
        add(gl5);
        add(gl6);
        add(p3);
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissors.addActionListener(this);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        compGuess = rand.nextInt(3);
        if (o == rock) {
            gl4.setText("You picked Rock --- Computer picked " + options[compGuess]);
            if (compGuess == 0) {
                gl5.setText("Tie");
                tieScore++;
            } else if (compGuess == 1) {
                gl5.setText("Winner: Computer");
                compScore++;
            } else if (compGuess == 2) {
                gl5.setText("Winner: You");
                playerScore++;
            }
        }
        if (o == paper) {
            gl4.setText("You picked Paper --- Computer picked " + options[compGuess]);
            if (compGuess == 1) {
                gl5.setText("Tie");
                tieScore++;
            } else if (compGuess == 2) {
                gl5.setText("Winner: Computer");
                compScore++;
            } else if (compGuess == 0) {
                gl5.setText("Winner: You");
                playerScore++;
            }
        }
        if (o == scissors) {
            gl4.setText("You picked Scissors --- Computer picked " + options[compGuess]);
            if (compGuess == 2) {
                gl5.setText("Tie");
                tieScore++;
            } else if (compGuess == 0) {
                gl5.setText("Winner: Computer");
                compScore++;
            } else if (compGuess == 1) {
                gl5.setText("Winner: You");
                playerScore++;
            }
        }

        gl6.setText("Score --  You: " + playerScore + "  Computer: " + compScore + "  Ties: " + tieScore);

        validate();
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString("Christopher Ross - CHR2261492 - CIS263AA - Class #15222", 5, 485);

    }

}



