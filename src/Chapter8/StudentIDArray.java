package Chapter8;

import javax.swing.*;


/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class StudentIDArray {

    public static void main(String[] args){

        int[] studentID = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
        String[] firstName = new String[]{"Luke", "Chewy", "Obi", "Jabba",
                "C3PO", "Han", "Leia", "Yoda", "R2", "Boba"};
        double[] gpa = {2.5, 3.7, 4.0, 3.2, 2.9, 3.2, 3.5, 4.5, 3.6, 3.1};
        boolean in = false;

//        will continue to request ID number until valid one entered
        while (!in){
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the student ID number:"));

            for(int i = 0; i < studentID.length; i++){
                if(studentID[i] == input){
                    JOptionPane.showMessageDialog(null, "Student ID " + studentID[i] + " is "
                            + firstName[i] + " with a " + gpa[i] + " GPA.");
                    in = true;

                }
            }
//            error message and hint on correct ID numbers
            if(!in) JOptionPane.showMessageDialog(null, input + " is not a valid ID number. Hint: try 100-109");
        }
    }
}
