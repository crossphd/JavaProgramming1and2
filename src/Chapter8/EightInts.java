package Chapter8;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class EightInts {

    public static void main(String[] args){

        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for(int x = 0; x < 8; x++){
            System.out.print(list[x] + " ");
        }

        System.out.println();

        for(int x = list.length - 1; x >= 0; x--){
            System.out.print(list[x] + " ");
        }

    }
}
