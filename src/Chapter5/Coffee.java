package Chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Coffee {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //like i usually use in my assignments, displaying money in the correct format
        DecimalFormat money = new DecimalFormat("#.00");

        int item;
        double total = 0;
        int optionNum = 1;

//        since only 3 options allowed, used a do while loop from chapter 6
//        which increments the optionNum and stops after 3 selections
        do {
            printMenu();
            item = scan.nextInt();
            optionNum++;
            switch (item) {
                case 0:
                    break;
                case 1:
                    total += 1.99;
                    break;
                case 2:
                    total += 2.50;
                    break;
                case 3:
                    total += 2.15;
                    break;
                default:
                    System.out.println("Invalid input, select a menu number or 0 to exit.");
            }
        } while (item != 0 && optionNum <= 3);

        System.out.println("Your total is $" + money.format(total));

    }
    //method to display menu; I tried to replicate the actual sign
    public static void printMenu(){
        System.out.println();
        System.out.println("Please select from the following list.");
        System.out.println("______________________________");
        System.out.println("(1) American             $1.99");
        System.out.println("(2) Espresso             $2.50");
        System.out.println("(3) Latte                @2.15");
        System.out.println("______________________________");
        System.out.println();
        System.out.print("What number would you would like to order, enter 0 to exit: ");
        System.out.println();
    }

}