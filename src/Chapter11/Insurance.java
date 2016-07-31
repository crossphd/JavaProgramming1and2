package Chapter11;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public abstract class Insurance {

    private String type;
    protected double cost;

    public void Insurance(String type){
        this.type = type;
    }

    public abstract void setCost();

    public abstract void display();

    public String getType(){
        return type;
    }

    public double getCost(){
        return cost;
    }
}
