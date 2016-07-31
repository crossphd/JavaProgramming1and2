package Package1;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by chris_of4t8hg on 6/30/2016.
 */
public class ManyMethods {

    public static void swap(int a, int b){
        System.out.println("a and b before swap: " + a + " " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a and b after swap: " + a + " " + b);
    }

    public static void fizzbuzz(){
        String[] fzbz = new String[100];
        for(int i = 1; i <= fzbz.length; i++){
            fzbz[i-1] = Integer.toString(i);
        }
        for(int i = 1; i <= fzbz.length; i++){
            if (i% 3 == 0) fzbz[i-1] = "fizz";
            if (i% 5 == 0) fzbz[i-1] = "buzz";
            if(i% 3 == 0 && i% 5 == 0) fzbz[i-1] = "fizzbuzz";
        }
        for(int i = 0; i < fzbz.length; i++){
            System.out.println(fzbz[i]);
        }


    }






    public static void dollarConv(){
        Scanner scan = new Scanner(System.in);

        String totString = JOptionPane.showInputDialog(null, "Enter total dollars to convert",
                "Dollar Conversion", JOptionPane.QUESTION_MESSAGE);

        int totInt = Integer.parseInt(totString);
        int tot20 = totInt/20;
        int tot10 = (totInt % 20) / 10;
        int tot5 = ((totInt % 20) % 10) / 5;
        int tot1 = ((totInt % 20) % 10) % 5;
        DecimalFormat money = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, "The conversion of $" + money.format(totInt) +
                " = " + tot20 + " - 20s, " + tot10 + " - 10s, " + tot5 + " - 5s, and " + tot1 + " - 1s.");
    }

    public static void madLibs() {
        JTextField color = new JTextField();
        JTextField noun1 = new JTextField();
        JTextField noun2 = new JTextField();
        JTextField noun3 = new JTextField();
        JTextField adjective = new JTextField();
        JTextField verb = new JTextField();
        Object[] popup = {"Enter the following:", "Color:", color, "Plural Noun:", noun1,
                "Plural Noun:", noun2, "Singular Noun:", noun3, "Adjective:", adjective,
                "Plural Verb:", verb};

        int option = JOptionPane.showConfirmDialog(null, popup, "Baa Baa Black Sheep Mad Libs", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            System.out.println("");
            System.out.println("Baa, baa, " + color.getText() + " sheep,");
            System.out.println("Have you any " + noun1.getText() + "?");
            System.out.println("Yes sir, yes sir,");
            System.out.println("Three " + noun2.getText() + " full;");
            System.out.println("One for the master,");
            System.out.println("And one for the " + noun3.getText() + ",");
            System.out.println("And one for the " + adjective.getText() + " boy");
            System.out.println("Who " + verb.getText() + " down the lane.");
            int option2 = JOptionPane.showConfirmDialog(null, "Want to play again?", "Baa Baa Black Sheep Mad Libs", JOptionPane.YES_NO_OPTION);
            if (option2 == JOptionPane.YES_OPTION) {
                madLibs();
            } else {
                System.out.println("");
                System.out.println("Thanks for playing!");
            }


        } else {
            System.out.println("Game Over");
        }

    }
}
