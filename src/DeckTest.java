import junit.framework.TestCase;

/**
 * Created by mateusz on 11.10.17.
 */
public class DeckTest extends TestCase
{
    Deck deck = null;
    int numberOfCards = 24;

    @Override
    public void setUp() throws Exception
    {
        deck = new Deck(numberOfCards);
    }

    public void testIsTopDeckAnAce() throws Exception
    {
        assertEquals("Testing method topDeck",Card.Number.ACE, deck.topDeck().number);
    }

    public void testTopDeckIsNotNull() throws Exception
    {
        assertNotNull(deck.topDeck());
    }

    public void testFail() throws Exception
    {
        fail();
    }
    /*
    public void testIsTopDeckNullAfterShuffle() throws Exception
    {
        deck.shuffle();
        assertNull(deck.topDeck());
    }
    */
    public void testIsDeckTheSameAfterShuffle() throws Exception
    {
        Deck tmp;
        tmp = deck;
        tmp.shuffle();
        assertSame(deck, tmp);
    }

    public void testIsNumberOfCardsTheSameAfterShuffle() throws Exception
    {
        Deck tmp;
        tmp = deck;
        tmp.shuffle();
        assertTrue(tmp.getNumberOfCards() == deck.getNumberOfCards());
    }

    @Override
    public void tearDown() throws Exception
    {

    }
}
