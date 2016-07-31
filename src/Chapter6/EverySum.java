package Chapter6;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class EverySum {
    public static void main(String[] args){

        int val = 1;
        int sum = 0;
        for (; val <= 50; val++){
            sum += val;
            System.out.println("The sum of all integers between 1 and " + (val) + " is " + sum);
        }
    }
}
