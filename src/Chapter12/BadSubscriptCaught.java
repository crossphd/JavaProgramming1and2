package Chapter12;

import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class BadSubscriptCaught {

    public static void main(String[] args){

        String[] names = new String[]{"Bob", "Mike", "Sam", "Eric",
                "Sally", "Tom", "Audrey", "Erica", "Jen", "Michelle"};

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number for which name to return: ");
        int input = scan.nextInt();

        try{
            System.out.println(names[input]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There was not a name for that number.");
        }
    }
}
