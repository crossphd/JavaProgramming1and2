package Java1_FinalProject;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Service implements Comparable<Service> {

    private String service;
    private double price;
    private int mins;

    public Service(String s, Double p, int m){
        service = s;
        price = p;
        mins = m;
    }

    public String getService(){
        return service;
    }

    public double getPrice(){
        return price;
    }

    public int getMins(){
        return mins;
    }

//    create default sort method to compare by price
    public int compareTo(Service o) {
        return new Double(this.price).compareTo(new Double(o.price));
    }
}
