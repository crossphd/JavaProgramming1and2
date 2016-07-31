package Chapter4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class NextMonth {

    public static void main(String[] args){

//        Use GregorianCalendar to get current date
        Calendar mycal = new GregorianCalendar();

//        Calculate all the variables for day of/in month & year
        int dayOfMonth = mycal.get(Calendar.DAY_OF_MONTH);
        int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dayOfYear = mycal.get(Calendar.DAY_OF_YEAR);
        int daysInYear = mycal.getActualMaximum(Calendar.DAY_OF_YEAR);

//        Finally calculate days left in month/year
        int daysLeftMonth = daysInMonth - dayOfMonth;
        int daysLeftYear = daysInYear - dayOfYear;

        System.out.println("Days left in month: " + daysLeftMonth);
        System.out.println("Days left in year: " + daysLeftYear);
    }
}
