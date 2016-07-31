package Chapter11;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class UseAuto {

    public static void main(String[] args){
        Chevy car1 = new Chevy();
        Ford car2 = new Ford();

        car1.setPrice();
        car2.setPrice();
        car1.setMake("Chevy Silverado");
        car2.setMake("Ford Mustang");


        System.out.println("The 1st car is a " + car1.getMake() + " for $" + car1.getPrice());
        System.out.println("The 2nd car is a " + car2.getMake() + " for $" + car2.getPrice());
    }
}
