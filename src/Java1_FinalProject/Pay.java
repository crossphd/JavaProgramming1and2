package Java1_FinalProject;

import javax.swing.*;
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

        do{
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

        }while(skillLevel != 1 && skillLevel != 2 && skillLevel != 3);


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
            if(JOptionPane.showConfirmDialog(null, "Would you like medical insurance", "Medical Insurance",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) deduct += 32.50;
            if (JOptionPane.showConfirmDialog(null, "Would you like dental insurance", "Dental Insurance",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) deduct += 20.00;
            if (JOptionPane.showConfirmDialog(null, "Would you like long-term disability insurance", "Disability Insurance",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) deduct += 10.00;

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
            JOptionPane.showMessageDialog(null, "Error: total deductions exceeds paid amount.");
        }
        else JOptionPane.showMessageDialog(null, "Your net pay is: $" + money.format(totPay - deduct));




    }


}
