package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class TennisGame {

    private String name1;
    private String name2;
    private int score1;
    private int score2;
    private String s1Str;
    private String s2Str;

    public String getName1(){return name1;}
    public String getName2(){return name2;}
    public int getScore1(){return score1;}
    public int getScore2(){return score2;}
    public String getS1Str(){return s1Str;}
    public String getS2Str(){return s2Str;}

    public void setNames(String n1, String n2){
        name1 = n1;
        name2 = n2;
    }

    public void setScores(int s1, int s2){
        if((s1 < 0 || s1 > 4) || (s2 < 0 || s2 >4)){
            score1 = 0;
            score2 = 0;
            s1Str = "error";
            s2Str = "error";
        }
        else if(s1 == 4 && s2 == 4){
            score1 = 0;
            score2 = 0;
            s1Str = "error";
            s2Str = "error";
        }
        else{
            score1 = s1;
            score2 = s2;
            switch(s1){
                case 0:
                    s1Str = "Love";
                    break;
                case 1:
                    s1Str = "15";
                    break;
                case 2:
                    s1Str = "30";
                    break;
                case 3:
                    s1Str = "45";
                    break;
                case 4:
                    s1Str = "Game";
                    break;
            }
            switch(s2){
                case 0:
                    s2Str = "Love";
                    break;
                case 1:
                    s2Str = "15";
                    break;
                case 2:
                    s2Str = "30";
                    break;
                case 3:
                    s2Str = "45";
                    break;
                case 4:
                    s2Str = "Game";
                    break;
            }

        }

    }

    public void getGameInfo(){
        System.out.println("Players: " + name1 + " vs. " + name2);
        System.out.println("Number score: " + score1 + ", " + score2);
        System.out.println("String score: " + s1Str + " " + s2Str);
    }
}
