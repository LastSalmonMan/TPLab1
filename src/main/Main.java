package main;

/**
 * Created by mateusz on 09.10.17.
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Deck deck = new Deck(24);
            deck.showAll();
            System.out.println("------------------");
            deck.shuffle();
            deck.showAll();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
