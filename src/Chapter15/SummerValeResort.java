package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class SummerValeResort extends JFrame implements ActionListener{

    private JMenuBar mainBar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu rooms = new JMenu("Rooms");
    private JMenu dining = new JMenu("Dining");
    private JMenu activities = new JMenu("Activity");
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem room1 = new JMenuItem("Grand Room");
    private JMenuItem room2 = new JMenuItem("Studio Room");
    private JMenuItem dining1 = new JMenuItem("Formal Dining");
    private JMenuItem dining2 = new JMenuItem("Fast Food");
    private JMenuItem activity1 = new JMenuItem("Hiking");
    private JMenuItem activity2 = new JMenuItem("Wine Tasting");
    private JLabel l1 = new JLabel("Select options from menu");
    private JLabel l2 = new JLabel("");
    private Font med = new Font("Ariel", Font.BOLD, 19);


    public SummerValeResort(){
        setTitle("Summervale Resort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,150);
        setLayout(new FlowLayout());
        l1.setFont(med);
        add(l1);
        setJMenuBar(mainBar);
        mainBar.add(file);
        mainBar.add(rooms);
        mainBar.add(dining);
        mainBar.add(activities);
        file.add(exit);
        rooms.add(room1);
        rooms.add(room2);
        dining.add(dining1);
        dining.add(dining2);
        activities.add(activity1);
        activities.add(activity2);
        exit.addActionListener(this);
        room1.addActionListener(this);
        room2.addActionListener(this);
        dining1.addActionListener(this);
        dining2.addActionListener(this);
        activity1.addActionListener(this);
        activity2.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        Object o = e.getSource();
        if(o == exit){
            System.exit(0);
        }
        else if(o == room1){
            l1.setText("The first room is a beautiful Grand Room for $300 per night.");
        }
        else if(o == room2){
            l1.setText("The 2nd room is a quaint but luxurious studio with all the amenities for $195 per night");
        }
        else if(o == dining1){
            l1.setText("There are 4 fine dining restaurants nearby!");
        }
        else if(o == dining2){
            l1.setText("Fast food can also be had for the low-cost quick-bite!");
        }
        else if(o == activity1){
            l1.setText("Enjoy hiking at the majestic Acme peak.");
        }
        else if(o == activity2){
            l1.setText("There are 3 wineries within 30 minutes of the resort.");
        }


    }

    public static void main(String[] args){
        SummerValeResort win1 = new SummerValeResort();
    }

}
