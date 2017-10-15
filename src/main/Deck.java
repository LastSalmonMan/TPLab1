package main;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mateusz on 09.10.17.
 */
public class Deck
{
    private Card [] deck;
    private int numberOfCards;

    Deck(int numberOfCards) throws NumberOfCardsException
    {
        this.numberOfCards = numberOfCards;
        if(numberOfCards == 52)
        {
            fill(numberOfCards);
        }
        else if(numberOfCards == 32)
        {
            fill(numberOfCards);
        }
        else if(numberOfCards == 24)
        {
            fill(numberOfCards);
        }
        else
            throw new NumberOfCardsException();
    }

    private void fill(int numberOfCards)
    {
        int i=0, j;
        deck = new Card[numberOfCards];
        for(Card.Color c : Card.Color.values())
        {
            j=0;
            for(Card.Number n : Card.Number.values())
            {
                if(j < numberOfCards/4)
                {
                    //System.out.println(c);
                    //System.out.println(n);
                    deck[i] = new Card();
                    deck[i].color = c;
                    deck[i].number = n;
                    i++;
                    j++;
                }
            }
        }
    }

    public Card topDeck()
    {
        Card tmp = deck[0];
        return tmp;
    }

    public void showAll()
    {
        int i;
        for(i=0;i<numberOfCards;i++)
        {
            System.out.println(deck[i].number + " " + deck[i].color);
        }
    }

    public void shuffle()
    {
        int i;
        ArrayList<Card> arrayList = new ArrayList<Card>();
        Random generator = new Random();
        for(i=0;i<numberOfCards;i++)
        {
            arrayList.add(deck[i]);
        }

        for (i=0;i<numberOfCards;i++)
        {
            int index = Math.abs(generator.nextInt() % arrayList.size());
            deck[i] = arrayList.get(index);
            arrayList.remove(index);
        }
    }

    public int getNumberOfCards()
    {
        return numberOfCards;
    }
}
