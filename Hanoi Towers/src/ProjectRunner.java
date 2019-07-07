/*
 * Here, we make a new GameWindow, and pass it a new TowerSolver, which we pass
 * the number of discs to use. To determine how many discs to use, declare a
 * local variable named discs which is five by default.
 */
public class ProjectRunner {

    public static void main(String[] args) {
        int discs = 5;
        TowerSolver tower = new TowerSolver(discs);
        // GameWindow game = new GameWindow(tower);
        if (args.length == 1) {
            discs = Integer.parseInt(args[0]);
        }

    }
}
