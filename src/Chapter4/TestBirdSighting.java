package Chapter4;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class TestBirdSighting {

    public static void main(String[] args){

        BirdSighting sighting1 = new BirdSighting();
        BirdSighting sighting2 = new BirdSighting("Sparrow", 3, "07-03-2016");

        sighting1.display();
        sighting2.display();
    }
}
