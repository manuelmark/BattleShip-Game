import sofia.battleship.*;

//-------------------------------------------------------------------------
/**
 *  A game of "Battleship".
 *
 *  @author Mark Manuel (mmark95)
 *  @version (2016.08.04)
 */
public class BattleshipGame extends Game
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new BattleshipGame object.
     */
    public BattleshipGame()
    {
        super();
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Create a strategy object representing your player strategy.
     * @return The strategy I want to use in this game.
     */
    public BattleshipStrategy createMyStrategy()
    {
        /*# Replace this with your own strategy */
        //return new BruteforceStrategy();
        System.out.println("yaay");
        return new MyStrategy();
    }


    // ----------------------------------------------------------
    /**
     * Create a strategy object representing your opponent's strategy.
     * @return The strategy my opponent will use in this game.
     */
    public BattleshipStrategy createOpponentsStrategy()
    {
        return new RandomStrategy();
    }
}
