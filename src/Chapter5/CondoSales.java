package Chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */

public class CondoSales {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

//        format money correctly
        DecimalFormat money = new DecimalFormat("#.00");

        int condoNum;
        String granite;
        int grandTotal = 0;

//        first question and input
        System.out.println("There are 3 types of condos:");
        System.out.println("1. Park View");
        System.out.println("2. Golf Course View");
        System.out.println("3. Lake View");
        System.out.print("Enter the number for the type you're interested in: ");
        condoNum = scan.nextInt();

//        first if statement to determine correct input
        if (condoNum == 1 || condoNum == 2 || condoNum == 3) {
            if (condoNum == 1) grandTotal = 150000;
            else if (condoNum == 2) grandTotal = 170000;
            else if (condoNum == 3) grandTotal = 210000;

//            ask about counter top and adjust cost
            System.out.print("Do you want granite counter tops ('yes' or 'no')? ");
            granite = scan.next();
            if ("yes".equals(granite)) grandTotal += 4000;

//            reveal final cost
            System.out.println("The cost of that condo is $" + money.format(grandTotal));

        }
        else System.out.println("That is not a valid entry.");












    }


}
