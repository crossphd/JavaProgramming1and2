package Chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class BabysittingJob {

    Scanner scan = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("#.00");

    int jobNum;
    int babysitterCode;
    String babysitterName;
    int numOfChildren;
    double hours;
    double fee;

    public BabysittingJob(){
        jobNum();
        sitter();
        children();
        hours();
        fee();

    }

//    method to get and determine job number
    public void jobNum(){

//        get year and conver to 2 digit
        System.out.println("Enter the year (e.g., '2016'):");
        int year = scan.nextInt();
        while (year < 2013 || year > 2025){
            System.out.println("Please enter a year between 2013 and 2025:");
            year = scan.nextInt();
        }
//        make it 2 digit year
        year = year - 2000;

//        get job num
        System.out.println("Enter the job number (e.g., 24):");
        int job = scan.nextInt();
        while (job < 0 || job >= 9999){
            System.out.println("Job number must be between 1 and 9999:");
            job = scan.nextInt();
        }

//        determine new job number based on 2 digit year and 4 digit job num
        jobNum = year * 10000 + job;
    }

//    method to collect and determine sitter
    public void sitter(){
        System.out.println("Enter the baby sitter's code (1, 2, or 3):");
        int code = scan.nextInt();
        while (code < 0 || code > 3){
            System.out.println("The code must be 1, 2, or 3:");
            code = scan.nextInt();
        }
        babysitterCode = code;
        if (code == 1) babysitterName = "Cindy";
        else if (code == 2) babysitterName = "Greg";
        else babysitterName = "Marcia";

    }

//    number of kids
    public void children(){
        System.out.println("How many children?");
        int kids = scan.nextInt();
        while (kids < 0 || kids > 9) {
            System.out.println("Try again. How many children (up to 9)?");
            kids = scan.nextInt();
        }
        numOfChildren = kids;
    }
//    hours needed method
    public void hours(){
        System.out.println("How many hours?");
        int hrs = scan.nextInt();
        while (hrs < 0 || hrs > 12) {
            System.out.println("Try again, no more than 12. How many hours?");
            hrs = scan.nextInt();
        }
        hours = hrs;
    }
//    determine fee based on sitter, kids, and hours
    public void fee(){
        if (babysitterCode == 1){
            fee = 7.0 * numOfChildren * hours;
        }
        else if (numOfChildren == 1){
            fee = 9 * hours;
        }
        else if (numOfChildren > 1){
            fee = (9 * hours) + (4 * (numOfChildren - 1) * hours);
        }
    }

//    display summary of babysitting values
    public void display(){
        System.out.println();
        System.out.println("Summary of Babysitting Job:");
        System.out.println("Job number: " + jobNum);
        System.out.println("Babysitter: (" + babysitterCode + ") " + babysitterName);
        System.out.println("Details: " + numOfChildren + " children for " + hours + " hours");
        System.out.println("Total fee: $" + money.format(fee));
    }


}
