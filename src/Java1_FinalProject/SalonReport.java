package Java1_FinalProject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class SalonReport {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Service[] svcs = new Service[6];

        svcs[0] = new Service("Cut     ", 8.00, 15);
        svcs[1] = new Service("Shampoo ", 4.00, 10);
        svcs[2] = new Service("Manicure", 18.00, 30);
        svcs[3] = new Service("Style   ", 48.00, 55);
        svcs[4] = new Service("Permanent", 18.00, 35);
        svcs[5] = new Service("Trim     ", 6.00, 5);

        int sortOption = 1;

        do{
            System.out.println("Select the number corresponding to how you would like to sort the Salon Menu " +
                    "\n1) Sort by Service Description " +
                    "\n2) Sort by Price " +
                    "\n3) Sort by Time (Minutes) " +
                    "\n0) enter 0 to Exit.");
            int input = scan.nextInt();
            if(input == 0){
                System.out.println("You selected 0 to exit, have a nice day.");
                break;
            }

            else if(input == 1){
                Arrays.sort( svcs , new SortByService() );
                System.out.println("\nAfter sorting Salon Menu by Service Description:");
                for (Service s : svcs)
                    System.out.println(s.getService() + "\t\t  $" + s.getPrice() + "\t\t  "+ s.getMins());
                System.out.println();
            }

            else if(input == 2){
                Arrays.sort(svcs);
                System.out.println("\nAfter sorting Salon Menu by Price:");
                for (Service s : svcs)
                    System.out.println(s.getService() + "\t\t  $" + s.getPrice() + "\t\t  "+ s.getMins());
                System.out.println();
            }

            else if(input == 3){
                Arrays.sort( svcs , new SortByTime() );
                System.out.println("\nAfter sorting Salon Menu by Time:");
                for (Service s : svcs)
                    System.out.println(s.getService() + "\t\t  $" + s.getPrice() + "\t\t  "+ s.getMins());
                System.out.println();
            }

        }
        while(sortOption != 0);
    }
}

//below class will sort by service
class SortByService implements Comparator<Service>{
    @Override
    public int compare(Service s1, Service s2)    {
        return s1.getService().compareTo(s2.getService());
    }
}

//and this one will sort by time in minutes
class SortByTime implements Comparator<Service>{
    @Override
    public int compare(Service t1, Service t2)    {
        return ( t1.getMins() - t2.getMins());
    }
}

