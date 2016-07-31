package Java1_FinalProject;

import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class RandomGuess3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int guess = 0;
        boolean play = true;
        int number = (int)((Math.random() * 1000) + 1);

        do{
            do{
                System.out.println("Guess a number between 1 and 1000");
                guess = scan.nextInt();
                if(guess > 0 && guess <= 1000){
                    if(guess == number){
                        System.out.println("Correct, you won!");
                        System.out.println();
                        System.out.println("Would you  like to play again('yes' or 'no')?");
                        scan.nextLine();
                        String input = scan.nextLine();
                        if("no".equals(input.toLowerCase())){
                            play = false;
                            break;
                        }
                    }
                    else if(guess > number){
                        System.out.println("The guess is too high.");
                    }
                    else if(guess < number){
                        System.out.println("The guess was too low.");
                    }
                }
                else System.out.println("That wasn't between 1 and 1000");


            }while(guess != number && play);


        }while(play);

        System.out.println("Thanks for playing");

    }
}