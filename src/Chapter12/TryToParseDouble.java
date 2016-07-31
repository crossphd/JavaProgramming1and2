package Chapter12;

import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class TryToParseDouble {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String number;
        double num;

        try{
            System.out.println("Enter a double number (e.g., 1.4): ");
            number = scan.nextLine();
            num = Double.parseDouble(number);
        }
        catch(NumberFormatException e){
            num = 0;
            System.out.println("You didn't enter a double number.");
        }

        System.out.println("The number is " + num);


    }
}
