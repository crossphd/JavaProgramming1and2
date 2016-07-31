package Chapter11;

/**
 * Created by Christopher Ross - CHR2261492
 * CIS263AA - Java Programming: Level II - Class # 15222
 */
public class UsePlayer {

    public static void main(String[] args){

        Child child = new Child();
        Musician musician =  new Musician();
        Actor actor = new Actor();

        child.play();
        musician.play();
        actor.play();
    }
}
