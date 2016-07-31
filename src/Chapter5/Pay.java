package Chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Pay {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        format money correctly
        DecimalFormat money = new DecimalFormat("#.00");

        int skillLevel;
        double rate = 0;
        double totHours;
        double regHours = 0;
        double oTHours = 0;
        double regPay = 0;
        double oTPay = 0;
        double deduct = 0;
        double totPay = 0;

        System.out.println("Enter your skill level (1, 2, or 3): ");
        skillLevel = scan.nextInt();

//        switch statement to assign rate
        switch(skillLevel){
            case 1:
                rate = 17.00;
                break;
            case 2:
                rate = 20.00;
                break;
            case 3:
                rate = 22.00;
                break;
            default:
                System.out.println("You did not choose a valid skill level.");
        }

        System.out.println("How many hours did you work? ");
        totHours = scan.nextInt();

//        determine pay based on reg and OT hours and rates
        if (totHours <= 40){
            regHours = totHours;
        }
        else{
            regHours = 40;
            oTHours = totHours - 40;
        }

        regPay = regHours * rate;
        oTPay = oTHours * (rate * 1.5);
        totPay = regPay + oTPay;


//        determine insurance for skill 2 and 3
        if (skillLevel == 2 || skillLevel == 3){
            System.out.println("Would you like medical insurance ('yes' or 'no')? ");
            String insMed = scan.next();
            if ("yes".equals(insMed)) deduct += 32.50;
            System.out.println("Would you like dental insurance ('yes' or 'no')? ");
            String insDent = scan.next();
            if ("yes".equals(insDent)) deduct += 20.00;
            System.out.println("Would you like long-term disability insurance ('yes' or 'no')? ");
            String insDis = scan.next();
            if ("yes".equals(insDis)) deduct += 32.50;

        }
//        retirement for skill 3 only
        if (skillLevel == 3){
            System.out.println("Would you to participate in the retirement plan ('yes' or 'no')? ");
            String insRet = scan.next();
            if ("yes".equals(insRet)) deduct += (totPay * .03);
        }

//        summary of info
        System.out.println();
        System.out.println("Summary based on your selections:");
        System.out.println("You worked " + totHours + " hours");
        System.out.println("Regular pay rate: $" + money.format(rate) + " per hour");
        System.out.println("Regular pay: $" + money.format(regPay));
        System.out.println("Overtime pay: $" + money.format(oTPay));
        System.out.println("Total pay: $" + money.format(totPay));
        System.out.println("Total deductions: $" + money.format(deduct));

//        deduction error or print total net pay
        if (deduct > totPay){
            System.out.println("Error: total deductions exceeds paid amount.");
        }
        else System.out.println("Your net pay is: $" + money.format(totPay - deduct));




    }


}
