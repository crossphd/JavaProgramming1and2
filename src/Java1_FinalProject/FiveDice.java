package Java1_FinalProject;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS163AA - Java Programming: Level I - Class # 14887
 */
public class FiveDice {

    public static void main(String[] args){

        Die[] player = new Die[5];
        Die[] comp = new Die[5];

        System.out.print("Player throws: ");
        for(int x = 0; x < player.length; x++){
            player[x] = new Die();
            System.out.print(player[x].getValue() + " ");
        }

        System.out.println();
        System.out.print("Computer throws: ");
        for(int x = 0; x < comp.length; x++){
            comp[x] = new Die();
            System.out.print(comp[x].getValue() + " ");
        }
    }
}
