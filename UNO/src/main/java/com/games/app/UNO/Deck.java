package com.games.app.UNO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
	deck = new ArrayList<Card>(); 
	initializeDeck();
	}

	private void initializeDeck() {
		for(Colors color:Colors.values()) {
			for(Values value:Values.values()) {
				//Adding black cards
				if (color == Colors.BLACK) {
					for(int i=0; i<8;i++) {
						if(i<=3) 
							deck.add(new Card(Colors.BLACK,Values.WILD));
						else {
							deck.add(new Card(Colors.BLACK,Values.WILD_DRAW_FOUR));
						}
					}
				}
				//Adding zero cards
				else if (value == Values.ZERO) {
					deck.add(new Card(color,Values.ZERO));
				}
				//everything else
				else {
					deck.add(new Card(color,value));
				}
			}
		}
	}

	public void shuffleDeck() {
		Random random = new Random();
		// Shuffle with Fisher-Yates Algorithm 
		for(int i = deck.size()-1;i >= 0;i--){
			int randNo = random.nextInt(i+1);
			swap(deck,i,randNo);
		}
	}
	
	
}
