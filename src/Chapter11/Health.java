package Chapter11;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class Health extends Insurance {

    public Health(){
        super.Insurance("health insurance");
    }

    public void setCost(){
        cost = 196;
    }

    public void display(){
        System.out.println("The monthly cost of " + getType() + " is $" + getCost());
    }
}
