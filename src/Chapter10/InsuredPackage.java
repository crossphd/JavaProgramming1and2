package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class InsuredPackage extends Package {

    private double insCost;

    public InsuredPackage(int w, char m){
        super(w,m);
        if(getShipCost() <= 1.0) insCost = 2.45;
        else if(getShipCost() > 1.0 && getShipCost() <= 3.0) insCost = 3.95;
        else if(getShipCost() > 3.0) insCost = 5.55;

    }


    public void display(){
        System.out.println("Weight(oz): " + packageWeight + ", " +
                "\nShipping Method: " + shipMethod + ", " +
                "\nShipping Cost: " + (shipCost + insCost));
    }

}
