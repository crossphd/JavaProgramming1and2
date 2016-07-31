package Chapter4;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class TestBirdSighting2 {

    public static void main(String[] args){

        BirdSighting2 sighting1 = new BirdSighting2();
        BirdSighting2 sighting2 = new BirdSighting2("Sparrow", 3, "07-03-2016");

        sighting1.display();
        sighting2.display();
    }
}
