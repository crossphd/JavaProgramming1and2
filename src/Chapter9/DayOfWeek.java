package Chapter9;

import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class DayOfWeek {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("The days of the week are: ");
        for(DaysOfWeek day : DaysOfWeek.values()){
            System.out.print(day + " ");
        }
        System.out.println();
        System.out.println("Enter one of the above days (first 3 letters of the day)");
        String input = scan.nextLine().toUpperCase();

        DaysOfWeek day = DaysOfWeek.valueOf(input);

        System.out.println(day.getHours(day));


    }

    enum DaysOfWeek {

        SUN, MON, TUE, WED, THU, FRI, SAT;

//        added a method to the enum to display business hours
        public String getHours(DaysOfWeek d){
            String hours = "";
            if(d == SUN) hours = "Business hours are 11 AM - 5 PM";
            else if(d == MON || d == TUE || d == WED || d == THU ||  d == FRI){
                hours = "Business hours are 9 AM - 9 PM";
            }
            else if(d == SAT) hours = "Business hours are 10 AM - 6 PM";

            return hours;
        }
    }
}
