package Chapter7;

import javax.swing.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class ThreeLetterAcronym {

    public static void main(String[] args) {

//        originally wrote a do while loop that continued to prompt for 3 words until user entered 3
//        but then realized you wanted an error message only after not getting 3 words
//        so switched code to just use the if else statements below to give the error message
        String input = JOptionPane.showInputDialog(null, "Enter 3 words");

        String acronym = "";
        acronym += Character.toUpperCase(input.charAt(0));

        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == ' ') {
                acronym += Character.toUpperCase(input.charAt(x + 1));
            }
        }

//        below line was commented out because custom change to assignment was error
//        message instead of converting the acronym to only first 3 letters
//        acronym = acronym.substring(0, 3);

        if (acronym.length() == 3){
            JOptionPane.showMessageDialog(null, acronym);
        }
        else JOptionPane.showMessageDialog(null, "Error you didn't enter 3 words.");



    }

}

