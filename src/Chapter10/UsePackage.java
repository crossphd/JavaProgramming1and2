package Chapter10;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class UsePackage {

    public static void main(String[] args){

        Package p1 = new Package(4, 'T');
        Package p2 = new Package(9, 'A');
        Package p3 = new Package(24, 'M');
        InsuredPackage p4 = new InsuredPackage(7, 'T');
        InsuredPackage p5 = new InsuredPackage(19, 'A');
        InsuredPackage p6 = new InsuredPackage(10, 'M');


        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();
        System.out.println();
        p4.display();
        System.out.println();
        p5.display();
        System.out.println();
        p6.display();
    }
}
