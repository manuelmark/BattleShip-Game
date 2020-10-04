import sofia.battleship.*;
import sofia.util.Random;

//-------------------------------------------------------------------------
/**
 *  Le Strategy for being awesome at BattleShip! 
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it:
 *  Hit "Run".
 *
 *  @author Mark Manuel (mmark95)
 *  @version (2016.08.04)
 */
public class MyStrategy implements BattleshipStrategy
{
    //~ Fields ................................................................

    // instance fields--replace the example below with your own
    private int x = 0;
    private int y = 0;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MyStrategy object.
     * Does nothing.
     */
    public MyStrategy()
    {
        /*# Do any work to initialize your class here. */
    }


    /**
     * One does not simply play a game of BattleShip!
     * @return One actually does simply play a game of 
     * BattleShip.
     */
    public boolean canPlayDeviously()
    {
        return false;
    }

    /**
     * One does not simply start a game of BattleShip!
     * and make lousy moves. Hence, one call(s)NextShot (!).
     * 
     * 
     * @param currentState  dispalys the current state of the board.
     * @return The next epic move that one makes to PWN dumb AI's.
     */
    public CallShotMove callNextShot(GameState currentState)
    {

        if ((x == 0) && (y == 0))
        {
            CallShotMove next = new CallShotMove(x, y);
            x++;
            return next;
        }
        else if (x < 9)
        {
            CallShotMove next = new CallShotMove(x, y);
            x++;
            return next;
        }
        else 
        {
            CallShotMove next = new CallShotMove(x, y);
            y++;
            x = 0;
            return next;
        }
    }

    /**
     *One does not simply start a game of BattleShip!
     *and place one's ships in a predictable and boring fashion.
     *Unless, ofcourse one has only two hours left to submit one's 
     *assignment and one is tired and one just wants to get done with one's 
     *assignment. For times such as this, one creates and then call(s)
     *placeShips function (boooring!).
     *
     *@param currentState  dispalys the current state of the board.
     *@return the position of the ships that you tried to not place in place
     *in a predictable and boring fashion, but then you did. 
     */

    public ShipPlacementMove placeShips(GameState currentState)
    {
        ShipPlacementMove newPlacement = new ShipPlacementMove(currentState);
        Random random = new Random();
        int randy = random.nextInt(7);
        newPlacement.placeShip(ShipType.BATTLESHIP, randy, 0, true);
        randy = random.nextInt(6);        
        newPlacement.placeShip(ShipType.CARRIER, randy, 1, true);
        randy = random.nextInt(8);                
        newPlacement.placeShip(ShipType.DESTROYER, randy, 2, true);
        randy = random.nextInt(9);        
        newPlacement.placeShip(ShipType.PATROL, randy, 3, true);
        randy = random.nextInt(8);        
        newPlacement.placeShip(ShipType.SUBMARINE, randy, 4, true);
        return newPlacement;
    }

    /**
     * One does not simply start a game of BattleShip!
     * without... starting a game of BattleShip!. Hence, one calls 
     * newGame.
     */

    public void newGame()
    {
        //BattleshipGame bg = new BattleshipGame();
    }

    /**
     * One does not simply start a game of BattleShip!
     * without having an uberic username. Hence, one calls 
     * getName.
     * @return your awesome username (My awesome username, actually) 
     */
    public String getName()
    {
        return "mmark95";
    }
}
