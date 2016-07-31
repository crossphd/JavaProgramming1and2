package Chapter9;

import javax.swing.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Schedule {

    public static void main(String[] args){


        String[][] courses = new String[3][3];
        courses[0] = new String[]{"CIS 101", "CIS 102", "CIS 201"};
        courses[1] = new String[]{"Monday", "Tuesday", "Wednesday"};
        courses[2] = new String[]{"1:30 PM", "8:00 AM", "11:00 AM"};

        double[][] cost = new double[3][3];
        cost[0] = new double[]{2.00, 3.00, 4.50};


        String course = "";

        do{
            course = JOptionPane.showInputDialog(null, "Enter a course name (e.g., 'CIS 101')");
            if(contains(courses[0], course)){
                System.out.println("contains method worked");
                for(int i = 0; i < courses[0].length; i++){
                    if(course.equals(courses[0][i])){
                        JOptionPane.showMessageDialog(null,"That course is on " + courses[1][i]
                                + " at " + courses[2][i]);
                    }
                }

            }
            else JOptionPane.showMessageDialog(null, "That is not a valid course, try again.");

        }
//        while(course != "CIS 101" || course != "CIS 102" || course != "CIS 201");
        while(!(contains(courses[0], course)));
    }

//    created a compare method to determine if the course the user entered is in the course name array
    public static <T> boolean contains(final T[] array, final T v) {
        if (v == null) {
            for (final T e : array)
                if (e == null)
                    return true;
        } else {
            for (final T e : array)
                if (e == v || v.equals(e))
                    return true;
        }
        return false;
    }
}
