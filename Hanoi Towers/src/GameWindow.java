import java.util.Observable;
import java.util.Observer;

/*
 * The GameWindow creates the Window in which we view the game, and observes
 * TowerSolver given to it by the main method present in ProjectRunner for
 * updates on when to animate everything shown on the screen
 *
 * the Window.
 */

public class GameWindow implements Observer {
    /**
     * Here are my fields, I had to assign a valye for my disc_height
     */
    public static final int DISC_HEIGHT = 5;

    //these fields are used, however they come from the given library from the instructor
    //that is how I am able to have a field of type Window and of type Shape
    /*
    private Window window;
    private Shape left;
    private Shape middle;
    private Shape right;
    */
    private TowerSolver game;
    private final int DISC_GAP = 2;
    // made these into constants because I can change these values once in my
    // fields and I don't have to retype everything within my constructor if I
    // want to change my tower dimensions
    private static final int Y_COORDINATE = 150;
    private static final int TOWER_WIDTH = 2;
    private static final int TOWER_HEIGHT = 50;

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub

    }

}
