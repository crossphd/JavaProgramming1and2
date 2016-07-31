package Chapter11;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class Life extends Insurance {

    public Life(){
        super.Insurance("life insurance");
    }

    public void setCost(){
        cost = 36;
    }

    public void display(){
        System.out.println("The monthly cost of " + getType() + " is $" + getCost());
    }
}
