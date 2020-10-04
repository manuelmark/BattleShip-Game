import sofia.micro.*;
import sofia.battleship.*;
// -------------------------------------------------------------------------
/**
 *  Testing MyStrategy (which is awesome!).
 *  Summarize what your test objectives are.
 *
 *  To ensure that MyStrategy causes much PWNage to opponent. 
 *  @author Mark Manuel (mmark95)
 *  @version (2016.08.04)
 */
public class MyStrategyTest extends TestCase
{
    //~ Fields ................................................................
    private TestableGameState tgs;
    private MyStrategy uberness;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MyStrategyTest test object.
     */
    public MyStrategyTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        tgs = new TestableGameState();
        uberness = new MyStrategy();
        uberness.newGame();
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

    /**
     * Tests whether one can play deviously.
     * Turns out one can't.
     */
    public void testcanPlayDeviously()
    {
        boolean devious = uberness.canPlayDeviously();
        assertFalse(devious);

    }

    /**
     * Tests whether one is making (un)lousy moves
     * by calling callNextShot.
     */
    public void testcallNextShot()
    {
        uberness.callNextShot(tgs);
        assertEquals(0, tgs.getOpponentsBoard().getLastAttackX());
        assertEquals(0, tgs.getOpponentsBoard().getLastAttackY());
        CallShotMove shot2 = uberness.callNextShot(tgs);
        System.out.println(shot2.getX());
        assertEquals(1, shot2.getX());
        assertEquals(0, shot2.getY());

        CallShotMove shot3 = null;
        for (int i = 2; i <= 10; i++)
        {
            shot3 = uberness.callNextShot(tgs);
        }

        assertEquals(0, shot3.getX());
        assertEquals(1, shot3.getY());

    }

    /**
     * Tests whether one has an epic username.
     * Turns out one does.
     */
    public void testgetName()
    {
        String name = uberness.getName();
        assertEquals("mmark95", name);

    }

    /**
     * Tests ship placement. 
     */
    public void testplaceShips()
    {
        ShipPlacementMove moveIt = uberness.placeShips(tgs);
        assertEquals(5, moveIt.getShips().size());
        assertTrue(moveIt.isValid());
    }
}
