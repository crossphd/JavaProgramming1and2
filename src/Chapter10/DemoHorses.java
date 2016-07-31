package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class DemoHorses {

    public static void main(String[] args){

        Horse horse1 = new Horse("Henry", "black", 2005);
        RaceHorse horse2 = new RaceHorse("Speedy", "brown", 2012, 4);

        horse1.getHorseInfo();
        System.out.println();
        horse2.getHorseInfo();
    }
}
