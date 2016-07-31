package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JVowelConsonant extends JFrame implements ActionListener {

    Random rand = new Random();

    private JButton	a = new JButton("A");
    private JButton	b = new JButton("B");
    private JButton	c = new JButton("C");
    private JButton	d = new JButton("D");
    private JButton	e = new JButton("E");
    private JButton	f = new JButton("F");
    private JButton	g = new JButton("G");
    private JButton	h = new JButton("H");
    private JButton	i = new JButton("I");
    private JButton	j = new JButton("J");
    private JButton	k = new JButton("K");
    private JButton	l = new JButton("L");
    private JButton	m = new JButton("M");
    private JButton	n = new JButton("N");
    private JButton	o = new JButton("O");
    private JButton	p = new JButton("P");
    private JButton	q = new JButton("Q");
    private JButton	r = new JButton("R");
    private JButton	s = new JButton("S");
    private JButton	t = new JButton("T");
    private JButton	u = new JButton("U");
    private JButton	v = new JButton("V");
    private JButton	w = new JButton("W");
    private JButton	x = new JButton("X");
    private JButton	y = new JButton("Y");
    private JButton	z = new JButton("Z");
    private JButton[] letters = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
    private JPanel p1 = new JPanel(new GridLayout(1,4));
    private JPanel p2 = new JPanel(new GridLayout(1,4));
    private JPanel p3 = new JPanel(new FlowLayout());
    private JLabel l1 = new JLabel("");
    private Container con = getContentPane();
    private Font large = new Font("Ariel", Font.BOLD, 45);
    private Font medium = new Font("Ariel", Font.BOLD, 30);


//    create method to get one or more random numbers 0-25
    public int[] randNums(int count){
        int[] nums = new Random().ints(0, 26).distinct().limit(8).toArray();
        return nums;
    }

//    create method to determine vowel or consonant
    public String vOrC(Object c){
        if(c == a || c == e || c == i || c == o || c == u){
            return "A Vowel.";
        }
        else if(c == y){
            return "Sometimes considered a Vowel.";
        }
        else return "A Consonant.";
    }


    public JVowelConsonant(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new GridLayout(2,2));
        setSize(900,300);

//        use randomLetters method to get 8 random letters
        int[] randInts = randNums(8);

//        assign panel 1 and 2 buttons based on random letters and add the action listeners
        for(int i = 0; i < 4; i++){
            letters[randInts[i]].setFont(large);
            p1.add(letters[randInts[i]]);
            letters[randInts[i]].addActionListener(this);
        }
        for(int i = 4; i < 8; i++){
            letters[randInts[i]].setFont(large);
            p2.add(letters[randInts[i]]);
            letters[randInts[i]].addActionListener(this);
        }
        for (int i = 0; i < letters.length; i++) {
            letters[i].addActionListener(this);
        }
        p3.add(l1);
        l1.setFont(medium);
        con.add(p1);
        con.add(p2);
        con.add(p3);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        l1.setText(vOrC(o));

        p1.remove((JButton)o);
        while(p1.getComponentCount() < 4){
            int num = randNums(1)[0];
            p1.add(letters[num]);
            letters[num].setFont(large);
        }
        p2.remove((JButton)o);
        while(p2.getComponentCount() < 4){
            int num = randNums(1)[0];
            p2.add(letters[num]);
            letters[num].setFont(large);
        }

    }

    public static void main(String[] args){

        JVowelConsonant frame = new JVowelConsonant();
    }




}
