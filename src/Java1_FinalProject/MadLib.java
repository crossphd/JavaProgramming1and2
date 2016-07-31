package Java1_FinalProject;

import javax.swing.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class MadLib{

    public static void main(String[] args){

        //call madLibs method to start game
        madLibs();
    }

    //madLibs method for game
    public static void madLibs(){

        //create JTextFields for the words
        JTextField color = new JTextField();
        JTextField noun1 = new JTextField();
        JTextField noun2 = new JTextField();
        JTextField noun3 = new JTextField();
        JTextField adjective = new JTextField();
        JTextField verb = new JTextField();

        //object array to display in JOptionPane
        Object[] popup = {"Enter the following:", "Color:", color,"Plural Noun:", noun1,
                "Plural Noun:", noun2, "Singular Noun:", noun3, "Adjective:", adjective,
                "Plural Verb:", verb};

        //create JOptionPane
        int option = JOptionPane.showConfirmDialog(null, popup, "Baa Baa Black Sheep Mad Libs",
                JOptionPane.OK_CANCEL_OPTION);

        //display Mad Lib for entered words if OK selected, else display game over
        if (option == JOptionPane.OK_OPTION) {
            System.out.println();
            System.out.println("Baa, baa, " + color.getText() + " sheep,");
            System.out.println("Have you any " + noun1.getText() + "?");
            System.out.println("Yes sir, yes sir,");
            System.out.println("Three " + noun2.getText() + " full;");
            System.out.println("One for the master,");
            System.out.println("And one for the " + noun3.getText() + ",");
            System.out.println("And one for the " + adjective.getText() + " boy");
            System.out.println("Who " + verb.getText() + " down the lane.");

            //prompt to play again and call madLibs method again if YES, else display thanks message
            int option2 = JOptionPane.showConfirmDialog(null, "Want to play again?", "Baa Baa Black Sheep Mad Libs", JOptionPane.YES_NO_OPTION);
            if (option2 == JOptionPane.YES_OPTION) {
                madLibs();
            }else {
                System.out.println();
                System.out.println("Thanks for playing!");
            }

        } else {
            System.out.println("Game Over");
        }

    }

}
