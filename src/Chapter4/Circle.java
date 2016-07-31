package Chapter4;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Circle {

    private double radius;
    private double diameter;
    private double area;

    public Circle(){
        radius = 1;
        diameter = radius * 2;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(double rad){
        radius = rad;
        diameter = radius * 2;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void getRadius(){
        System.out.println("The radius is " + radius);
    }

    public void getAll(){
        System.out.println("A circle with a radius of " + radius + " had a diameter of "
            + diameter + " and an area of " + area);
    }
}
