package Chapter12;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class Product {

    int prodNum;
    double price;

    public Product(int pn, double pr) throws ProductException{

        if(pn < 100 || pn > 999){
            throw(new ProductException("Error: The product number must be 3 digits."));
        }
        else if(pr < .01 || pr > 1000.0){
            throw(new ProductException("Error: Price must be under greater than .01 and less that 1000."));
        }
        else{
            prodNum = pn;
            price = pr;
            System.out.println("Product successfully created: " + pn + " - " + pr);
        }

    }

}
