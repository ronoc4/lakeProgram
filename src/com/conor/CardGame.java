package com.conor;

/**
 * Created by Conor Budge on 3/1/16.
 *
 * Imagine you are writing a program which plays a card game.
 * In one part of the program, you will need a deck of cards from which random cards are drawn.
 * Write a program which can simulate a shuffled deck of cards.
 * Use a data structure to store each of the cards in a standard deck of cards.
 * Your program should be able to deal a card at random from the deck.
 */
public class CardGame {
    public static void main(String[] args) {

//Create to String arrays with the suits and cards (no jokers)
        String[] suit = {"spades", "hearts", "diamonds", "clubs"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};

        // Storing arrays into ints, and multiplying the together
        int suits = suit.length;
        int card = cards.length;
        int total = suits * card;

        // initiallize deck
        String[] deck = new String[total]; //total will be 52 cards
        for (int i = 0; i < card; i++) {
            for (int j = 0; j < suits; j++) {
                deck[suits * i + j] = cards[i] + " of " + suit[j];
            }
        }

        // The cards are shuffled together with the random value
        for (int i = 0; i < total; i++) {
            int r = i + (int) (Math.random() * (total-i));
            String stringConvert = deck[r];
            deck[r] = deck[i];
            deck[i] = stringConvert;
        }

        // print  out shuffled deck
        for (int i = 0; i < total; i++) {
            System.out.println(deck[i]);
        }
    }
}
