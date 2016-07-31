package Chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class CondoSales2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        display money in the correct format
        DecimalFormat money = new DecimalFormat("#.00");

        int condoNum;
        int garage;
        int grandTotal = 0;
        String expedite;

//        first question and input
        System.out.println("There are 3 types of condos:");
        System.out.println("1. Park View");
        System.out.println("2. Golf Course View");
        System.out.println("3. Lake View");
        System.out.print("Enter the number for the type you're interested in: ");
        condoNum = scan.nextInt();

//        first if statement to determine correct input
        if (condoNum == 1 || condoNum == 2 || condoNum == 3) {
//            next if statement to assign cost
            if (condoNum == 1) grandTotal = 150000;
            else if (condoNum == 2) grandTotal = 170000;
            else if (condoNum == 3) grandTotal = 210000;

//            ask about garage and adjust cost
            System.out.println();
            System.out.println("Would you like a garage or parking space?");
            System.out.println("1. Garage");
            System.out.println("2. Parking Space");
            System.out.print("Enter the number for the type you're interested in: ");
            garage = scan.nextInt();
            if (garage == 1) grandTotal += 5000;
            else if (garage != 2) System.out.println("Invalid input, option defaulted to Parking space.");

//            expedited construction question
            System.out.println();
            System.out.print("Do you want expedited construction ('yes' or 'no')? ");
            expedite = scan.next();
            if ("yes".equals(expedite)) grandTotal += 2000;

//            reveal final cost
            System.out.println();
            System.out.println("The cost of that condo is $" + money.format(grandTotal));

        } else System.out.println("That is not a valid entry.");

    }
}
