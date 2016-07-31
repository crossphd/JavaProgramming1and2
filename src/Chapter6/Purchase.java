package Chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class Purchase {

    DecimalFormat money = new DecimalFormat("#.00");
    Scanner scan = new Scanner(System.in);

    private int invoice;
    private double salePrice;
    private double salesTax;
    private double saleTotal;

    public Purchase(){
        setInvoice();
        setSalePrice();
        purchaseInfo();
    }

    public void setInvoice(){
        System.out.println("Enter the invoice number (1000-8000): ");
        int inv = scan.nextInt();
        while(inv < 1000 || inv > 8000){
            System.out.println("Incorrect entry, must be between 1000 & 8000.");
            System.out.println("Enter the invoice number:");
            inv = scan.nextInt();
        }
        this.invoice = inv;
    }

    public void setSalePrice(){
        System.out.println("Enter the sale price: ");
        double pri = scan.nextDouble();
        while(pri < 0){
            System.out.println("The sale price must be a positive integer.");
            System.out.println("Enter the sale price:");
            pri = scan.nextDouble();
        }
        this.salePrice = pri;
        this.salesTax = pri * .05;
        this.saleTotal = salePrice + salesTax;
    }

    public void purchaseInfo(){
        System.out.println();
        System.out.println("SALES RECEIPT");
        System.out.println("Invoice Number: " + invoice);
        System.out.println("Sale Price: $" + money.format(salePrice));
        System.out.println("Sales Tax: $" + money.format(salesTax));
        System.out.println("Total: $" + money.format(saleTotal));

    }


}
