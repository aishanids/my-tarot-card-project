package main.java.com.example.tarot.service.com.example.tarot.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarotService {

    public List<String> shuffleDeck() {
        //Step 1: Create the deck
        List<String> deck = new ArrayList<>();
        for (int i = 1; i <= 78; i++) {
            deck.add("Card " + i);
        }
        return deck;
    }

    Collections.shuffle(deck);


    System.out.println("Please choose what spread you would like: /nSingle Card /nThree-Spread" +
            "/nCeltic Cross");
}
