package Java1_FinalProject;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Die {

    private int dieValue;
    final private int HIGHEST_DIE_VALUE = 6;
    final private int LOWEST_DIE_VALUE = 1;

    public Die(){

        this.dieValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
    }

    public int getValue(){
        return dieValue;
    }
}
