package Chapter12;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class ThrowProductException {

    public static void main(String[] args){

//        product number not 3 digits
        try{
            Product p1 = new Product(93, 9.99);
        }catch(ProductException e){
            System.out.println(e.getMessage());
        }

//        price over 1000
        try{
            Product p1 = new Product(193, 1119.99);
        }catch(ProductException e){
            System.out.println(e.getMessage());
        }

//        prince under .01
        try{
            Product p1 = new Product(493, -1.0);
        }catch(ProductException e){
            System.out.println(e.getMessage());
        }

//        correct
        try{
            Product p1 = new Product(973, 9.99);
        }catch(ProductException e){
            System.out.println(e.getMessage());
        }
    }
}
