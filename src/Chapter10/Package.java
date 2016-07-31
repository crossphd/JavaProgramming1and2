package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class Package {

    protected int packageWeight;
    protected double shipCost;
    protected char shipMethod;


    private char[] method = new char[]{'A','T','M'};

    private double[] A = new double[]{2.00, 3.00, 4.50};
    private double[] T = new double[]{1.50, 2.35, 3.25};
    private double[] M = new double[]{.50, 1.50, 2.15};

    public Package(int w, char m){
        packageWeight = w;
        shipMethod = m;
        calculateCost();

    }


    public double calculateCost(){
        if(packageWeight < 9){
            if(shipMethod == 'A') shipCost = A[0];
            else if (shipMethod == 'T') shipCost = T[0];
            else if (shipMethod == 'M') shipCost = M[0];
            else System.out.println("Invalid shipping method");
        }
        else if(packageWeight >= 9 && packageWeight <= 16){
            if(shipMethod == 'A') shipCost = A[1];
            else if (shipMethod == 'T') shipCost = T[1];
            else if (shipMethod == 'M') shipCost = M[1];
            else System.out.println("Invalid shipping method");
        }
        else{
            if(shipMethod == 'A') shipCost = A[2];
            else if (shipMethod == 'T') shipCost = T[2];
            else if (shipMethod == 'M') shipCost = M[2];
            else System.out.println("Invalid shipping method");
        }
        return shipCost;

    }

    public void display(){
        System.out.println("Weight(oz): " + packageWeight + ", " +
                "\nShipping Method: " + shipMethod + ", " +
                "\nShipping Cost: " + shipCost);
    }

    public double getShipCost(){
        return shipCost;
    }
}
