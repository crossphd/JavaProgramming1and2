package Chapter11;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public abstract class Auto {

    private String make;
    protected double price;

    public void setMake(String m){
        make = m;
    }

    public abstract void setPrice();

    public String getMake(){
        return make;
    }

    public double getPrice(){
        return price;
    }
}
