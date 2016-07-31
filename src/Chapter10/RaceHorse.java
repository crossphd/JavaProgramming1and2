package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class RaceHorse extends Horse {

    private int numRaces;

    public RaceHorse(String n, String  c, int b, int r){
        super(n,c,b);
        numRaces = r;
    }

    public void getHorseInfo(){
        super.getHorseInfo();
        System.out.println("Number of Races: " + numRaces);

    }

    public void setNumRaces(int r){
        numRaces = r;
    }

    public int getNumRaces(){return numRaces;}

}
