package Chapter8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class ConvertDate {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int day = 0;
        int month = 0;
        int year = 0;
        String rest = "";
        int[] daysByMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        do{
            System.out.print("Enter any date (e.g., 10/28/2015): ");
            String entry = scan.nextLine();

//            separate month and rest of string, then set x to length to stop iteration
            for(int x = 0; x < entry.length(); x++){
                if(entry.charAt(x) == '/'){
                    month = Integer.parseInt(entry.substring(0, x));
                    rest = entry.substring(x + 1, entry.length());
                    x = entry.length();
                }
            }

//            separate day and year
            for(int y = 0; y < rest.length(); y++)
                if(rest.charAt(y) == '/') {
                    day = Integer.parseInt(rest.substring(0, y));
                    year = Integer.parseInt(rest.substring(y+1, rest.length()));
                }

//            correct for leap year
            if((month == 2) && ((year % 100 != 0 || year % 4 == 0) || (year % 400 == 0))){
                daysByMonth[1] = 29;
            }

//            format date (to use to create a Date variable and display with SimpleDateFormat below)
            if(year >= 1900 ) year -= 1900;

//            subtract one from month to match counting from 0
            month -= 1;
        }
//        while clause assures day and month are correct
        while(month < 0 || month > 11 || day < 1 || day > daysByMonth[month]);

//        create and format date
        Date date = new Date(year, month, day);
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        GregorianCalendar cal = new GregorianCalendar(year, month, day);
        int dayInYear = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println(sdf.format(date) + " is day " + dayInYear + " in the year.");

    }
}
