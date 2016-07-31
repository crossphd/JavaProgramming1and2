package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class DoublesTennisGame extends TennisGame {

    private String partner1;
    private String partner2;

    public void setNames(String n1, String p1, String n2, String p2){
        super.setNames(n1,n2);
        partner1 = p1;
        partner2 = p2;
    }

    public void getGameInfo(){
        super.getGameInfo();
        System.out.println("Partners: " + partner1 + ", " + partner2);

    }
}
