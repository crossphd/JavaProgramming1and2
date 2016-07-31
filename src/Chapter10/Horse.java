package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class Horse {

    private String name;
    private String color;
    private int birthYr;

    public Horse(String n, String  c, int b){
        name = n;
        color = c;
        birthYr = b;
    }

    public void getHorseInfo(){
        System.out.println("Name: "+ name + ", Color: " + color + ", BirthYear: " + birthYr);
    }

    public void setName(String n){
        name = n;
    }

    public void setColor(String c){
        color = c;
    }

    public void setYear(int y){
        birthYr = y;
    }

    public String getName(){return name;}

    public String getColor(){return color;}

    public int getBirthYr(){return birthYr;}
}
