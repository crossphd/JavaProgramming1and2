package Chapter4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class BirdSighting {

    private String species;
    private int numberSeen;
    private int dayOfYear;
    private int year;

    public BirdSighting(){
        species = "robin";
        dayOfYear = 1;
        numberSeen = 1;
        year = 2016;
    }

    public BirdSighting(String species, int number, String date) {
        this.species = species;
        numberSeen = number;

//        converts the string date to a Date and uses GregorianCalendar to determine dayOfYear
//        also uses try..catch to display date format exception
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Calendar gc = new GregorianCalendar();
        try {
            Date date2 = simpleDateFormat.parse(date);
            gc.setTime(date2);
            dayOfYear = gc.get(Calendar.DAY_OF_YEAR);
            year = gc.get(Calendar.YEAR);
            //System.out.println(dayOfYear);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void display(){
        System.out.println("On day " + dayOfYear + " of the year " + year + ", the following " +
                "bird(s) were seen:");
        System.out.println("Species: " + species + ", Number sighted: " + numberSeen);
        System.out.println();
    }


}
