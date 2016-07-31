package Chapter7;

import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class BabyNameComparison {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st last name: ");
        String name1 = scan.nextLine();

        System.out.println("Enter the 2nd last name: ");
        String name2 = scan.nextLine();

        System.out.println("Enter the 3rd last name: ");
        String name3 = scan.nextLine();

        System.out.println("The 6 first last name combinations are:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);



    }
}
