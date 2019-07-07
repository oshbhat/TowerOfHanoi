
/*
 * The Towers on which we store Discs function as stacks. We extend the
 * LinkedStack we just implemented, since Towers offer a unique extension to a
 * normal stack - they only allow smaller discs to be placed on top of larger
 * ones.
 */
public class Tower extends LinkedStack<Disc> {
    private Position position;

}
