package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class JPopulation extends JFrame
implements ItemListener{

    FlowLayout flow = new FlowLayout();
    String[] cities = {"New York", "Los Angeles", "Boston", "London", "Rome", "San Diego", "Tampa"};
    int[] population = {6000000, 300000, 130405, 33882, 3019295, 604981, 900000};
    JComboBox city = new JComboBox(cities);
    JLabel label = new JLabel("");
    Font large = new Font("Ariel", Font.BOLD, 18);
    JLabel pop = new JLabel("");

    public JPopulation(){
        JFrame frame = new JFrame("City Picker");
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 150);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        city.setFont(large);
        pop.setFont(large);
        frame.add(city);
        frame.add(pop);
        city.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
        int i = city.getSelectedIndex();
        pop.setText("Popluation: " + String.valueOf(population[i]));
    }

    public static void main(String[] args){
        JPopulation frame = new JPopulation();
    }

}
