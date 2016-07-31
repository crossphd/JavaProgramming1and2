package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class DemoTennisGames {

    public static void main(String[] args){

        TennisGame g1 = new TennisGame();
        TennisGame g2 = new TennisGame();
        TennisGame g3 = new TennisGame();
        DoublesTennisGame g4 = new DoublesTennisGame();
        DoublesTennisGame g5 = new DoublesTennisGame();
        DoublesTennisGame g6 = new DoublesTennisGame();

        g1.setNames("Paul", "Ringo");
        g2.setNames("Ren", "Stimpy");
        g3.setNames("Luke", "Vadar");
        g4.setNames("Serena", "Venus", "Lavern", "Shirley");
        g5.setNames("Cop1", "Cop2", "Bonnie", "Clyde");
        g6.setNames("Mickey", "Goofy", "Minney", "Pluto");

        g1.setScores(0,4);
        g2.setScores(5,2);
        g3.setScores(4,4);
        g4.setScores(3,4);
        g5.setScores(8,4);
        g6.setScores(4,4);

        g1.getGameInfo();
        System.out.println();
        g2.getGameInfo();
        System.out.println();
        g3.getGameInfo();
        System.out.println();
        g4.getGameInfo();
        System.out.println();
        g5.getGameInfo();
        System.out.println();
        g6.getGameInfo();


    }
}
