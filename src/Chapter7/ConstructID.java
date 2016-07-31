package Chapter7;

import javax.swing.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class ConstructID {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog(null, "Enter your full name:");
        String address = JOptionPane.showInputDialog(null, "Enter your street address:");
        String ID = "";

//        get first letter of name
        ID += Character.toUpperCase(name.charAt(0));

//        get remaining acronym of name
        for(int x = 0; x < name.length(); x++){
            if(name.charAt(x) == ' '){
                ID += Character.toUpperCase(name.charAt(x+1));
            }
        }

//        get acronym of address
        for(int x = 0; x < address.length(); x++){
            if(Character.isDigit(address.charAt(x))){
                ID += address.charAt(x);
            }
        }

        JOptionPane.showMessageDialog(null, ID);
    }
}
