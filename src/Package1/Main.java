package Package1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] iArray = new int[8];
        for(int i = 0; i < 8;){
            int o = rand.nextInt(26);
            if(!(Arrays.asList(iArray).contains(o))){
                iArray[i] = o;
                System.out.print( o + "\t");
                i++;
            }


        }





    }
}




