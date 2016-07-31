package Java2_finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class #15222
 */
public class JLottery2 extends JFrame implements ItemListener, ActionListener {

    Random rand = new Random();
    JMenuBar menu = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem about = new JMenuItem("About");
    JLabel gl1 = new JLabel("Select 6 Numbers");
    JLabel gl2 = new JLabel();
    JLabel gl3 = new JLabel();
    JLabel gl4 = new JLabel();
    JCheckBox[] gameNums = new JCheckBox[30];
    JPanel p1 = new JPanel(new FlowLayout());
    JPanel p2 = new JPanel(new GridLayout(6,5));
    JPanel p3 = new JPanel(new FlowLayout());
    int[] winningNums = rand.ints(0, 31).distinct().limit(6).toArray();
    int[] guessedNums = new int[6];
    Font f1 = new Font("Arial", Font.PLAIN, 30);
    Font f2 = new Font("Arial", Font.PLAIN, 50);
    Font f3 = new Font("Arial", Font.PLAIN, 25);
    int num = 0;

    public void generateNums(){
        for(int i = 0; i < 30; i++){
            gameNums[i] = new JCheckBox(String.valueOf(i+1));
        }
    }

    public JLottery2(){
        super("Pick 6 Lottery");
        generateNums();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        setSize(800, 800);
        setJMenuBar(menu);
        menu.add(file);
        file.add(about);
        file.addActionListener(this);
        about.addActionListener(this);
        gl1.setFont(f2);
        gl2.setFont(f3);
        gl3.setFont(f3);
        gl4.setFont(f3);
        p1.add(gl1);
        for (int i = 0; i < gameNums.length; i++) {
            gameNums[i].setFont(f1);
            p2.add(gameNums[i]);
            gameNums[i].addItemListener(this);
        }
        p3.add(gl2);
        p3.add(gl3);
        p3.add(gl4);
        add(p1);
        add(p2);
        add(p3);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {

        Object choice = e.getItem();

        if(num < 6){
            for(int i = 0; i < gameNums.length; i++){
                if(gameNums[i] == choice){
                    System.out.println(num + "showing choice" + guessedNums[num]);
                    gameNums[i].setEnabled(false);
                    guessedNums[num] = (i+1);
                    num++;
                }
            }
        }
        if(num == 6){
            for(int i = 0; i < gameNums.length; i++){
                gameNums[i].setEnabled(false);
            }

            StringBuilder win = new StringBuilder("The winning numbers are: ");
            for(int i : winningNums){
                win.append(i + " ");
            }
            gl2.setText(win.toString());

            StringBuilder guess = new StringBuilder("The numbers you guessed were: ");
            for(int i : guessedNums){
                guess.append(i + " ");
            }
            gl3.setText(guess.toString());

            int score = 0;
            for (int i = 0; i < guessedNums.length; i++) {
                for (int j = 0; j < winningNums.length; j++) {
                    if (guessedNums[i] == winningNums[j]) {
                        score++;
                    }
                }
            }
            if(score == 3){
                gl4.setText("With " + score + " number right, you won $100!");
            }
            else if(score == 4){
                gl4.setText("With " + score + " number right, you won $10,000!");
            }
            else if(score == 5){
                gl4.setText("With " + score + " number right, you won $50,000!");
            }
            else if(score == 6){
                gl4.setText("With " + score + " number right, you won $1,000,000!");
            }
            else gl4.setText("     Sorry, you lost.     ");

        }
        validate();
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        Object choice = e.getSource();
        if (choice == about) {
            JOptionPane.showMessageDialog(null,"Created by Christopher Ross - CHR2261492" +
                    "\nCIS263AA - Java Programming: Level II - Class # 15222");
        }
    }

    public static void main(String[] args) {
        JLottery2 frame = new JLottery2();

    }




}
