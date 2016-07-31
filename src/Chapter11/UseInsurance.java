package Chapter11;

import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class UseInsurance {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Insurance ins;
        String input = "";


        do{
            System.out.println("What type of insurance are you interested in('life' or 'health')?");
            input = scan.nextLine();
            if("life".equals(input)){
                ins = new Life();
                ins.setCost();
                ins.display();
            }
            else if("health".equals(input)){
                ins = new Health();
                ins.setCost();
                ins.display();
            }
            else System.out.println("That was not a valid entry");

        }while(!("life".equals(input)) && !("health".equals(input)));

    }
}
