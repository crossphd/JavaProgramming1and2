package Package1;

/**
 * Created by chris_of4t8hg on 6/30/2016.
 */
public class Sandwich {

    private String mainIngred;
    private String bread;
    private double price;

    public Sandwich(){
        mainIngred = "Turkey";
        bread = "Rye";
        price = 5.99;
    }

    public void setMainIngred(String ingredInput){
        mainIngred = ingredInput;
    }

    public String getMainIngred(){
        return mainIngred;
    }

    public void setBread(String breadInput){
        bread = breadInput;
    }

    public String getBread(){
        return bread;
    }

    public void setPrice(double priceInput){
        price = priceInput;
    }

    public double getPrice(){
        return price;
    }

}
