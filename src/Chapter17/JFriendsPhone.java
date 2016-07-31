package Chapter17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JFriendsPhone extends JApplet implements ActionListener {

    Font f1 = new Font("Arial", Font.PLAIN, 20);
    JLabel l1 = new JLabel("First Name:");
    JTextField name = new JTextField( 20);
    JLabel l2 = new JLabel("Phone Number (123-234-3456):");
    JTextField num = new JTextField( 20);
    JButton b1 = new JButton("Search Name");
    JButton b2 = new JButton("Search Number");
    JLabel l3 = new JLabel();
    Container con = getContentPane();
    String[] names = new String[]{"joe", "mike", "mary", "jen", "bob"};
    String[] nums = new String[]{"111-111-1111", "222-222-2222", "333-333-3333",
            "444-444-4444", "555-555-5555"};
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();


    public void init(){
        con.setLayout(new GridLayout(3,1));
        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f1);
        b1.setFont(f1);
        b2.setFont(f1);
        name.setFont(f1);
        num.setFont(f1);
        p1.add(l1);
        p1.add(name);
        p1.add(b1);
        p2.add(l2);
        p2.add(num);
        p2.add(b2);
        p2.add(new JSeparator(SwingConstants.HORIZONTAL));
        p3.add(l3);
        con.add(p1);
        con.add(p2);
        con.add(p3);
        b1.addActionListener(this);
        name.addActionListener(this);
        b2.addActionListener(this);
        num.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int input = 0;
        if(e.getSource() == b1 || e.getSource() == name){input = 1;}
        else if(e.getSource() == b2 || e.getSource() == num){input = 2;}
        String input1 = name.getText().toLowerCase();
        String input2 = num.getText();

        if(input == 1){
            for(int i = 0; i < names.length; i++){
                if(names[i].equals(input1)){
                    l3.setText(nums[i]);
                    break;
                }
                else l3.setText("Name not found.");
            }
        }
        else if(input == 2){
            for(int i = 0; i < nums.length; i++){
                if(nums[i].equals(input2)){
                    l3.setText(names[i]);
                    break;
                }
                else l3.setText("Number not found.");
            }
        }
        validate();
        repaint();

    }
}
