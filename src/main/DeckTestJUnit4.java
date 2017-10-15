package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mateusz on 11.10.17.
 */
public class DeckTestJUnit4
{
    Deck tester = null;

    @Before
    public void init()
    {
        try
        {
            tester = new Deck(24);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void IsTopDeckAnAce()
    {
        assertEquals(Card.Number.ACE, tester.topDeck().number);
    }

    @Test(expected = NumberOfCardsException.class)
    public void IsExceptionThrown() throws NumberOfCardsException
    {
        tester = new Deck(12);
    }

    @Test(timeout = 500)
    public void isShuffleTimeLessThen500()
    {
        tester.shuffle();
    }

    @Ignore
    public void IsIgnored() throws NumberOfCardsException
    {
        tester = new Deck(12);
    }

    //test by Kacper Smyczyk
    @Test
    public void shuffle() throws Exception{
        Deck temporaryDeck = tester;
        temporaryDeck.shuffle();
        assertEquals(tester, temporaryDeck);
    }


    @After
    public void free()
    {
        tester = null;
    }
}
