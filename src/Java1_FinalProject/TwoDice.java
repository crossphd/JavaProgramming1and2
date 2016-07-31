package Java1_FinalProject;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class TwoDice {

    public static void main(String[] args){

        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println(die1.getValue() + ", " + die2.getValue());
    }
}
